import java.util.List;

public class SumOfNumbersWithEvenOdd {

	public static void main(String[] args) {

		
		List<Integer> numbers = List.of(1,3,5,2,4,6,8);
		
		Integer sumOfEvenNumbers = sumOfEvenNumbers(numbers);
		System.out.println("Sum Of Even Numbers: "+ sumOfEvenNumbers);
		
		Integer sumOfOddNumbers = sumOfOddNumbers(numbers);
		System.out.println("Sum Of Odd Numbers: "+ sumOfOddNumbers);
	}

	private static Integer sumOfOddNumbers(List<Integer> numbers) {
		return numbers.stream().filter(num -> num % 2 != 0).reduce(0, Integer::sum);
	}

	private static Integer sumOfEvenNumbers(List<Integer> numbers) {
		return numbers.stream().filter(num -> num % 2 == 0).reduce(0, Integer::sum);
	}

}
