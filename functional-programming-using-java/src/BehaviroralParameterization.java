import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class BehaviroralParameterization {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,2,3,9,5,4,12,15);
		
		
//		Predicate<? super Integer> predicate = number -> number % 2 == 0;
//		filterAndPrint(numbers, num -> num % 2 == 0);
		
//		Predicate<? super Integer> oddPredicate = number -> number % 2 != 0;
//		filterAndPrint(numbers, num -> num % 2 != 0);
//		filterAndPrint(numbers, num -> num % 3 == 0);
		
//		Function<Integer,Integer> mappingFunction = x -> x*x;
		
		List<Integer> squaredNumbers = mapAndCreateNewList(numbers,x -> x*x);
		List<Integer> cubedNumbers = mapAndCreateNewList(numbers,x -> x*x*x);
		List<Integer> Numbers = mapAndCreateNewList(numbers,x -> x*x*x*x);
		
//		squaredNumbers.forEach(System.out::println);
		
		// Supplier interface takes No input and return something
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		System.out.println(randomIntegerSupplier.get());
	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, Integer> mappingFunction) {
		return numbers.stream()
					  .map(mappingFunction)
					  .collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
			   .filter(predicate)
			   .forEach(System.out::println);
	}
}
