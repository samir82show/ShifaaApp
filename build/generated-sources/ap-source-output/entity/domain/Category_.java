package entity.domain;

import entity.domain.Clinic;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-11T00:10:57")
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