import by.itclass.interfaces.IFunctional1;
import by.itclass.interfaces.IFunctional2;

public class Runner_exm2 {
    public static void main(String[] args) {
        //Реализация лямбда выражений
        //(type p1, type p1, ...) -> {реализация лямбда выражений}

        //лямбда выражения определяется только в контексте функционального интерфейса, т.е может быть присвоена
        //только переменной функционального интерфейса
        IFunctional1 lambda1 = (int p1, String p2) -> {
          return "Hello, p1=" + p1 + ", p2=" + p2;
        };

        //Вызов метода m1(), определённого типом данных переменной lambda1
        //вызовет тело реализации лямбда выражения
        String message = lambda1.m1(2023, "II CLASS");
        System.out.println(message);

        //Переменную lambda1 можно использовать для хранения разных реализаций
        //лямбда выражений
        //Можно опустить типы переменных
        //эта информация подтянется из контекста (типа функционального интерфейса)
        lambda1 = (p1, p2) -> "Hello, p1=" + p1 + ", p2=" + p2;
        System.out.println("\n" + lambda1.m1(123, "Java 8"));

        //Если метод функционального интерфейса имеет один параметр
        //то при объявлении лямбда выражения, круглые скобки можно опустить
        IFunctional2 lambda2 = (message1) -> System.out.println(message1);
        lambda2 = message1 -> System.out.println(message1);
        lambda2.m1("IT CLASS");

    }
}
