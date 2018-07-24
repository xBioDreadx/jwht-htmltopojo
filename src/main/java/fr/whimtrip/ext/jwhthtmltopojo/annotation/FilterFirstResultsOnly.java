



package fr.whimtrip.ext.jwhthtmltopojo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by LOUISSTEIMBERG on 23/11/2017.
 */



@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD })
public @interface FilterFirstResultsOnly {

    int before();
    int after() default 0;
}