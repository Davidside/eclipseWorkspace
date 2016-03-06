package com.example.link;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;

public class Index extends WebPage {
	private int counter = 0;

	public Index() {
		add(new Link("link") {
			@Override
			public void onClick() {
				counter++;
			}
		});
		add(new Label("label", new PropertyModel(this, "counter")));
	}
}
