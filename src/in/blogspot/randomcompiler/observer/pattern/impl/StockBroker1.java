package in.blogspot.randomcompiler.observer.pattern.impl;

import java.util.Map;

import in.blogspot.randomcompiler.observer.pattern.api.Observer;

public class StockBroker1 implements Observer {

	@Override
	public void update(Map<String, String> stockPrices) {
		System.out.println("StockBroker1 got the updates");
		for(String key : stockPrices.keySet()) {
			System.out.println(key + " : " + stockPrices.get(key));
		}
	}

}
