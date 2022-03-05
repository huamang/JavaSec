public class getClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Runtime rt = Runtime.getRuntime();
        Class<?> name = rt.getClass();
        System.out.println(name);
    }
}
