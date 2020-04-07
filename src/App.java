import ali.Account;
import ali.Finder;
import ali.MyClass;
import ali.Sayable;

import java.lang.reflect.InvocationTargetException;

class Simple{
    void message(){
        System.out.println("Hello");
    }
}
public class App {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        try {
            Object object = Class.forName("Simple").getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}