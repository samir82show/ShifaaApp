package entity.domain;

import entity.domain.Clinic;
import entity.domain.ServiceList;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-12T22:52:18")
@StaticMetamodel(ClinicService.class)
public class ClinicService_ { 

    public static volatile SingularAttribute<ClinicService, String> image;
    public static volatile SingularAttribute<ClinicService, String> price;
    public static volatile SingularAttribute<ClinicService, ServiceList> name;
    public static volatile SingularAttribute<ClinicService, String> discount;
    public static volatile SingularAttribute<ClinicService, Long> id;
    public static volatile SingularAttribute<ClinicService, Clinic> clinic;

}