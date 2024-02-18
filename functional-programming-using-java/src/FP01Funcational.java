import java.util.List;
import java.util.stream.Collectors;

public class FP01Funcational {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 17, 2, 4, 6, 7, 15, 11);
		printAllNumbersInListFuncation(numbers);
		printAllEvenNumbersListFunction(numbers);
	}

	private static void printAllEvenNumbersListFunction(List<Integer> numbers) {
		//What to do?
		List<Integer> evenNumbers = numbers.stream()
			   .filter(num -> num % 2 == 0)	// Lambda Expression
			   .collect(Collectors.toList());
		System.out.println("Evennumbers: ");
		evenNumbers.forEach(System.out::println);
		
	}

	private static void printAllNumbersInListFuncation(List<Integer> numbers) {
		System.out.println("AllNumbers:: ");
		// what to do?
		numbers.stream().forEach(System.out::println); // Method Reference
	}
	
	
}
