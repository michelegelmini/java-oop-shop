package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prodotto iPhone = new Prodotto("iPhone", "iPhone bello", 100.00d, 22);
		
		System.out.println(iPhone.getCode());

		iPhone.getBasePrice();
		iPhone.getVatPrice();
		iPhone.getFullName();
		
	}

}
