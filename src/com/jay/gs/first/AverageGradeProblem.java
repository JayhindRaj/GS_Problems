package com.jay.gs.first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AverageGradeProblem {

	public static void main(String[] args) {
//		Student s2 = new Student("arush", Arrays.asList(new int[]{37, 86, 91}));
//		Student s1 = new Student("sobby", new int[]{87, 95});
//		
//		Student s3 = new Student("tony", new int[]{84, 90, 96, 95, 93,45, 94});
//		Student s4 = new Student("charles", new int[]{203, 85});
//		Student s5 = new Student("Kamlakant", new int[]{93, 73});
//		Student s6 = new Student("shambhu", new int[]{56, 83});
		
		String[][] st = new String[][]{{"arush", "86"}, {"kamlakant", "73"}, {"arush", "37"}, {"tony", "87"}, {"sobby", "87"}, {"arush", "67"}, {"sobby", "95"}, {"arush", "37"}, {"tony", "96"}, {"kamlakant", "93"}};
		getStudents(st);

//		Set<Student> students = new TreeSet<>(new GradeComparator());
//		students.add(s3);
//		students.add(s2);
//		students.add(s4);
//		students.add(s1);
//		students.add(s5);
//		students.add(s6);
//
//		Iterator<Student> it = students.iterator();
//		
//		while (it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s);
//			break;
//		}
	}
	
	public static void getStudents(String[][] students) {
		
		Map<String, List<Integer>> avg = new HashMap<>();
		
		// Iterating the given 2D array and adding students and their marks(grades) in map.
		for(String[] s1 : students) {
			String name  = s1[0];
			int grade  = Integer.parseInt(s1[1]);
					
			if(avg.get(name) == null) {
				List<Integer> grades = new ArrayList<>();
				grades.add(grade);
				avg.put(name, grades);
			} else {
				List<Integer> grades = avg.get(name);
				grades.add(grade);
				avg.put(name, grades);
			}
			
		}
		
		// Creating a Set of Students with GradeComparator
		Set<Student> stu = new TreeSet<Student>(new GradeComparator());
				
		Iterator<String> it = avg.keySet().iterator();
		while (it.hasNext()) {
			// Student name
			String name = it.next();
			
			// Creating new Student using name and his grades. and adding it to Set
			stu.add(new Student(name, avg.get(name)));
		}
		
		// Creating iterator from Set
		Iterator<Student> it1 = stu.iterator();
		
		// Iterating through the Student Set.
		while (it1.hasNext()) {
			Student s = it1.next();
			System.out.println(s);
			// Breaking the loop after printing the top (first) element.
			break;
		}
	}
}

class GradeComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return -Double.valueOf(s1.getAverage()).compareTo(Double.valueOf(s2.getAverage()));
	}
}

class Student {
	private String name;
	private List<Integer> grade;
	
	public Student() {

	}
	
	public Student(String name, List<Integer> grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getGrade() {
		return grade;
	}

	public void setGrade(List<Integer> grade) {
		this.grade = grade;
	}
	
	/**
	 * @return double - Average of his grades.
	 */
	public double getAverage() {
		double sum = 0;
		if(grade != null && grade.size() >= 1) {
			for(int i : grade) {
				sum = sum + i;
			}
			
			return sum / grade.size();
		}
		return sum;
	}
	

	@Override
	public String toString() {
		return "Name:" + name + ", Grades : "
				+ grade + ", Average : " + getAverage();
	}
}