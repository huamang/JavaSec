import java.io.*;

public class encodeTest {
    public static void main(String[] args) throws IOException {
        encode(
              new File("/Users/liucheng/Desktop/JavaSec/out/production/Classloader/messageTest.class"),
              new File("/Users/liucheng/Desktop/JavaSec/out/production/Classloader/test/messageTest.class")
        );
    }
    public static void encode(File src, File out) throws IOException {
        FileInputStream fin;
        FileOutputStream fout;

        fin = new FileInputStream(src);
        fout = new FileOutputStream(out);

        int temp = -1;
        while ((temp = fin.read()) != -1) {// 读取一个字节
            fout.write(temp ^ 0xff);// 取反输出
        }
        fin.close();
        fout.close();
    }
}
