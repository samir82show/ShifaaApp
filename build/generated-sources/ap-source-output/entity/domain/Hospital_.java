package entity.domain;

import entity.domain.Area;
import entity.domain.Clinic;
import entity.domain.Insurance;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T14:12:52")
@StaticMetamodel(Hospital.class)
public class Hospital_ { 

    public static volatile SingularAttribute<Hospital, Area> area;
    public static volatile SingularAttribute<Hospital, String> image;
    public static volatile ListAttribute<Hospital, Insurance> insurances;
    public static volatile ListAttribute<Hospital, Clinic> clinics;
    public static volatile SingularAttribute<Hospital, String> workingDaysHours;
    public static volatile SingularAttribute<Hospital, String> name;
    public static volatile SingularAttribute<Hospital, String> location;
    public static volatile SingularAttribute<Hospital, Long> id;
    public static volatile SingularAttribute<Hospital, String> locationMap;
    public static volatile SingularAttribute<Hospital, String> phoneNo;
    public static volatile SingularAttribute<Hospital, String> email;

}