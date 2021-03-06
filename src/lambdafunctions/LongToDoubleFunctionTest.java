package lambdafunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void checkPrices(List<Double> prices, Consumer scanner) {
		prices.forEach(scanner);
	}

	public static void main(String[] right) {
		List<Double> prices = Arrays.asList(1.2, 6.5, 3.0);
		checkPrices(prices, p -> {
			String result = p < 5 ? "Correct" : "Too high";
			System.out.println(result);
		});
	}

}
