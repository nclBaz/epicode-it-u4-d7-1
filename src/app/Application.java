package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import entities.Student;

public class Application {

	public static void main(String[] args) {
//		method2();
//		method1();

		List<Student> myList = new LinkedList<>();
		Set<Student> mySet = new TreeSet<>();

		Student aldo = new Student("Aldo", "Baglio");
		Student giovanni = new Student("Giovanni", "Storti");
		Student giacomo = new Student("Giacomo", "Poretti");
		Student[] students = { aldo, giovanni, giacomo };
		myList.addAll(Arrays.asList(students));
		myList.addAll(Arrays.asList(students));
//		myList.add(aldo);
//		myList.add(giovanni);
//		myList.add(0, giacomo);

		// mySet.add(aldo);

		System.out.println("La lista ha " + myList.size() + " elementi");

//		myList.remove(0);
//
//		System.out.println("La lista ha " + myList.size() + " elementi");
		// myList.clear();

//		Student[] studentsArray = (Student[]) myList.toArray();
//		System.out.println(myList);

//		for (Student student : myList) {
//			System.out.println(student);
//		}

		try {
			Student firstStudent = myList.get(0);

			System.out.println("Il primo elemento è: " + firstStudent);
			System.out.println("Il suo indice è: " + myList.indexOf(firstStudent));
			if (myList.contains(giacomo)) { // <-- .contains utilizza internamente il metodo .equals()
				System.out.println("La lista contiene Giacomo");
			} else {
				System.out.println("La lista non contiene Giacomo");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		// ***************************************** COLLECTIONS & TIPI PRIMITIVI
		// **************************
		List<Integer> x = new ArrayList<>(); // <-- Integer è la WRAPPER CLASS del tipo primitivo int.
		// Negli array list non posso salvare tipi primitivi ma solo oggetti.
		x.add(1);
		int y = x.get(0);

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

		// ************************************* MAPS ******************************
		Map<String, Student> studentsMap = new HashMap<>();

		studentsMap.put(aldo.getId(), aldo);
		studentsMap.put(giovanni.getId(), giovanni);
		studentsMap.put(giacomo.getId(), giacomo);
		System.out.println(myList);
		System.out.println(studentsMap);

		for (String key : studentsMap.keySet()) {
			System.out.println(studentsMap.get(key));
		}

		// ************************** MAP ITERATORS *************************

//		Iterator<String> i = studentsMap.keySet().iterator();
//		Iterator<Entry<String, Student>> i2 = studentsMap.entrySet().iterator();
//		Iterator<Student> i3 = studentsMap.values().iterator();
//
//		while (i.hasNext()) {
//			String current = i.next();
//			if (current.equals("a")) {
//				i.remove(); // Se utilizzo l'iteratore non devo usare .remove sulla lista, bensì devo usarlo
//							// sull'iteratore
//			}
//		}

		studentsMap.containsKey("683406162");
	}

	@Deprecated
	public static void method1() {
		System.out.println("Ciao sono il metodo uno");
	}

	public static void method2() {
		System.out.println("Ciao sono il metodo due");
	}

}
