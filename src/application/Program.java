package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entites.Course;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Course> set = new HashSet<>();
		
		for (int i = 0; i < 3; i++) {
			String letter = "ABC";
			System.out.print("How many students for course " + letter.charAt(i) + "? ");
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				int cod = sc.nextInt();
				set.add(new Course(cod));
			}
		}
		System.out.println("Total students: " + set.size());
		sc.close();
	}

}
