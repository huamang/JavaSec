import java.lang.reflect.Method;

public class getDeclaredMethods {
    public static void main(String[] argv) throws ClassNotFoundException {
        Class<?> name = Class.forName("java.lang.Runtime");
        System.out.println(name);
        Method[] m = name.getDeclaredMethods();
        for(Method x:m)
            System.out.println(x);
    }
}