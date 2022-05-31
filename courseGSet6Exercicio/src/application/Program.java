package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		try {
			
			Set<Course> set = new HashSet<>();
			
			char courseABC = 'A';
			while ( courseABC != 'D') {
				
				System.out.print("How many students for course " + courseABC + "?");
				int quant = sc.nextInt();
				
				for (int i = 0; i < quant; i++) {
					int userCod = sc.nextInt();
					set.add(new Course(userCod));
				} 
				courseABC++;
			}
			System.out.println("Total students: " + set.size());
						
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
