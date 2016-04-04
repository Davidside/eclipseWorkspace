package com.testingPlace;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.wicket.Session;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class TestingPlacePage extends WebPage {
	
	private static final long serialVersionUID = 1L;
	private static final String CZECH_LANGUAGE = "cs";
	
	private List<Locale> supportedLocales = Arrays.asList(Locale.ENGLISH, Locale.GERMAN, new Locale(CZECH_LANGUAGE));
	private List<String> selectionList = Arrays.asList("Selection one", "Selection two", "Selection three");
	private String selection;
	private Locale selectionLocale = Session.get().getLocale();
	
	public TestingPlacePage () {
		final LocaleDropDown ddcLocale = new LocaleDropDown("selectLocale", supportedLocales);

		add(ddcLocale);
		
		// set dropDownChoice selection based on locale
		Form<String> form = new Form<>("form");
		add(form);
		
		DropDownChoice<String> ddc = new DropDownChoice<String>("select", new PropertyModel<String>(this, "selection"), selectionList);
		
		ddc.setNullValid(true);
		form.add(ddc);
	}

}
