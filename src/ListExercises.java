import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// List arraylist practice examples

public class ListExercises{
	
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
		for(int i = 0; i<li.size(); i++) 
			System.out.println(li.get(i) );
		
	}
	
	// 4. Write a Java program to iterate through all elements in a linked list starting at the specified position.Position no 1. sample list is of colors with element "Red","Green","White","Black","Yellow".

//Output will be "Green","White","Black","Yellow".
	public static void specifiedElement() {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Red");
		li.add("Green");
		li.add("White");
		li.add("Black");
		li.add("Yellow");
		int position=1;
		System.out.println("Original linkedlist");
		for(int i = 0; i<li.size(); i++) 
			System.out.println(li.get(i) );
		System.out.println("List from specified position");
		for(int i = position; i<li.size(); i++) 
			System.out.println(li.get(i) );
		
	}
	
	// 5. Write a Java program to insert elements into the linked list at the first and last position. Insert color "Pink" at first and "Blue" at last position in linked list in exercise 4.
	public static void addFirstAndLast() {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Red");
		li.add("Green");
		li.add("White");
		li.add("Black");
		li.add("Yellow");
		li.addFirst("Pink");
		li.addLast("Blue");
		System.out.println(li);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Remove third element from the ArrayList.\n2. Copy one Arraylist into another.\n3. Display elements of aray using position index.\n4. Print the element from specified position."
				+ "\n5. Add first and Last element as pink and blue.");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: removeThirdElement();
		break;
		case 2: copyListToAnother();
		break;
		case 3: displayArrayUsingPosition();
		break;
		case 4: specifiedElement();
		break;
		case 5: addFirstAndLast();
		break;
		}
	}

}
