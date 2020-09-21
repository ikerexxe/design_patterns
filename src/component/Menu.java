package component;

import java.util.ArrayList;
import java.util.Iterator;

import iterator.CompositeIterator;

public class Menu extends MenuComponent{
	
	String name;
	String description;
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	Iterator<MenuComponent> iterator = null;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(menuComponents.iterator());
		}
		
		return iterator;
	}
	
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	
	public String getName() {
		return name;
	}
	
	public String print() {
		String result = "";
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		
		result = getName() + ": ";
		
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			
			result += menuComponent.print() + ", ";
		}
		
		result = result.substring(0, result.length()-2);
		
		return result;
	}

}
