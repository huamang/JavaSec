public class getSystemClassLoader {
    public static void main(String[] argv) throws ClassNotFoundException {
        Class<?> name = ClassLoader.getSystemClassLoader().loadClass("java.lang.Runtime");
        System.out.println(name);
    }
}
