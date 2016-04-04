package com.testingPlace;

import java.util.List;
import java.util.Locale;

import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.model.IModel;

public class LocaleDropDown extends DropDownChoice<Locale> {
	
	private class LocaleRenderer extends ChoiceRenderer<Locale> {

		private static final long serialVersionUID = 1L;
		
		@Override
		public Object getDisplayValue(Locale locale) {
			return ((Locale) locale).getDisplayName(getLocale());
		}
	}
	
	private static final long serialVersionUID = 1L;

	public LocaleDropDown(String id, List<Locale> supportedLocales) {
		super(id, supportedLocales);
		
		setChoiceRenderer(new LocaleRenderer());
		setModel(new IModel<Locale>() {

			private static final long serialVersionUID = 1L;

			@Override
			public Locale getObject() {
				return getSession().getLocale();
			}

			@Override
			public void setObject(Locale locale) {
				getSession().setLocale((Locale)locale);
			}
			
			@Override
			public void detach() {
			}
		});
		
	}

	@Override
	protected boolean wantOnSelectionChangedNotifications() {
		return true;
	}
}
