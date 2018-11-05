package entity.domain;

import entity.domain.Area;
import entity.domain.Clinic;
import entity.domain.HospitalImage;
import entity.domain.Insurance;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-05T03:15:06")
@StaticMetamodel(Hospital.class)
public class Hospital_ { 

    public static volatile SingularAttribute<Hospital, Area> area;
    public static volatile ListAttribute<Hospital, Insurance> insurances;
    public static volatile ListAttribute<Hospital, Clinic> clinics;
    public static volatile SingularAttribute<Hospital, String> workingDaysHours;
    public static volatile SingularAttribute<Hospital, String> rating;
    public static volatile SingularAttribute<Hospital, String> ratingComment;
    public static volatile ListAttribute<Hospital, HospitalImage> hospitalImages;
    public static volatile SingularAttribute<Hospital, String> locationMap;
    public static volatile SingularAttribute<Hospital, String> phoneNo;
    public static volatile SingularAttribute<Hospital, String> inArabic;
    public static volatile SingularAttribute<Hospital, String> name;
    public static volatile SingularAttribute<Hospital, Long> id;
    public static volatile SingularAttribute<Hospital, String> email;

}