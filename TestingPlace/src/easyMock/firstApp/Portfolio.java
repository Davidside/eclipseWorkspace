package easyMock.firstApp;

import java.util.List;

public class Portfolio {
	private StockService stockService;
	private List<Stock> stocks;
	
	public Portfolio() {
		super();
	}
	public Portfolio(StockService stockService, List<Stock> stocks) {
		super();
		this.stockService = stockService;
		this.stocks = stocks;
	}
	
	public StockService getStockService() {
		return stockService;
	}
	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	
	public double getMarketValue() {
		double marketValue = 0.0;
		
		for(Stock stock : stocks){
			marketValue += stockService.getPrice(stock) * stock.getQuantity();
		}
		return marketValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stockService == null) ? 0 : stockService.hashCode());
		result = prime * result + ((stocks == null) ? 0 : stocks.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Portfolio other = (Portfolio) obj;
		if (stockService == null) {
			if (other.stockService != null)
				return false;
		} else if (!stockService.equals(other.stockService))
			return false;
		if (stocks == null) {
			if (other.stocks != null)
				return false;
		} else if (!stocks.equals(other.stocks))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portfolio [stockService=");
		builder.append(stockService);
		builder.append(", stocks=");
		builder.append(stocks);
		builder.append("]");
		return builder.toString();
	}
}
