package component;

import java.util.Iterator;

public abstract class MenuComponent {
	
	public abstract Iterator<MenuComponent> createIterator();
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String print() {
		throw new UnsupportedOperationException();
	}
	
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

}
