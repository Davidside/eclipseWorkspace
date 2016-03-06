package com.example.ClockPage;

import java.io.Serializable;
import java.util.Date;

import org.apache.wicket.datetime.markup.html.basic.DateLabel;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;

import java.io.Serializable;

public class ClockPage extends WebPage {
	public ClockPage () {
		Model clock = new Model() {
			@Override
			public Serializable getObject() {
				return new Date();
			}
			
		};
		add(DateLabel.forDatePattern("clockStatic", new Model(new Date()), "hh:mm:ss"));
		add(DateLabel.forDatePattern("clockDynamic", clock, "hh:mm:ss"));
		add(new Link("refresh") {
			@Override
			public void onClick() {
			}
		});
	}
}
