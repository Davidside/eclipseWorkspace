package com.example.HelloBengBros;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.basic.Label;


public class HelloBengBros extends WebPage {

	public HelloBengBros() {
		String url = "http://bengbros.cz";
		ExternalLink link = new ExternalLink("link", url);
		add(link);
		link.add(new Label ("label", "goto the BengBros web site"));
	}
}
