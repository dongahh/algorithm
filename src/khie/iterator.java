package khie;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("peach");
		list.add("mango");
		
		Iterator<String> iter = list.iterator();
		
		/*
		 * while(iter.hasNext()) { System.out.println("과일:"+iter.next()); }
		 */
		
		for(String str:list) {
			System.out.println("과일:"+str);
		}
		
		
		
		

	}

}
