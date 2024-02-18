import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(6,6,6,6);
		Integer result = addListFunctional(numbers);
		System.out.println(result);
	}

	private static int addListFunctional(List<Integer> numbers) {

//		Integer sum = numbers.stream().reduce(0, Integer::sum);
		
		Integer sum = numbers.stream().reduce(0, (x,y) -> x+y);

		return sum;
	}

}
