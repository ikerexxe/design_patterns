package iterator;

import java.util.ArrayList;
import java.util.Iterator;

import component.MenuComponent;

public class Waitress {
	
	private MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
	
	public String printMenu() {
		return allMenus.print();
	}

}
