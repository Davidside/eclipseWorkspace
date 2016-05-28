package com.testingPlace;

import java.util.Calendar;
import java.util.Date;

import org.apache.wicket.extensions.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.markup.html.form.FormComponentPanel;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.validation.validator.RangeValidator;

public class DateTimeField extends FormComponentPanel<Date> {

	private Date date;
	private Integer hours;
	private Integer minutes;
	private final DateTextField dateField;
	private final TextField<Integer> hoursField;
	private final TextField<Integer> minutesField;
	
	private static final long serialVersionUID = 1L;
	
	public DateTimeField(String id, IModel<Date> model) {
		super(id, model);
		
		PropertyModel<Date> dateFieldModel = new PropertyModel<>(this, "date");
		
		add(dateField = new DateTextField("date", dateFieldModel));
		dateField.add(new DatePicker());
		
		add(hoursField = new TextField<Integer>("hours", new PropertyModel<Integer>(this, "hours")));
		hoursField.add(new RangeValidator<Integer>(0, 24));
		hoursField.setLabel(new Model<String>("hours"));
		
		add(minutesField = new TextField<Integer>("minutes", new PropertyModel<Integer>(this, "minutes")));
		minutesField.add(new RangeValidator<Integer>(0, 59));
		minutesField.setLabel(new Model<String>("minutes"));
	}
	
	@Override
	protected void onBeforeRender() {
		date = getModelObject();
		if (date != null) {
			Calendar calendar = Calendar.getInstance(getLocale());
			calendar.setTime(date);
			hours = calendar.get(Calendar.HOUR_OF_DAY);
			minutes = calendar.get(Calendar.MINUTE);
		}
		dateField.setRequired(isRequired());
		super.onBeforeRender();
	}
	
	@Override
	public void convertInput() {
		Date date = dateField.getConvertedInput();
		
		if (date != null) {
			Calendar calendar = Calendar.getInstance(getLocale());
			calendar.setTime(date);
			
			Integer hours = hoursField.getConvertedInput();
			Integer minutes = minutesField.getConvertedInput();
			
			if (hours != null) {
				calendar.set(Calendar.HOUR_OF_DAY, hours % 24);
				calendar.set(Calendar.MINUTE, minutes != null ? minutes : 0);
			}
			setConvertedInput(calendar.getTime());
		} else {
			setConvertedInput(null);
		}
	}
	
	@Override
	public String getInput() {
		return dateField.getInput() + ", " + hoursField.getInput() + ":" + minutesField.getInput();
	}


}
