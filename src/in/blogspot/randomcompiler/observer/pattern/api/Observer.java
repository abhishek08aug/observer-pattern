package in.blogspot.randomcompiler.observer.pattern.api;

import java.util.Map;

public interface Observer {
	public void update(Map<String, String> stockPrices);
}
