package entity.domain;

import entity.domain.Clinic;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-03T00:09:59")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-21T16:08:07")
>>>>>>> f240c93a6a45d7eb88cd0113d6b11de1c79b60ea
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, String> image;
    public static volatile ListAttribute<Category, Clinic> clinics;
    public static volatile SingularAttribute<Category, String> inArabic;
    public static volatile SingularAttribute<Category, String> name;
    public static volatile SingularAttribute<Category, String> description;
    public static volatile SingularAttribute<Category, Long> id;
    public static volatile SingularAttribute<Category, String> arabicDescription;

}