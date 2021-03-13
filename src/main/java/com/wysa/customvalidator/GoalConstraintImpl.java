package com.wysa.customvalidator;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/*
 * Custom Constraint for evaluating goal
 */
public class GoalConstraintImpl implements ConstraintValidator<GoalConstraint, String>{
	
	List<String> goal = Arrays.asList("I would go to sleep easily",
									"I would sleep through the night",
									"I'd wake up on time, refreshed");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return goal.contains(value);
	}

}
