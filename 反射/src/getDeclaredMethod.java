import java.lang.reflect.Method;

public class getDeclaredMethod {
    public static void main(String[] argv) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> name = Class.forName("java.lang.Runtime");
        Method m = name.getDeclaredMethod("exec",String.class);
        System.out.println(m);
    }
}
