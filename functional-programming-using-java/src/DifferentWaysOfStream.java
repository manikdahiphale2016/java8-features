import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class DifferentWaysOfStream {

	public static void main(String[] args) {

		System.out.println(
						Stream.of(12,3,4,2,5,9,7,14,12).count());
		
		System.out.println(
				Stream.of(12,3,4,2,5,9,7,14,12).reduce(0, Integer::sum));
		
		// By using primitive array
		int[] numberArray = {12,3,4,2,5,9,7,14,12};
		System.out.println(
					Arrays.stream(numberArray).count());
		
		System.out.println(
				Arrays.stream(numberArray).sum());
		
		System.out.println(
				Arrays.stream(numberArray).max());
		System.out.println(
				Arrays.stream(numberArray).min());
		
		
		// By using IntStream
		IntStream.range(1, 10);
		
		System.out.println(
		IntStream.range(1, 10).sum());
//		o/p: 45
		
		System.out.println(
				IntStream.rangeClosed(1, 10).sum());
//		o/p: 55
		
		System.out.println(
		IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum());
//		Sum of even numbers
		System.out.println(
				IntStream.iterate(2, e -> e + 2).limit(100).peek(System.out::println).sum());
		
		
		System.out.println(
				IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum());
		
		System.out.println(
				IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList()));
		
// DoubleStream , LongStream
		
//		Calculate first 50 number factorial
		
		System.out.println(
				LongStream.range(1, 50)
						  .mapToObj(BigInteger::valueOf)
						  .reduce(BigInteger.ONE, BigInteger::multiply)
				);
		
	}

}
