package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prodotto iPhone = new Prodotto("iPhone", "iPhone bello");
		
	
		
		iPhone.setPrice(789);
		iPhone.setVat(22);

		iPhone.getBasePrice();
		iPhone.getVatPrice();
		iPhone.getFullName();
		
		
		Prodotto bicchiere = new Prodotto("Bicchiere", "Bicchiere di cristallo");
		
		bicchiere.getBasePrice();
	}

}
