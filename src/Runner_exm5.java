import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Runner_exm5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-5, 1, -7, 1, 2, -11);

        //удалить из коллекции все отрицательные элементы
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }

        list = Arrays.asList(-5, 1, -7, 1, 2, -11);

        Predicate<Integer> predicate1 = number -> number < 0;
        list.removeIf(predicate1);

        list.removeIf(number -> number < 0);
    }
}
