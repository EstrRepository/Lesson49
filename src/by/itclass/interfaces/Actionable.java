package by.itclass.interfaces;

//Функциональный интерфейс - это интерфейс в котором определяется только один нереализованный метод
//добавляем реализованные методы класса Object - то также будет оставаться функциональный интерфейс
@FunctionalInterface//анализирует сама java на то явл.ли интерфейс функциональным
public interface Actionable {
    void test();
    String toString();
}
