package collec;

import java.util.ArrayList;

public class Arrayyy {

	public static void main(String[] args) {
		ArrayList<String>nomes= new ArrayList<>();
		
		nomes.add("ppp");
		nomes.add("popo");
		nomes.add("ppp");
		nomes.add("popo");
		nomes.add("ppp");
		nomes.add("popo");
		
		System.out.println(nomes.size());
		
		System.out.println(nomes);
		
		nomes.remove(3);
		nomes.add(2, "ppp");
		System.out.println(nomes);
	}

}
