package com.banas.Observer;

public class GrabStocks {

	public static void main (String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setApplPrice(327.00);
		stockGrabber.setGoogPrice(867.00);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setApplPrice(327.00);
		stockGrabber.setGoogPrice(867.00);
		
		stockGrabber.unregister(observer1);
		
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setApplPrice(327.00);
		stockGrabber.setGoogPrice(867.00);
		
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAppl = new GetTheStock(stockGrabber, 2, "APPL", 327.00);
		Runnable getGoog = new GetTheStock(stockGrabber, 2, "GOOG", 867.00);
		
		new Thread(getIBM).start();
		new Thread(getAppl).start();
		new Thread(getGoog).start();
	}
}
