package entity.domain;

import entity.domain.util.ImageUploader;
import entity.domain.util.JsfUtil;
import entity.domain.util.PaginationHelper;
import facade.ServiceListFacade;
import java.io.File;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.mail.MessagingException;
import javax.servlet.http.Part;

@Named("serviceListController")
@SessionScoped
public class ServiceListController implements Serializable {

    private Part image;
    static private String prevImage;
    private ServiceList current;
    private DataModel items = null;
    @EJB
    private facade.ServiceListFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;
    private ImageUploader imageUploader;

    public Part getImage() {
        return image;
    }

    public void setImage(Part image) {
        this.image = image;
    }

    public ServiceListController() {
    }

    public ServiceList getSelected() {
        if (current == null) {
            current = new ServiceList();
            selectedItemIndex = -1;
        }
        return current;
    }

    private ServiceListFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (ServiceList) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new ServiceList();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() throws MessagingException {
        imageUploader = ImageUploader.getInstance(image, "services");
        imageUploader.setImage(image);
        if (0 == imageUploader.doUpload()) {
            current.setImage(imageUploader.getAppInternalPath());
            try {
                getFacade().create(current);
                JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ServiceListCreated"));
                return prepareCreate();
            } catch (Exception e) {
                JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                return null;
            }
        } else {
            System.out.println("create function ........... Service is not added.");
        }
        return "/failed_to_create";
    }

    public String prepareEdit() {
        imageUploader = ImageUploader.getInstance(image, "services");
        current = (ServiceList) getItems().getRowData();
        prevImage = current.getImage();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() throws MessagingException {
        imageUploader = ImageUploader.getInstance(image, "services");
        if (prevImage != null) {
            new File(prevImage
                    .replace(imageUploader.getAppPath(),
                            imageUploader.getAbsolutePath())
            ).delete();
        }
        imageUploader.setImage(image);
        if (0 == imageUploader.doUpload()) {
            current.setImage(imageUploader.getAppInternalPath());
            try {
                getFacade().edit(current);
                JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ServiceListUpdated"));
                return "View";
            } catch (Exception e) {
                JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                return null;
            }
        }
        return "/failed_to_create";

    }

    public String destroy() {
        current = (ServiceList) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        imageUploader = ImageUploader.getInstance(image, "services");
        try {
            if (current.getImage() != null) {
                new File(current.getImage()
                        .replace(imageUploader.getAppPath(),
                                imageUploader.getAbsolutePath())
                ).delete();
            }
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ServiceListDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public ServiceList getServiceList(java.lang.Long id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = ServiceList.class)
    public static class ServiceListControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ServiceListController controller = (ServiceListController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "serviceListController");
            return controller.getServiceList(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ServiceList) {
                ServiceList o = (ServiceList) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + ServiceList.class.getName());
            }
        }

    }

}
