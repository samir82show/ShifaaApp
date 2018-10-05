package entity.domain;

import entity.domain.Clinic;
import entity.domain.ClinicService;
import entity.domain.Hospital;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-05T12:49:27")
@StaticMetamodel(ClinicServicePrice.class)
public class ClinicServicePrice_ { 

    public static volatile SingularAttribute<ClinicServicePrice, String> price;
    public static volatile SingularAttribute<ClinicServicePrice, ClinicService> clinicService;
    public static volatile SingularAttribute<ClinicServicePrice, String> discount;
    public static volatile SingularAttribute<ClinicServicePrice, Long> id;
    public static volatile SingularAttribute<ClinicServicePrice, Clinic> clinic;
    public static volatile SingularAttribute<ClinicServicePrice, Hospital> hospital;

}