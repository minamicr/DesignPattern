package com.banas.Observer;


public class StockObserver implements Observer {

	private double ibmPrice;
	private double applPrice;
	private double googPrice;
	
	private static int observerIDTracker = 0;
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++ observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		stockGrabber.register(this);
	}
	
	public void update(double ibmPrice, double applPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.applPrice = applPrice;
		this.googPrice = googPrice;
		
		printThePrices();
		
	}
	
	public void printThePrices() {
		System.out.println(observerID + "\nIBM: " + ibmPrice +
				"\naapl: " + applPrice + "\ngoog: " + googPrice);
	}

}
