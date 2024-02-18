import java.util.List;
import java.util.stream.Collectors;

public class CollectMethodDemo {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
//		Create a list double list from give list of numbers
		
		List<Integer> doubleList = doubleList(numbers);
//		doubleList.forEach(System.out::println);
		
//		Create a List with Even Numbers Filtered from the given List
		List<Integer> evenList = evenNumbersList(numbers);
//		evenList.forEach(System.out::println);
		
//		Create a List with Odd Numbers Filtered from the given List
		List<Integer> oddList =	oddList(numbers);
//		oddList.forEach(System.out::println);
		
//		Create a List with lengths of all course titles.
		List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS",
				"PCF","Azure","Docker","Kubernetes");
		List<Integer> listWithLengths = listWithLengths(courses);
		listWithLengths.forEach(System.out::println);
	}

	private static List<Integer> listWithLengths(List<String> courses) {
		return courses.stream()
					  .map(str -> str.length())
					  .collect(Collectors.toList());
	}

	private static List<Integer> oddList(List<Integer> numbers) {
		return numbers.stream()
					  .filter(number -> number % 2 != 0)
					  .collect(Collectors.toList());
	}

	private static List<Integer> evenNumbersList(List<Integer> numbers) {
		
		return numbers.stream()
					  .filter(number -> number % 2 == 0)
					  .collect(Collectors.toList());
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		return numbers.stream()
					  .map(number -> number * number)
					  .collect(Collectors.toList());
	}

}
