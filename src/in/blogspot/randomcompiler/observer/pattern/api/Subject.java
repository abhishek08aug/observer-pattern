package in.blogspot.randomcompiler.observer.pattern.api;

import java.util.Map;

public interface Subject {	
	public void subscribe(Observer o);
	
	public void unsubscribe(Observer o);
	
	public void notifyObservers();
	
	public void changeState(Map<String, String> map);
}
