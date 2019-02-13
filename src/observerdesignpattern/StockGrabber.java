package observerdesignpattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	 public StockGrabber() {
		 observers=new ArrayList<>();
	}
	

	@Override
	public void register(Observer addObserver) {
           observers.add(addObserver);		
	}

	@Override
	public void unregister(Observer removeObserver) {
        int removeIndexObserver=observers.indexOf(removeObserver);
        System.out.println("Observer"+ (removeIndexObserver+1)+"is remove");
		observers.remove(removeObserver);		
	}

	@Override
	public void notifyObserver() {
         for(Observer ob:observers) {
        	 ob.update(ibmPrice, aaplPrice, googPrice);
        	 
         }
        	
	}
	
public void setIBMPrice(double newIBMPrice){
		
		this.ibmPrice = newIBMPrice;
		
		notifyObserver();
		
	}
	
	public void setAAPLPrice(double newAAPLPrice){
		
		this.aaplPrice = newAAPLPrice;
		
		notifyObserver();
		
	}

	public void setGOOGPrice(double newGOOGPrice){
	
		this.googPrice = newGOOGPrice;
	
		notifyObserver();
	
	}

}
