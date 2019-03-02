package entity.domain;

import entity.domain.Gender;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-03T00:09:59")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-21T16:08:07")
>>>>>>> f240c93a6a45d7eb88cd0113d6b11de1c79b60ea
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