package ua.org.oa.timdeygun;

import java.util.Arrays;

public class Customer {

	private String name; // customer's name.
	private float currentCash; // customer's current cash.
	private boolean shopClubMembership = false; // is current customer.
	private String[] selectedProducts = new String[ 10 ]; // an array that contains selected products.
	private int numberOfProducts = 0; // a number of selected product.


	/**
	 * manually created constructor that sets up information about customer.
	 */
	Customer(String name, float currentCash) {

		this.name = name;
		this.currentCash = currentCash;
	}


	/**
	 * Following method checks for received argument productNames
	 * then initializes an array of products using for-loop.
	 * After all manipulations with array it calculates overall number of products depending on received array length.
	 */
	public void selectProducts(String... productsNames) {

		if(productsNames.length == 0) {
			System.out.println("Yo've selected no products.");
		} else {
			for (int i = 0; i < productsNames.length; i++) {
				selectedProducts[i + numberOfProducts] = productsNames[i];
			}
			numberOfProducts += productsNames.length;
		}
	}

	/**
	 * Displays array of selected items excluding empty slots in parent array.
	 */
	public String showSelectedProducts() {

		String[] tempArray = new String[numberOfProducts];

		for (int i = 0; i < numberOfProducts; i++) {
			tempArray[i] = selectedProducts[i];
		}

		if(numberOfProducts == 0) {
			return "No products were selected.";
		}
		return Arrays.toString(tempArray);
	}

	/**
	 * Clears array of selected products and initialize number of products as zero.
	 */
	public void dropSelectedProducts() {
		for (int i = 0; i < numberOfProducts; i++) {
			selectedProducts[i] = null;
		}

		numberOfProducts = 0;
	}


	/**
	 * Sends information about selected products to pay for it.
	 */
	public void buySelectedProducts() {
		//... Shop class needed.
	}

	/**
	 * Following methods (3) should be used to get information about current customer.
	 */
	public String getName() {
		return name;
	}

	public float getCurrentCash() {
		return currentCash;
	}

	public boolean isShopClubMembership() {
		return shopClubMembership;
	}
}
