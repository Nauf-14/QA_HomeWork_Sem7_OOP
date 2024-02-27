// Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
// Применить при создании программы архитектурные паттерны, добавить логирование калькулятора
// Соблюдать принципы SOLID, паттерны проектирования.

package QA_HomeWork_Sem7_OOP;

public class Main {
    public static void main(String[] args) {
        IComplexNumberFactory complexNumberFactory = new ComplexNumberFactory();
        ViewCalculator view = new ViewCalculator(complexNumberFactory);
        view.run();
    }
}
