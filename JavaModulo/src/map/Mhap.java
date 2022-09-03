package map;

import java.util.HashMap;
import java.util.Map;

public class Mhap {
	
	public static void main(String[] args) {
		
		Map<Integer, String>name = new HashMap<>();
		
		name.put(0, "cai");
		name.put(1, "vai");
		name.put(2, "tai");
		name.put(5, "kai");
		name.put(8, "sai");
		name.put(7, "jai");
		name.put(3, "rai");
		
		System.out.println(name);
		
		
		System.out.println(name.keySet());
		System.out.println(name.values());
		System.out.println(name.entrySet());
		
		name.replace(8, "sai", "hai");
		
		System.out.println(name);
		
		name.remove(5);
		
		System.out.println(name);
		
		
	}
}
