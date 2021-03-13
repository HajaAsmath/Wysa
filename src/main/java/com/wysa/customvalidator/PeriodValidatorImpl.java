package com.wysa.customvalidator;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/*
 * Custom constraint for evaluating period
 */
public class PeriodValidatorImpl implements ConstraintValidator<PeriodConstraint, String>{
	
	private static final List<String> period = Arrays.asList("Less than 2 weeks",
															"2 to 8 weeks",
															"more than 8 weeks");
	
	@Override
	public void initialize(PeriodConstraint constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return period.contains(value);
	}

}
