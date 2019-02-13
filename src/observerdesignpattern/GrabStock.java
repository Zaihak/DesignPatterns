package observerdesignpattern;

public class GrabStock {

	public static void main(String[] args) {
                 StockGrabber stockGrabber=new StockGrabber();
                 StockObserver observer1=new StockObserver(stockGrabber);
                 stockGrabber.setAAPLPrice(222);
                 StockObserver observer2=new StockObserver(stockGrabber);
                 stockGrabber.setGOOGPrice(333);
                 stockGrabber.setIBMPrice(400);
                 
	}

}
