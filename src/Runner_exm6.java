import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class Runner_exm6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", "C++");

        //->4, 10, 3

        ToIntFunction<String> function = (str) -> str.length();
        list.stream().mapToInt(function).forEach(System.out::println);
    }
}
