package com.testingPlace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.wicket.extensions.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.form.validation.AbstractFormValidator;
import org.apache.wicket.markup.html.form.validation.IFormValidator;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.model.StringResourceModel;

public class TestingPlacePage extends WebPage {
	
	private static final long serialVersionUID = 1L;
	private static final String CZECH_LANGUAGE = "cs";
	
	private List<Locale> supportedLocales = Arrays.asList(new Locale(CZECH_LANGUAGE), Locale.GERMAN, Locale.ENGLISH);
	private List<String> selectionList = Arrays.asList("one", "two", "three");
//	private Selection selection = new Selection();
	private Model<Selection> model = new Model<Selection>(new Selection());
	
	public TestingPlacePage () {
		// set LocalDropDown
		final LocaleDropDown ddcLocale = new LocaleDropDown("selectLocale", supportedLocales);

		ddcLocale.setDefaultModelObject(new Locale(getSession().getLocale().getLanguage()));
		add(ddcLocale);
		
		// set dropDownChoice selection based on locale
		final Form<String> form = new Form<>("form");
		add(form);
		
//		final LoadableDetachableModel<Selection> loadable = new LoadableDetachableModel<Selection>() {
//			
//			private static final long serialVersionUID = 1L;
//
//			@Override
//			protected Selection load() {
//				return selection;
//			}
//		};
		
		
//		final CompoundPropertyModel<Selection> selectionModel  = new CompoundPropertyModel<Selection>(loadable);
//		form.setDefaultModel(selectionModel);
		final DropDownChoice<String> ddc = new DropDownChoice<String>("selection", new PropertyModel<String>(model, "selection"), selectionList, new SelectChoiceRenderer());
		
		ddc.setNullValid(true);
		form.add(ddc);
		
		// add label
		final Label selected = new Label("selected", new StringResourceModel("select.${selection}", model));
		add(selected);
		
		// add reset button
		Button reset = new Button("reset") {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void onSubmit() {
				model.setObject(new Selection());
//				ddc.setDefaultModelObject(null);
//				selection = new Selection();
//				loadable.detach();
//				selectionModel.setObject(new Selection());
			}
		};
		form.add(reset);
		
		Form<String> dateForm = new Form<String>("dateForm");
		add(dateForm);
		
		dateForm.add(new DropDownChoice<EnumInterface>(
				"ddcEnum", 
				new PropertyModel<EnumInterface>(model, "enumInterface"), 
				new ArrayList<EnumInterface>(Arrays.asList(EnumInterface.values())),
				new EnumRenderer()
						).setNullValid(true));
		
		final DateTextField dateFieldFrom = new DateTextField("dateFieldFrom", new PropertyModel<Date>(model, "dateFrom"), "dd.MM.yyyy");
		dateFieldFrom.add(new DatePicker());
		
		final DateTextField dateFieldTo = new DateTextField("dateFieldTo", new PropertyModel<Date>(model, "dateTo"), "dd.MM.yyyy");
		dateFieldTo.add(new DatePicker());
		
		dateForm.add(dateFieldFrom);
		dateForm.add(dateFieldTo);
		
		IFormValidator validator = new AbstractFormValidator() {
		    private static final long serialVersionUID = 1L;

			public FormComponent<?>[] getDependentFormComponents() {
		        return new FormComponent[] { dateFieldFrom, dateFieldTo };
		    }

		    public void validate(Form<?> form) {
		        Date startDate = (Date) dateFieldFrom.getConvertedInput();
		        Date endDate = (Date) dateFieldTo.getConvertedInput();

		        if (endDate.before(startDate)){
		            error(dateFieldTo, "date.to.error");
		        }
		    }
		};
		dateForm.add(validator);
		dateForm.add(new FeedbackPanel("feedback"));
		
	}
	
	private class SelectChoiceRenderer extends ChoiceRenderer<String> {
		private static final long serialVersionUID = 1L;

		@Override
		public Object getDisplayValue(String object) {
			return new ResourceModel("select." + object, object).getObject();
		}
	}
	
	private class EnumRenderer extends ChoiceRenderer<EnumInterface> {

		private static final long serialVersionUID = 1L;

		@Override
		public Object getDisplayValue(EnumInterface object) {
			return new ResourceModel("enum." + object.name(), object.name()).getObject();
		}

//		@Override
//		public String getIdValue(EnumInterface object, int index) {
//			return Integer.toString(index);
//		}
//
//		@Override
//		public EnumInterface getObject(String id, IModel<? extends List<? extends EnumInterface>> choices) {
//			// TODO Auto-generated method stub
//			return null;
//		}
		
	}
}
