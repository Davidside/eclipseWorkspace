package com.testingPlace;

import java.util.Date;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.form.validation.AbstractFormValidator;
import org.apache.wicket.util.lang.Args;

/**
 * Validates that the date input of the second form component is greater or equal than date input of the first component. 
 * Errors are reported on the second form component with key 'GreaterOrEqualDateValidator' or 
 * 'GreaterOrEqualDateValidator.' + second form component id.
 * and the variables:
 * <ul>
 * <li>${input(n)}: the user's input</li>
 * <li>${name}: the name of the component</li>
 * <li>${label(n)}: the label of the component - either comes from FormComponent.labelModel or
 * resource key [form-id].[form-component-id] in that order</li>
 * </ul>
 * 
 * @author David Sirc
 */
public class GreaterOrEqualDateValidator extends AbstractFormValidator {

	private static final long serialVersionUID = 1L;

	private final FormComponent<?>[] components;
	
	public GreaterOrEqualDateValidator(FormComponent<?> formComponent1, FormComponent<?> formComponent2)
	{
		Args.notNull(formComponent1, "formComponent1");
		Args.notNull(formComponent2, "formComponent2");

		components = new FormComponent[] { formComponent1, formComponent2 };
	}
	
	@Override
	public FormComponent<?>[] getDependentFormComponents() {
		return components;
	}

	@Override
	public void validate(Form<?> form) {
        Date startDate = (Date) components[0].getConvertedInput();
        Date endDate = (Date) components[1].getConvertedInput();

        if (endDate.before(startDate)){
            error(components[1]);
        }
	}
	
	@Override
	protected String resourceKey() {
		return "GreaterOrEqualDateValidator." + components[1].getId();
	}
}
