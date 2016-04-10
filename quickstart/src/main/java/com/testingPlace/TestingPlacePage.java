package com.testingPlace;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
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
		
	}
	
	private class SelectChoiceRenderer extends ChoiceRenderer<String> {
		private static final long serialVersionUID = 1L;

		@Override
		public Object getDisplayValue(String object) {
			return new ResourceModel("select." + object, object).getObject();
		}
	}
}
