import by.itclass.interfaces.IFunctional2;

public class Runner_exm3 {
    public static void main(String[] args) {
        //Реализация методов функциональных интерфейсов
        //с помощью ссылок на уже реализованные методы

        IFunctional2 lambda1 = message -> System.out.println(message);
        lambda1.m1("Java 8");

        //Ссылкой на метод можно воспользоваться в том случае если
        //совпадают сигнатуры методов функционального интерфейса и ссылочного
        IFunctional2 lambda2 = System.out::println;
        lambda2.m1("IT CLASS");
    }
}
