package entity.domain;

import entity.domain.Gender;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-16T23:37:54")
@StaticMetamodel(Guest.class)
public class Guest_ { 

    public static volatile SingularAttribute<Guest, String> password;
    public static volatile SingularAttribute<Guest, Gender> gender;
    public static volatile SingularAttribute<Guest, String> phone;
    public static volatile SingularAttribute<Guest, String> inArabic;
    public static volatile SingularAttribute<Guest, Date> DOB;
    public static volatile SingularAttribute<Guest, String> name;
    public static volatile SingularAttribute<Guest, Long> id;
    public static volatile SingularAttribute<Guest, String> email;

}