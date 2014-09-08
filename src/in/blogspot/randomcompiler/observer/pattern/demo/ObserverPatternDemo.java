package in.blogspot.randomcompiler.observer.pattern.demo;

import java.util.HashMap;
import java.util.Map;

import in.blogspot.randomcompiler.observer.pattern.api.Subject;
import in.blogspot.randomcompiler.observer.pattern.impl.StockBroker1;
import in.blogspot.randomcompiler.observer.pattern.impl.StockBroker2;
import in.blogspot.randomcompiler.observer.pattern.impl.StockBroker3;
import in.blogspot.randomcompiler.observer.pattern.impl.StockPriceEngine;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject s = new StockPriceEngine();
		
		s.subscribe(new StockBroker1());
		s.subscribe(new StockBroker2());
		s.subscribe(new StockBroker3());
		
		Map<String, String> stockPrices = new HashMap<String, String>();
		stockPrices.put("ORCL", "$38");
		stockPrices.put("GOGL", "$750");
		stockPrices.put("FB", "$215");
		
		s.changeState(stockPrices);
		
		stockPrices.put("MSFT", "$176");
		
		s.changeState(stockPrices);
	}

}
