package edu.psu.injection.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = NotNullNotEmptyCollectionValidator.class)
@Target({ METHOD, FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNullNotEmptyCollection {
  String message() default "Collection cannot be null or empty";
  
  Class<?>[] groups() default {};
  
  Class<? extends Payload>[] payload() default {};
}
