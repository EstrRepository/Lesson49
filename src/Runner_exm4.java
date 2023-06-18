import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Runner_exm4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "JavaScript", "Python", "C++");

        for (String item : list) {
            System.out.println(item);
        }

        Consumer<String> consumer1 = (item) -> System.out.println(item);
        Consumer<String> consumer2 = System.out::println;
        list.forEach(consumer1);

        list.forEach((item) -> System.out.println(item));

        list.forEach(consumer2);
        //или ещё короче
        list.forEach(System.out::println);
    }
}
