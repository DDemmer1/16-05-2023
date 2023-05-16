package de.demmer.dennis;

public class Application {
	
	public static void main(String[] args) {
		
		LinkedStringList liste = new LinkedStringList();
		
		liste.add("mein erster String");
		liste.add("mein zweiter String");
		liste.add("mein dritter String");
		liste.add("mein vierter String");
		liste.add("mein fünfter String");



		Node n = liste.head;
		while( n!= null) {
			System.out.println(n.data);
			n = n.next;
		}
		
	
		
		
		
		
	}

}
