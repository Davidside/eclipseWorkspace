package com.example.CheesrStore;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;

public class CheckoutPage extends CheesrPage {
	public CheckoutPage() {
		Form form = new Form("form");
		add(form);
		Address address = getCart().getBillingAddress();
		
		setDefaultModel(new CompoundPropertyModel<Address>(address));
		form.add(new TextField<String>("name").setRequired(true));
		form.add(new TextField<String>("street", new PropertyModel<String>(address, "street")).setRequired(true));
		form.add(new TextField<Integer>("zipcode", new PropertyModel<Integer>(address, "zipcode")).setRequired(true));
		form.add(new TextField<String>("city", new PropertyModel<String>(address, "city")).setRequired(true));
		
		form.add(new Link("cancel") {
			@Override
			public void onClick() {
				setResponsePage(Index.class);
			}
		});
		
		form.add(new Button("order") {
			@Override
			public void onSubmit() {
				Cart cart = getCart();
				
				// save client's address to database
				cart.saveAddress();
				
				// charge customers' credit card
				// ship cheeses to our customer
				// clean out shopping cart
				cart.getCheeses().clear();
				
				// return to front page
				setResponsePage(Index.class);
			}
		});
		add(new FeedbackPanel("feedback"));
		
		add(new ShoppingCartPanel("shoppingcart", getCart()));
		
	}
	
}
