import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
//SET Exercises
public class SetExercises {

	// 1.  Write a program to remove elements from a SET of integers that are the perfect square. 
	public static void removePerfectSqr() {
		HashSet<Integer> set = new HashSet();
		boolean b = false;
		for(int i=1;i<=10;i++)
			set.add(i);
			System.out.println(set);
		for(int i=1;i<=10;i++) {
			double sqrt = Math.sqrt(i);
			b = ((sqrt-Math.floor(sqrt))==0);
			if(b==true) {
				set.remove(i);
			}
		}
		System.out.println(set);
	}
	
	// 2. Write a Java program to convert a hash set to a List/ArrayList.
	public static void convertToArrayList() {
		HashSet<String> set = new HashSet();
		set.add("Red");
		set.add("Green");
		set.add("Blue");
		set.add("White");
		set.add("Purple");
		System.out.println("SET: "+set);
		ArrayList<String> arrli = new ArrayList<>(set);
		System.out.println("ArrayList: "+arrli);
	}
	
	// 3. Write a Java program to get the first and last elements in a tree set.
	public static void treeFirstAndLast() {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Red");
		set.add("Green");
		set.add("Blue");
		set.add("White");
		set.add("Purple");
		System.out.println("TreeSet: "+set);
		System.out.println("First Element: "+set.first());
		System.out.println("Last Element: "+set.last());
	}
	
	// 4.  Write a Java program to get an element in a tree set which is strictly greater than the given element. 
	public static void getStrictlyGreater() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(54);
		set.add(21);
		set.add(65);
		set.add(45);
		set.add(32);
		set.add(89);

		int givenElement1=23;
		int givenElement2=18;
		
		System.out.println("TreeSet: "+set);
		System.out.println("Strictly greater number than 23 is: "+set.higher(givenElement1));
		System.out.println("Strictly greater number than 18 is: "+set.higher(givenElement2));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nSet Exercises\n1. Remove perfect squares from the set.\n2. Convert SET into ArrayList.\n3. Get the first and last element of TreeSet."
				+ "\n4. Get the strictly greatest number than given element for the treeset.");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: removePerfectSqr();
		break;
		case 2: convertToArrayList();
		break;
		case 3: treeFirstAndLast();
		break;
		case 4: getStrictlyGreater();
		break;
		default: System.exit(0);
		}
	}

}
