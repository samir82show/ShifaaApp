package entity.domain;

import entity.domain.Clinic;
import entity.domain.ClinicService;
import entity.domain.Hospital;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-10T23:51:36")
@StaticMetamodel(Offer.class)
public class Offer_ { 

    public static volatile SingularAttribute<Offer, Date> end_date;
    public static volatile SingularAttribute<Offer, String> offerType;
    public static volatile SingularAttribute<Offer, Double> price;
    public static volatile SingularAttribute<Offer, ClinicService> clinicService;
    public static volatile SingularAttribute<Offer, Double> percentage;
    public static volatile SingularAttribute<Offer, Double> discountPrice;
    public static volatile SingularAttribute<Offer, String> details;
    public static volatile SingularAttribute<Offer, Long> id;
    public static volatile SingularAttribute<Offer, Clinic> clinic;
    public static volatile SingularAttribute<Offer, Hospital> hospital;
    public static volatile SingularAttribute<Offer, String> detailsInArabic;
    public static volatile SingularAttribute<Offer, Date> start_date;

}