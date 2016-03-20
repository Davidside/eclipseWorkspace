package easyMock.firstApp;

import java.util.ArrayList;
import java.util.List;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(EasyMockRunner.class)
public class PortfolioTesterJUnit {

	private Portfolio portfolio;
	private StockService stockService;
	
	@Before
	public void setUp() {
		// Create a portfolio object which is to be tested
		portfolio = new Portfolio();
		// Create the mock object of stock service
		stockService = EasyMock.createMock(StockService.class);
		// set the stockService to the portfolio
		portfolio.setStockService(stockService);
	}
	
	@Test
	public void testMarketValue() {
		// Creates a list of stocks to be added to the portfolio
		List<Stock> stocks = new ArrayList<Stock>();
		Stock googleStock = new Stock("1", "Google", 10);
		Stock microsoftStock = new Stock("2", "Microsoft", 100);
		
		stocks.add(googleStock);
		stocks.add(microsoftStock);
		
		// add stocks to the portfolio
		portfolio.setStocks(stocks);
		
		// mock the behavior of stock service to return the value of various stocks
		EasyMock.expect(stockService.getPrice(googleStock)).andReturn(50.00);
		EasyMock.expect(stockService.getPrice(microsoftStock)).andReturn(1000.00);
		
		// activate the mock
		EasyMock.replay(stockService);
		
		// Assert equals
		assertEquals(100500.00, portfolio.getMarketValue(), 0);
	}
}
