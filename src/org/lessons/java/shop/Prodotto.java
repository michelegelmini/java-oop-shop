package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private String code;
	private String name;
	private String description;
	private double price;
	private int vat;
	
	
	//costruttore
	public Prodotto(String name, String description, double price, int vat) {
		this.code = generateCode();
		this.name = name;
		this.description = description;
		this.price = price;
		this.vat = vat;
		
	}
	
	//getter e setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public String getCode() {
		return code;
	}
	
	// metodo per la generazione del codice prodotto
		String generateCode() {
			Random r = new Random();
			int max = 10000000;
			int result = r.nextInt(max);
			return (String.format("%08d", result));
		}
		
	//metodo per avere il prezzo base
	public void getBasePrice() {
		System.out.println("Il prezzo base del prodotto è €" + (String.format("%,.2f", this.price)));
	}
		
	//metodo per avere il prezzo comprensivo di IVA
	public void getVatPrice() {
		
		double finalPrice = this.price += this.price * this.vat / 100;
		
		System.out.println("Il prezzo comprensivo di IVA del prodotto è €" + (String.format("%,.2f", finalPrice)));
	}
	
	//metodo per avere il nome esteso, ottenuto concatenando codice-nome
	
	public void getFullName() {
		System.out.println(this.code + " - " + this.name);
	}
}
