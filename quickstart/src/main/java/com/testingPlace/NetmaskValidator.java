package com.testingPlace;

import java.util.regex.Pattern;

import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.validation.IValidatable;
import org.apache.wicket.validation.IValidator;
import org.apache.wicket.validation.ValidationError;

public class NetmaskValidator implements IValidator<String> {

	private static final long serialVersionUID = 1L;
	
	private static final String NETMASK_PATTERN = 
			"^(254|252|248|240|224|192|128|0)\\.0\\.0\\.0"
			+ "|255\\.(254|252|248|240|224|192|128|0)\\.0\\.0"
			+ "|255\\.255\\.(254|252|248|240|224|192|128|0)\\.0"
			+ "|255\\.255\\.255\\.(255|254|252|248|240|224|192|128|0)$";
	
	private final Pattern pattern;

	public NetmaskValidator() {
		pattern = Pattern.compile(NETMASK_PATTERN);
	}

	@Override
	public void validate(IValidatable<String> validatable) {

		final String netmask = validatable.getValue();

		if (pattern.matcher(netmask).matches() == false) {
			error(validatable);
		}
	}
	
	private void error(IValidatable<String> validatable) {
		ValidationError error = new ValidationError();
		error.addKey(getClass().getSimpleName());
		validatable.error(error);
	}
}
