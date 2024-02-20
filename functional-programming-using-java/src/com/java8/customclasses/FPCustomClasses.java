package com.java8.customclasses;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}
}

public class FPCustomClasses {

	public static void main(String[] args) {

		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000),
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "Fullstack", 91, 21000),
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 20000),
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000)
				);
		
		//allMatch, noneMatch, anyMatch
		Predicate<Course> reviewScoreGreaterThan95Predicate 
							= course -> course.getReviewScore() > 95;
							
		Predicate<Course> reviewScoreGreaterThan90Predicate 
							= course -> course.getReviewScore() > 90;					
							
		System.out.println(courses.stream()
								  .allMatch(reviewScoreGreaterThan95Predicate));
		System.out.println(courses.stream()
				  .noneMatch(reviewScoreGreaterThan90Predicate));
		
		
		// sorted() method
		System.out.println("Sorting methods $:: ");
		Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparing(Course::getNoOfStudents);
		Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();
		System.out.println(
						courses.stream()
					   .sorted(comparingByNoOfStudentsIncreasing)
					   .collect(Collectors.toList()));
		System.out.println("Reverse Order:: ");
		System.out.println(
				courses.stream()
			   .sorted(comparingByNoOfStudentsDecreasing)
			   .collect(Collectors.toList()));
		
		
		//GroupingBy function
		System.out.println(
							courses.stream()
								   .collect(Collectors.groupingBy(Course::getCategory)));
// {Cloud=[AWS:21000:92, Azure:20000:99, Docker:20000:92, Kubernetes:20000:91],
//		Frameword=[Spring:20000:98, Spring Boot:18000:95],
//		Fullstack=[FullStack:21000:91], Microservices=[API:22000:97, Microservices:25000:96]}
		
		
		System.out.println(
				courses.stream()
					   .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
		
		// {Cloud=4, Frameword=2, Fullstack=1, Microservices=2}
		
		System.out.println(
				courses.stream()
					   .collect(Collectors.groupingBy(Course::getCategory,
							   Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		
		
//		{Cloud=Optional[Azure:20000:99], Fullstack=Optional[FullStack:21000:91], 
//		Microservices=Optional[API:22000:97], Framework=Optional[Spring:20000:98]}
		
		System.out.println(
				courses.stream()
					   .collect(Collectors.groupingBy(Course::getCategory,
							   Collectors.mapping(Course::getName,Collectors.toList()))));
		
//		{Cloud=[AWS, Azure, Docker, Kubernetes], Fullstack=[FullStack], 
//		Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}
		
		
	}

}
