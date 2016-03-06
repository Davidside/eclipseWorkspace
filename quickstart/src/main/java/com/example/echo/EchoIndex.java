package com.example.echo;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;
import org.apache.wicket.markup.html.form.Button;

public class EchoIndex extends WebPage {
	private Label label;
	private TextField field;

	public EchoIndex() {
		Form form = new Form("form");
		add(form);
		field = new TextField("field", new Model(""));
		
		form.add(field);
		
		form.add(new Button("button") {
			@Override
			public void onSubmit() {
				String value = (String) field.getModelObject();
				label.setDefaultModelObject(value);
				field.setModelObject("");
			}
		});
		
		label = new Label("message", new Model(""));
		add(label);
	}
	
	
}
