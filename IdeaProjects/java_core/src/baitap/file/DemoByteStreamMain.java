package baitap.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoByteStreamMain {
    public static void main(String[] args) {
        try {
            readFile();
            exportFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void  exportFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Compressed\\Nộp BT\\Java\\demo.txt");
        String input = "hé lu các bẹn";
        for (int i = 0; i <input.length() ; i++) {
            try {
                fileOutputStream.write(input.charAt(i));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        fileOutputStream.close();
        System.out.println("Đã ghi file thành công");
    }

    public static void readFile(){
        String str = "";
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Compressed\\Nộp BT\\Java\\demo.txt");
            while (true){
                int i = fileInputStream.read();
                if(i==-1){
                    System.out.println("Hết file");
                    break;
                }
                char c = (char)i;
                str += c;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Kết quả đọc file:  " + str);
        System.out.println("Kết thúc chương trình");
    }
}
