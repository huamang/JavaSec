import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class newInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class name = Class.forName("java.lang.Runtime");
        Object r = name.newInstance();
        Method m = name.getMethod("exec",String.class);
        m.invoke(m,"/System/Applications/Calculator.app");
    }
}
