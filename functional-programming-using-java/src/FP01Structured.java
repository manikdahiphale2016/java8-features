import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		printAllNumbersInListStructured(List.of(12, 9, 13, 17, 2, 4, 6, 7, 15, 11));
	}

	public static void print(int num) {
		System.out.println(num);
	}
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		
		//what to do?
		numbers.stream()
			   .forEach(System.out::println); //Method Reference
	}

}
