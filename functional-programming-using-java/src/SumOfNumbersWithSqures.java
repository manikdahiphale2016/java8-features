import java.util.List;

public class SumOfNumbersWithSqures {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(5,5,5,5);
		Integer result = sumOfIntegersWithSquares(numbers);
		System.out.println("Sum of Squares: "+ result);
		
		Integer sumOfQubes = sumOfIntegersWithQubes(numbers);
		System.out.println("Sum of Qubes: "+ sumOfQubes);
		
	}

	private static Integer sumOfIntegersWithQubes(List<Integer> numbers) {
		return numbers.stream().map(num -> num*num*num).reduce(0,Integer::sum);
	}

	private static Integer sumOfIntegersWithSquares(List<Integer> numbers) {

		return numbers.stream().map(num -> num * num).reduce(0, Integer::sum);
	}

}
