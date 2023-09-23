import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    int[] intList = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};

    List<Integer> result = Arrays.stream(intList)
            .filter(x -> x > 0)
            .filter(x -> x % 2 == 0)
            .boxed()
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
}

