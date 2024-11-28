package Study_20241128;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class MyFileIOMain {
    public static void directory_file_list() {
        File file = new File("src");
//        file.list(); // 폴더에 있는 모든 파일 + 폴더

        File[] files = file.listFiles(); // src 폴더 내에 있는 파일 객체로 반환

        for (var f : files) {
            if (f.isDirectory()) {
                System.out.println("디렉터리명:"+f.getName());
            } else {
                System.out.println("파일명:"+f.getName());
                System.out.println("파일크기:"+f.length());
            }
        }
    }

    public static void read_btye() {
        try {
            FileInputStream in = new FileInputStream("my.txt");
            // 1)
//            int data = in.read();
//            System.out.println((char)data);
//            data = in.read(); // 다음 byte를 읽음
//            System.out.println((char)data);

            // 2)
//            while (true) {
//                int data = in.read(); // 1 바이트 읽고, 다음 반복문에 또 다음 바이트 읽음
//                if (data == -1) {
//                    break;
//                }
//            System.out.println((char)data);
//            }
//            in.close(); // 읽고 닫아주어야함

            // 3)
            byte[] data = in.readAllBytes();
            System.out.println(new String(data));
            System.out.println(Arrays.toString(data));

            in.close(); // 읽고 닫아주어야함

        } catch (Exception e) {
            System.out.println("파일 없음");
        }
    }

    public static void write_byte() {
        try {
            FileOutputStream out = new FileOutputStream("cfgjjfg.txt");
            String word = "Hello python!";
            byte[] chars = word.getBytes();
            out.write(chars);
            out.close();
        }catch (Exception e){
            System.out.println("파일 없음!!");
        }
    }

    public static void copy_paste() {
        try {
            File ori = new File("1.jpg");
            File copied = new File("copy.jpg");

            FileInputStream fis = new FileInputStream(ori);
            FileOutputStream fos = new FileOutputStream(copied);

            byte[] data = fis.readAllBytes();
            fos.write(data);

            fos.close();
            fis.close();
        } catch(Exception e) {}

    }
    public static void main(String[] args) {
        // 1.
//        File file = new File("my.txt");
//        System.out.println(file.isFile());
//        System.out.println(file.length());
//
//        // 디렉토리 생성
//        File dir = new File("mydir");
//        dir.mkdir();
//
//        // 계층 디렉토리 생성
//        File dirs = new File("a/b/c");
//        dirs.mkdirs();

        // 2.
//        directory_file_list();

        // 3.
//        read_btye();

        // 4.
//        write_byte();

        // 5.
        copy_paste();
    }
}
