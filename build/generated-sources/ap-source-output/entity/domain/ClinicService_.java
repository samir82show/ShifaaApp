package entity.domain;

import entity.domain.Clinic;
import entity.domain.Offer;
import entity.domain.ServiceList;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-11T00:10:57")
@StaticMetamodel(ClinicService.class)
public class ClinicService_ { 

    public static volatile ListAttribute<ClinicService, Offer> offers;
    public static volatile SingularAttribute<ClinicService, Double> price;
    public static volatile SingularAttribute<ClinicService, ServiceList> serviceList;
    public static volatile SingularAttribute<ClinicService, Double> discount;
    public static volatile SingularAttribute<ClinicService, Long> id;
    public static volatile SingularAttribute<ClinicService, Clinic> clinic;

}