import java.util.Comparator;
import java.util.List;

public class DistinctAndSorted {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
		
//		findDisticntfromList(numbers);
//		sortingtheList(numbers);
//		sortingTheStringList(courses);
		sortingTheStringListUsingComparator(courses);
		
	}

	private static void sortingTheStringListUsingComparator(List<String> courses) {

//		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
//		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}

	private static void sortingTheStringList(List<String> courses) {

		courses.stream().sorted().forEach(System.out::println);
	}

	private static void sortingtheList(List<Integer> numbers) {

		numbers.stream().distinct().sorted().forEach(System.out::println);
	}

	private static void findDisticntfromList(List<Integer> numbers) {
		//numbers.stream().distinct().forEach(System.out::println);
	}

}
