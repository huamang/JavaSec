public class forName {
    public static void main(String[] args) throws ClassNotFoundException {
        Class name = Class.forName("java.lang.Runtime");
        System.out.println(name);
    }
}