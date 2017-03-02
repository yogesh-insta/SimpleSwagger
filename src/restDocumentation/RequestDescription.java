package restDocumentation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Yogesh.Manware
 * @version $Revision: $
 * 
 *          TODO: move it to portal-common later
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestDescription {
   String value() default "";
}
