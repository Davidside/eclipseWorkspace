package com.example.CheesrStore;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;


public class Index extends CheesrPage {
	public Index() {
		PageableListView<Cheese> cheeses = new PageableListView<Cheese>("cheeses", getCheeses(), 4) {
			
			@Override
			protected void populateItem(ListItem<Cheese> item) {
				Cheese cheese = (Cheese) item.getModelObject();
				item.add(new Label("name", cheese.getName()));
				item.add(new Label("description", cheese.getDescription()));
				item.add(new Label("price", "$" + cheese.getPrice() + " per pound"));
				item.add(new Link<Cheese>("add", item.getModel()) {
					
					@Override
					public void onClick() {
						Cheese selected = (Cheese) getModelObject();
						getCart().add(selected);
					}
				});
			}
		};
		add(cheeses);
		add(new PagingNavigator("navigator", cheeses));
		
		add(new ShoppingCartPanel("shoppingcart", getCart()));
		
		add(new Link("checkout"){
			@Override
			public void onClick() {
				setResponsePage(new CheckoutPage());
			}
			
			@Override
			public boolean isVisible() {
				return !getCart().getCheeses().isEmpty();
			}
		});
	}

}
