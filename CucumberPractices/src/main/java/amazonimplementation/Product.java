package amazonimplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	private String productName;
	private int price;
	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}
	/**
	 * @return the productName
	 */
	public String getProduct() {
		return productName;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList(){
		List<String> productList = new ArrayList<String>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple MacBook Air");
		productList.add("Apple iPhone 12");
		return productList;

		
		
	}
	

}
