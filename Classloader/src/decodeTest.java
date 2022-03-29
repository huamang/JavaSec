import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class decodeTest extends ClassLoader{
    private String rootDir;

    public decodeTest(String rootDir) {
        this.rootDir = rootDir;
    }

    // 解密文件
    public byte[] getClassData(String className) throws IOException {
        String path = rootDir + "/" + className.replace('.', '/') + ".class";
        // 将流中的数据转换为字节数组
        InputStream is = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        is = new FileInputStream(path);
        byte[] buffer = new byte[1024];
        int temp = -1;
        while ((temp = is.read()) != -1) {
            baos.write(temp ^ 0xff);
        }
        return baos.toByteArray();
    }

    @Override // 重写覆盖findClass
    protected Class<?> findClass(String className) throws ClassNotFoundException {
        Class<?> c = findLoadedClass(className);
        if (c != null) {
            return c;
        } else {
            ClassLoader parent = this.getParent();

            c = parent.loadClass(className);
            if (c != null) {
                System.out.println("父类成功加载");
                return c;
            } else {// 读取文件 转化成字节数组
                byte[] classData = new byte[0];
                try {
                    classData = getClassData(className);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (classData == null) {
                    throw new ClassNotFoundException();
                } else { // 调用defineClass()方法
                    c = defineClass(className, classData, 0, classData.length);
                    return c;
                }
            }
        }
    }
}

