import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12,3,2,1,5,4,15,7,9);
		//printOddNumbersInlistFunctional(numbers);
//		printSqaresInlistFunctional(numbers);
		printQubesInlistFunctional(numbers);
		
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		printEachStringLengthInlistFunctional(courses);
//		courses.stream()
//			   .filter(course -> course.length() >= 5)	
//			   .forEach(System.out::println);
	}

	private static void printEachStringLengthInlistFunctional(List<String> courses) {
		courses.stream()
			   .map(course -> course +"-"+ course.length())
			   .forEach(System.out::println);
		
	}

	private static void printQubesInlistFunctional(List<Integer> numbers) {
		System.out.println("Qubes for Number:");
		numbers.stream()
			   .map(num -> num * num * num)
			   .forEach(System.out::println);
	}

	private static void printSqaresInlistFunctional(List<Integer> numbers) {
		
		numbers.stream()
			   .filter(number -> number % 2 == 0)
			   .map(number -> number * number)
			   .forEach(System.out::println);
	}

	private static void printOddNumbersInlistFunctional(List<Integer> numbers) {
		
		numbers.stream()
				.filter(number -> number % 2 != 0)
				.forEach(System.out::println);
	}

}
