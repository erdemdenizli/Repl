package catalog;

import java.util.ArrayList;
import java.util.Arrays;

public class Catalog {


	public ArrayList<String> items = new ArrayList<>();
	public ArrayList<Double> prices = new ArrayList<>();
	public ArrayList<Double> monthlyPayments = new ArrayList<>();

	/**
	 * This method adds all listed items to <items> arraylist
	 * that is already declared above
	 */
	public void loadItems() {
		//TODO
		items.addAll(Arrays.asList("iPhone 6s", 
		"iPhone 6s Plus", 
		"iPhone X", 
		"MacbookPro", 
		"ThumbDrive", 
		"Beats HeadPhones", 
		"Mouse", 
		"Charger", 
		"iPad", 
		"Dyson Vacuum", 
		"TV", 
		"Apple Watch"));
	}
	/**
	 * This method adds all listed prices to <prices> arraylist
	 * that is already declared above
	 */
	public void loadPrices() {
		//TODO
		prices.addAll(Arrays.asList(449.0, 
		  549.0, 
		  1149.0, 
		  1499.99, 
		  39.99, 
		  349.99, 
		  79.99, 
		  39.99, 
		  429.0, 
		  399.0, 
		  2199.0, 
		  559.0));
	}
	
	/**
	 * This method adds all listed monthly payments to <monthlyPayments> arraylist
	 * that is already declared above
	 */
	
	public void loadMonthlyPayments() {
		//TODO
		monthlyPayments.addAll(Arrays.asList(18.71, 
		  22.88, 
		  56.16, 
          79.49, 
          2.68, 
          15.12, 
		  8.98, 
		  4.56, 
		  18.31, 
		  16.25, 
		  89.49,
		  21.18));

	}
	
	/**
	 * This method will load whole catalog data - <items>,<prices>,<monthlyPayments>
	 * Call loadItems(),loadPrices(),loadMonthlyPayments() that you created above
	 */
	public void loadWholeCatalog() {
		//TODO
		loadItems(); loadPrices(); loadMonthlyPayments();
	}

	/**
	 * Write a method that reads values from above ArrayLists and 
	 * returns a stringbuilder with all item details:
	 * return format(each item in new line and delimited by '-' ):
	 * 	iPhone 6s-449.0-18.71
			iPhone 6s Plus-549.0-22.88
			..
	 * 
	 */
	
	public StringBuilder getWholeCatalog() {
		//LOAD WHOLE CATALOG HERE FIRST
		loadWholeCatalog();
		
		StringBuilder catalog = new StringBuilder();
		for(int i=0; i<items.size(); i++) {
			
			catalog.append(items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i)+"\n");
			
		}
		
		return catalog;
	}

	/**
	 * write a method that an item name and returns all details for it. If item
	 * is not in the list then returns null
	 *  ex: 
	 * getItemDetails("ThumbDrive") -->ThumbDrive-39.99-2.68 
	 * getItemDetails("Charger") --> Charger-39.99-4.56
	 * getItemDetails("Potato") --> null
	 * 
	 * @param item
	 * @return
	 */

	public String getItemDetails(String item) {
		loadWholeCatalog();
		
		if(items.contains(item)) {
			return item + "-" + prices.get(items.indexOf(item)) + "-" +monthlyPayments.get(items.indexOf(item));
		}
				
		return null;
	}

	/**
	 * write a method that accepts a price and returns a ArrayList<String> with
	 * items with all detail that have less than or equal monthly payments
	 * 
	 * getItemsLessThanAMonthlyPrice(5.99) --> ThumbDrive-39.99-2.68
	 * 										  Charger-39.99-4.56 
	 * getItemsLessThanAMonthlyPrice(1.99) --> ""
	 * 
	 * @param double price
	 * @return ArrayList<String>
	 */

	public ArrayList<String> getItemsLessThanAMonthlyPrice(double price) {
		loadWholeCatalog();
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<monthlyPayments.size(); i++) {
			if(monthlyPayments.get(i)<=price) {
				list.add(items.get(i)+"-"+prices.get(i)+"-"+monthlyPayments.get(i));
			}
		}
				
		return list;
	}
	
	/**
	 * Method accepts a item name and updates total Price and monthly payments
	 * for that item in <items>,<prices>,<monthlyPayments> arrayLists
	 * When assigning monthlyPayments do =>  newPrice/12 <= to get monthly payments
	 * 
	 * @param item name
	 * @param newPrice
	 */
	
	public void updatePrice(String item, double newPrice) {
		loadWholeCatalog();
		
		if(items.contains(item)) {
			prices.set(items.indexOf(item), newPrice);
			monthlyPayments.set(items.indexOf(item), newPrice/12);
		}
	
	}
	
	/**
	 * Method looks for an item in the catalog and removes
	 * all details for that item including item name, price, monthlypayments
	 * 
	 * 
	 * @param item
	 */
	
	public void deleteItemFromCatalog(String item) {
		loadWholeCatalog();
		
		if(items.contains(item)) {
			prices.removeAll(Arrays.asList(prices.get(items.indexOf(item))));
			monthlyPayments.removeAll(Arrays.asList(monthlyPayments.get(items.indexOf(item))));
			items.removeAll(Arrays.asList(item));
		}

	}
	

}





