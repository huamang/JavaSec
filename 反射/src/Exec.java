import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exec {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class c = Class.forName("java.lang.Runtime");
        Constructor con = c.getDeclaredConstructor();
        con.setAccessible(true);
        Method m = c.getMethod("exec",String.class);
        m.invoke(con.newInstance(),"/System/Applications/Calculator.app/Contents/MacOS/Calculator");
    }
}
