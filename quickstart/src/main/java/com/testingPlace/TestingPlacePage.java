package com.testingPlace;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.wicket.Session;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.model.ResourceModel;

public class TestingPlacePage extends WebPage {
	
	private static final long serialVersionUID = 1L;
	private static final String CZECH_LANGUAGE = "cs";
	
	private List<Locale> supportedLocales = Arrays.asList(new Locale(CZECH_LANGUAGE), Locale.GERMAN, Locale.ENGLISH);
	private List<String> selectionList = Arrays.asList("one", "two", "three");
	private String selection;
	private Locale selectionLocale = Session.get().getLocale();
	
	public TestingPlacePage () {
		// set LocalDropDown
		final LocaleDropDown ddcLocale = new LocaleDropDown("selectLocale", supportedLocales);

		ddcLocale.setDefaultModelObject(new Locale(getSession().getLocale().getLanguage()));
		add(ddcLocale);
		
		// set dropDownChoice selection based on locale
		Form<String> form = new Form<>("form");
		add(form);
		
		DropDownChoice<String> ddc = new DropDownChoice<String>("select", new PropertyModel<String>(this, "selection"), selectionList, new SelectChoiceRenderer());
		
		ddc.setNullValid(true);
		form.add(ddc);
	}
	
	private class SelectChoiceRenderer extends ChoiceRenderer<String> {
		private static final long serialVersionUID = 1L;

		@Override
		public Object getDisplayValue(String object) {
			return new ResourceModel("select." + object, object).getObject();
		}

		@Override
		public String getIdValue(String object, int index) {
			return Integer.toString(index);
		}
		
		
	}
}
