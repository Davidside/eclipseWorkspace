package com.example.CheesrStore;

import java.io.Serializable;
import java.text.NumberFormat;
import java.util.Locale;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

/*
 * Panel for displaying the contents of a shopping cart. The cart
 * shows the entries and the total value of the cart. Each time
 * can be removed by the user.
 */
public class ShoppingCartPanel extends Panel {
	private Cart cart;
	public ShoppingCartPanel(String id, Cart cart) {
		super(id);
		this.cart = cart;
		add(new ListView<Cheese>("cart", new PropertyModel(this, "cart.cheeses")) {
				
				@Override
				protected void populateItem(ListItem<Cheese> item) {
					Cheese cheese = (Cheese) item.getModelObject();
					item.add(new Label("name", cheese.getName()));
					item.add(new Label("price", "$" + cheese.getPrice()));
					
					item.add(new Link<Cheese>("remove", item.getModel()){
						
						@Override
						public void onClick () {
							Cheese selected = (Cheese) getModelObject();
							getCart().remove(selected);
							if(getCart().getCheeses().isEmpty()) {
								setResponsePage(Index.class);
							}
						}
					});
				}
			});
			
			add(new Label("total", new Model<String>(){
				@Override
				public String getObject() {
					Locale usLoc = new Locale("en", "US");
					NumberFormat nf = NumberFormat.getCurrencyInstance(usLoc);
					return nf.format(getCart().getTotal());
				}
				
			}));
	}
	
	private Cart getCart() {
		return cart;
	}
}
