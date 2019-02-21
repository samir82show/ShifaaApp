package entity.domain;

import entity.domain.Clinic;
import entity.domain.ServiceList;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-21T16:08:07")
@StaticMetamodel(ClinicService.class)
public class ClinicService_ { 

    public static volatile SingularAttribute<ClinicService, Double> price;
    public static volatile SingularAttribute<ClinicService, ServiceList> serviceList;
    public static volatile SingularAttribute<ClinicService, Double> discount;
    public static volatile SingularAttribute<ClinicService, Long> id;
    public static volatile SingularAttribute<ClinicService, Clinic> clinic;

}