import by.itclass.interfaces.Actionable;

public class Runner_exm1 {
    public static void main(String[] args) {
        //Функциональные интерфейсы Java 8
        //и их связь с лямбда выражениями
        //Лямбда выражения это "синтаксический сахар", который позволяет сократить,
        //а иногда и упростить код
        //Лямбда выражения используются только для реализации функциональных интерфейсов

        //Функциональные интерфейсы могут быть реализованы с помощью анонимных классов, кака и обычные интерфейсы
        Actionable actionable = new Actionable() {
            @Override
            public void test() {
                System.out.println("Hello from anonymous");
            }
        };

        //Функциональные интерфейсы могут быть реализованы с помощью лямбда выражений
        Actionable lambda1 = () -> {
            System.out.println("Hello from lambda!");
        };

        actionable.test();
        lambda1.test();

    }
}
