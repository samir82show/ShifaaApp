package entity.domain;

import entity.domain.ClinicServicePrice;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-05T13:55:35")
@StaticMetamodel(ClinicService.class)
public class ClinicService_ { 

    public static volatile SingularAttribute<ClinicService, String> image;
    public static volatile ListAttribute<ClinicService, ClinicServicePrice> clinicServicePrices;
    public static volatile SingularAttribute<ClinicService, String> name;
    public static volatile SingularAttribute<ClinicService, Long> id;

}