package com.example.CheesrStore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.wicket.Page;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;

public class CheesrApplication extends WebApplication {
	private static List<Cheese> cheeses = Arrays.asList(
			new Cheese("Gouda", "Gouda (Chauda) je tvrdý sýr nizozemského původu vyráběný z kravského mléka. Je označován jako jeden z nejlepších sýrů na světě.", 1.65),
			new Cheese("Edam", "Eidam je mírně nasládlý polotuhý původně plnotučný sýr vyráběný z pasterovaného kravského mléka, původem z nizozemského města Edam [ejdam]. Eidam má jemnou, nepříliš slanou chuť. Ve srovnání s jinými sýry je téměř bez zápachu.", 1.05),
			new Cheese("Maasdam", "Maasdam is a traditional, semi-hard Dutch cheese made from cow’s milk. The most characteristic feature is its ‘eyes’ (holes) that make up most of the cheese. The cheese was created in the early 1990s as an alternative to more expensive Swiss Emmental cheese. It is a high-fat cheese with a minimum of 45% fat. Although similar to Emmental, the moisture content in Maasdam is more, making it suppler. Nearly 15% of Dutch cheese production is made up of Maasdam.", 2.35),
			new Cheese("Brie", "Brie je plísňový sýr s velmi měkkou, krémovou konzistencí, jemným, kompaktním těstem slámové barvy a pikantní chuti. Brie se vyrábí z kravského mléka, obsah tuku se pohybuje kolem 45 % až 60 %.", 3.15),
			new Cheese("Buxton Blue", "Buxton Blue is an English blue cheese that is a close relative of Blue Stilton, is made from cow's milk, and is lightly veined with a deep russet colouring.[1] It is usually made in a cylindrical shape.", 0.99),
			new Cheese("Parmesan", "Parmezán je sýr původem z Itálie. Má žlutou barvu, zrnitou strukturu a hladkou kůrku. Pravý italský parmezán se nazývá Parmigiano-Reggiano a je chráněnou značkou původu. Název parmezán se používá pro sýry ho napodobující.", 1.99),
			new Cheese("Cheddar", "Čedar je polotvrdý sýr pocházející a tradičně vyráběný v jiho-západní Anglii přibližně od roku 1170. Tradičně se vyrábí z pasterovaného i nepasterovaného kravského mléka, vzácně kozího mléka, ve tvaru bubnovitých bochníků o váze 27,5 Kg.", 2.95),
			new Cheese("Roquefort", "Roquefort je polotvrdý plísňový sýr vyráběný z ovčího mléka s výraznou ostrou chutí. Na řezu je mramorovaný, prorostlý modrozelenou plísní. Je pojmenován podle francouzské obce Roquefort.", 1.67),
			new Cheese("Boursin", "Boursin [buʁsɛ̃] is a trademarked brand of Gournay cheese. It is a soft creamy cheese available in a variety of flavours, with a flavour and texture somewhat similar to cream cheese.", 1.33),
			new Cheese("Camembert", "Camembert je měkký sýr krémovité konzistence. Je pojmenován po francouzské vesnici Camembert ležící v departementu Orne v Normandii, kde vznikl.", 1.69),
			new Cheese("Emmental", "Ementál je sýr původem ze Švýcarska s typickými dutinami uvnitř. Pochází z údolí řeky Emme v Kantonu Bern na úpatí Alp. V Severní Americe a Austrálii je někdy nazýván \"Swiss cheese\". Obsah tuku v sušině je 45%. ", 2.39),
			new Cheese("Reblochon", "Reblochon ze Savojska je pojmenován podle francouzského reblocher, tedy znovu zatahat krávu za vemeno, protože sýr se vyrábí až z druhého dojení krav plemene Abondance nebo Montbéliard. Reblochon je sýr střední velikosti s tenkou oranžovo-žlutou smetanovou kůrou. Má svěží houbovou vůní a hladkou, vláčnou a tučnou tmotu. V ústech zanechává lahodnou oříškovou dochuť.", 2.99)
			);
	
	/**
	 * Constructor
	 */
	public CheesrApplication() {
	}
	
	@Override
	protected void init() {
	}
	
	@Override
	public Class<? extends Page> getHomePage() {
		return Index.class;
	}
	
	public static List<Cheese> getCheeses() {
		return Collections.unmodifiableList(cheeses);
	}
	
	@Override
	public Session newSession(Request request, Response response) {
		return new CheesrSession(CheesrApplication.this, request);
	}
}