package collections.sets;

import java.util.*;

public class BookSetDemo {

	public static void main(String[] args) {

		Set<Book> bookSet = new TreeSet(new MyComparator());

		bookSet.add(new Book("Java", "Schlidt", 500, 700));
		bookSet.add(new Book("Python", "Kathy", 300, 500));
		bookSet.add(new Book("Java123", "Schlidt123", 500, 700));
		bookSet.add(new Book("Java321", "Schlidt32", 505, 710));

		bookSet.stream().forEach(System.out::println);
		System.out.println(bookSet);
	}
}

class MyComparator implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getTitle().compareTo(b2.getTitle()); // DESC
	}
}