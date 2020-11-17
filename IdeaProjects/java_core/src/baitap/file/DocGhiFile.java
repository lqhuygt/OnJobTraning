package baitap.file;

import java.io.*;

public class DocGhiFile {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Compressed\\Nộp BT\\Java\\demo.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int c = fileInputStream.read();
            while (c != -1){
                System.out.print((char)c);
                c = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String s = "abc";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();
    }
}
