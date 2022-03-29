import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderTest {
    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        URL url = new URL("http://127.0.0.1:8080/javatest/");
        URLClassLoader cl = new URLClassLoader(new URL[]{url});
        Class c = cl.loadClass("Test");
        c.newInstance();
    }
}
