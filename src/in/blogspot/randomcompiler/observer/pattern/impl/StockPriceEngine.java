package in.blogspot.randomcompiler.observer.pattern.impl;

import in.blogspot.randomcompiler.observer.pattern.api.Observer;
import in.blogspot.randomcompiler.observer.pattern.api.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StockPriceEngine implements Subject {
	
	private Map<String, String> stockPrices;
	private List<Observer> observers;
	
	public StockPriceEngine() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void subscribe(Observer o) {
		observers.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
			for(Observer o : observers) {
				o.update(stockPrices);				
			}				
	}

	@Override
	public void changeState(Map<String, String> updatedStockPrices) {
		stockPrices = updatedStockPrices;
		notifyObservers();
	}
}
