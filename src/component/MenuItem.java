package component;

import java.util.Iterator;

import iterator.NullIterator;

public class MenuItem extends MenuComponent{
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description,
					boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}

	public String getName() {
		return name;
	}
	
	public String print() {
		return getName();
	}

}
