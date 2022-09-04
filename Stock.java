import java.util.ArrayList;
import java.util.List;

public class Stock {
	public static void main(String[] args) {

		Stock_portfolio obj = new Stock_portfolio("Dmart", 10, 4500);
		Stock_portfolio obj1 = new Stock_portfolio("Naukri", 5, 5500);
		Stock_portfolio obj2 = new Stock_portfolio("Nazara", 20, 1900);
		Stock_portfolio obj3 = new Stock_portfolio("itc", 50, 300);

		// obj.ValueOfEachStock();
		List<Stock_portfolio> port = new ArrayList<>();
		port.add(obj);
		port.add(obj1);
		port.add(obj2);
		port.add(obj3);

		int sum = 0;
		for (Stock_portfolio portfolio : port) {
			sum += portfolio.ValueOfEachStock();
			System.out.println(portfolio.toString());
			System.out.println(" Value of " + portfolio.getStockName() + "is " + portfolio.ValueOfEachStock() + ".");

		}
		System.out.println("The total value Stock is " + sum);

	}

}

class Stock_portfolio {
	String StockName;
	int NoOfShare;
	int SharePrice;

	Stock_portfolio() {

	}

	public String getStockName() {
		return StockName;
	}

	public void setStockName(String stockName) {
		StockName = stockName;
	}

	public int getNoOfShare() {
		return NoOfShare;
	}

	public void setNoOfShare(int noOfShare) {
		NoOfShare = noOfShare;
	}

	public int getSharePrice() {
		return SharePrice;
	}

	public void setSharePrice(int sharePrice) {
		SharePrice = sharePrice;
	}

	public Stock_portfolio(String stockName, int noOfShare, int sharePrice) {
		super();
		this.StockName = stockName;
		this.NoOfShare = noOfShare;
		this.SharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "Stock_portfolio [StockName=" + StockName + ", NoOfShare=" + NoOfShare + ", SharePrice=" + SharePrice
				+ "]";
	}

	int ValueOfEachStock() {

		return (NoOfShare * SharePrice);
	}
}
