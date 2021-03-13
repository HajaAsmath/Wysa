package com.wysa.customvalidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = GoalConstraintImpl.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GoalConstraint {
	String message() default  "Invalid Goal";
	
	Class <?> [] groups() default {};
	
	Class<? extends Payload>[] payload() default {}; 
}
