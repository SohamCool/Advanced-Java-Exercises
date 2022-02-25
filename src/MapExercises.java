import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapExercises {

	// 1. Write a Java program to associate the specified value with the specified key in a HashMap.
	//Sample output (hint use Map(<int><String>))
	public static void associateKeyValue() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Brown");
		hm.put(2, "Red");
		hm.put(3, "Black");
		hm.put(4, "Pink");
		hm.put(5, "White");
		for(Map.Entry x:hm.entrySet())
			System.out.println(x.getKey()+" "+x.getValue());
	}
	
	// 2. Write a Java program to get the value of a specified key in a map. Get value of key 3 in above map in exercise.
	public static void getValueOfGivenKey() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Brown");
		hm.put(2, "Red");
		hm.put(3, "Black");
		hm.put(4, "Pink");
		hm.put(5, "White");
		System.out.println("key 3 is having value: "+hm.get(3));
	}
	
	// 3. Write a Java program to remove all of the mappings from a map in exercise 1.
	public static void removeAllMappings() {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Brown");
		hm.put(2, "Red");
		hm.put(3, "Black");
		hm.put(4, "Pink");
		hm.put(5, "White");
		System.out.println("Original map: "+hm);
		hm.clear();
		System.out.println("Removed all mapping successfully\n"+hm);
	}
	
	// 4. Write a Java program to get the first (lowest) key and the last (highest) key currently in a tree map. Create a tree map with TreeMap<String><String>
	public static void getFirstLast() {
		TreeMap<String,String> tm = new TreeMap<String,String>();
		tm.put("A11", "Brown");
		tm.put("B12", "Red");
		tm.put("C13", "Black");
		tm.put("D14", "Pink");
		tm.put("E15", "White");
		System.out.println("Original map: "+tm);
		System.out.println("Lowest Element: "+tm.firstKey());
		System.out.println("Highest Element: "+tm.lastKey());
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nMap Exercises\n1. Get specified value with the specified key in a HashMap.\n2. Get the value of specified key in map."
				+ "\n3. Remove all mappings from a map.\n4. Get the Lowest and Highest element from the TreeMap.");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: associateKeyValue();
		break;
		case 2: getValueOfGivenKey();
		break;
		case 3: removeAllMappings();
		break;
		case 4: getFirstLast();
		break;
		}
	}

}
