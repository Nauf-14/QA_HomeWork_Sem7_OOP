package QA_HomeWork_Sem7_OOP;

public class ConsoleLogger implements Loggable {
    public void log(String message) {
        System.out.println("Журнал: " + message);
    }
}
