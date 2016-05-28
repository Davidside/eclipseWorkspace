package com.testingPlace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.wicket.behavior.AbstractAjaxBehavior;
import org.apache.wicket.extensions.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
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
		
	 /***********************************/
		
		WebMarkupContainer group = new WebMarkupContainer("group");
		group.add(new AbstractAjaxBehavior() {
			
			private static final long serialVersionUID = 1L;

			@Override
			protected void onComponentTag(ComponentTag tag) {
				tag.getAttributes().remove("style");
			}
			
			@Override
			public void onRequest() {
				// TODO Auto-generated method stub
				
			}
		});
//		group.add(AttributeModifier.remove("style"));
//		group.add(new AttributeModifier("style", ""));
		add(group);
		
		Form<?> dateForm = new Form<Void>("dateForm");
		group.add(dateForm);
		
		List<EnumInterface> enumList = new ArrayList<EnumInterface>(Arrays.asList(EnumInterface.values()));
		
		dateForm.add(new OrderedDropDownChoice<EnumInterface>(
				"ddcEnum", 
				new PropertyModel<EnumInterface>(model, "enumInterface"), 
				Model.ofList(enumList),
				new EnumRenderer()
						).setNullValid(true));
		
		final DateTextField dateFieldFrom = new DateTextField("dateFieldFrom", new PropertyModel<Date>(model, "dateFrom"), "dd.MM.yyyy");
		final DateTextField dateFieldTo = new DateTextField("dateFieldTo", new PropertyModel<Date>(model, "dateTo"), "dd.MM.yyyy");
		
		DatePicker datePicker = new DatePicker();
		datePicker.setAutoHide(true);
		datePicker.setShowOnFieldClick(true);
		DatePicker datePicker2 = new DatePicker();
		datePicker2.setAutoHide(true);
		datePicker2.setShowOnFieldClick(true);
		
		dateFieldFrom.add(datePicker);
		dateFieldTo.add(datePicker2);
		
		dateForm.add(dateFieldFrom);
		dateForm.add(dateFieldTo);
		
		dateForm.add(new GreaterOrEqualDateValidator(dateFieldFrom, dateFieldTo));
		
		TextField<String> netmaskTf = new TextField<>("netmask", new Model<String>());
		netmaskTf.add(new NetmaskValidator());
		dateForm.add(netmaskTf);
		
		dateForm.add(new FeedbackPanel("feedback"));
		
		dateForm.add(new DateTimeField("dateTime", new Model<Date>(new Date())));
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
