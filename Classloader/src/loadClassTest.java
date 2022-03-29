public class loadClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        decodeTest de = new decodeTest("/Users/liucheng/Desktop/JavaSec/out/production/Classloader/test/");
        Class<?> a = de.loadClass("messageTest");
        System.out.println(a);
    }

}
