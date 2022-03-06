import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Invoke {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("Invoke");
        Object o = c.newInstance();
        Method m = c.getMethod("test");
        m.invoke(o);
    }
    public void test(){
        System.out.println("测试成功");
    }
}
