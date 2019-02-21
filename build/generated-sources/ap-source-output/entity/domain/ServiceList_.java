package entity.domain;

import entity.domain.ClinicService;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-21T16:08:07")
@StaticMetamodel(ServiceList.class)
public class ServiceList_ { 

    public static volatile SingularAttribute<ServiceList, String> image;
    public static volatile ListAttribute<ServiceList, ClinicService> clinicServices;
    public static volatile SingularAttribute<ServiceList, String> inArabic;
    public static volatile SingularAttribute<ServiceList, String> name;
    public static volatile SingularAttribute<ServiceList, Long> id;

}