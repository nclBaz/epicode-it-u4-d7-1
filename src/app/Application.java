package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Student;

public class Application {

	public static void main(String[] args) {
//		method2();
//		method1();

		List<Student> myList = new ArrayList<>();

		Student aldo = new Student("Aldo", "Baglio");
		Student giovanni = new Student("Giovanni", "Storti");
		Student giacomo = new Student("Giacomo", "Poretti");
		Student[] students = { aldo, giovanni, giacomo };
		myList.addAll(Arrays.asList(students));
		myList.addAll(Arrays.asList(students));
//		myList.add(aldo);
//		myList.add(giovanni);
//		myList.add(0, giacomo);

		System.out.println("La lista ha " + myList.size() + " elementi");

//		myList.remove(0);
//
//		System.out.println("La lista ha " + myList.size() + " elementi");
		// myList.clear();

//		Student[] studentsArray = (Student[]) myList.toArray();
		System.out.println(myList);

		for (Student student : myList) {
			System.out.println(student);
		}

		// ************************************* LINKED LISTS
		// **********************************

//		LinkedList<String> myLinkedList = new LinkedList<>();
//		myLinkedList.push("ASD");
//		myLinkedList.push("QWE");
//		myLinkedList.push("Ciao");
//		System.out.println(myLinkedList);
//		myLinkedList.pop();
//		System.out.println(myLinkedList);
//		myLinkedList.pop();
//		System.out.println(myLinkedList);

		// *************************************** ITERATORS
		// **********************************

//		ArrayList<String> characters = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
//
////		characters.forEach(c -> {
////			if (c.equals("a")) {
////				characters.remove(c); // Java lancia un'eccezione nel caso io provassi a modificare la lista durante l'iterazione (
////			}
////			System.out.println(c);
////		});
//
//		Iterator<String> i = characters.iterator();
//		while (i.hasNext()) {
//			String current = i.next();
//			if (current.equals("a")) {
//				i.remove(); // Se utilizzo l'iteratore non devo usare .remove sulla lista, bensì devo usarlo
//							// sull'iteratore
//			}
//		}
//
//		for (String string : characters) {
//			System.out.println(string);
//		}

	}

	@Deprecated
	public static void method1() {
		System.out.println("Ciao sono il metodo uno");
	}

	public static void method2() {
		System.out.println("Ciao sono il metodo due");
	}

}
