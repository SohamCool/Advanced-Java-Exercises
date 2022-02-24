import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// List arraylist practice examples

public class AdvJavaExercises{
	
	// 1. Write a java program to remove third element from array list.
	public static void removeThirdElement() {
		List<String> li = new ArrayList<String>();
		li.add("C++");
		li.add("Java");
		li.add("HTML");
		li.add("Python");
		li.add("PHP");
		System.out.println(li + "\nAfter removing 3rd element,\n");
		li.remove(2);
		System.out.println(li);
	}
	// 2. Write a Java program to copy one array list into another.
	public static void copyListToAnother() {
		List<String> li = new ArrayList<String>();
		li.add("C++");
		li.add("Java");
		li.add("HTML");
		li.add("Python");
		li.add("PHP");
		List<String>li1 = new ArrayList<String>();
		li1.add("First");
		li1.add("Second");
		li1.add("Third");
		li1.add("Fourth");
		li1.add("Fifth");

		Collections.copy(li1,li);
		System.out.println(li+" Original list");
		System.out.println(li1+" Copied List\n");
	}
	
	// 3. Write a Java program to print all the elements of a ArrayList using the position of the elements. 
	public static void displayArrayUsingPosition() {
		List<String> li = new ArrayList<String>();
		li.add("C++");
		li.add("Java");
		li.add("HTML");
		li.add("Python");
		li.add("PHP");
		System.out.println(li + "\nAfter removing 3rd element,\n");
		li.remove(2);
		System.out.println(li);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Remove third element from the ArrayList.\n2. Copy one Arraylist into another.\n3. Display elements of aray using position index.\n4. ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: removeThirdElement();
		break;
		case 2: copyListToAnother();
		break;
		case 3: displayArrayUsingPosition();
		break;
		}
	}

}
