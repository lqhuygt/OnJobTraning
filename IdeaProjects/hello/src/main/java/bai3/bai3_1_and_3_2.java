package bai3;


import java.io.*;

// Write a program that allow user enter a file name (path) then content, allow user to save it
public class bai3_1_and_3_2 {
    public static void main(String[] args) throws IOException {
        readFile();
        writeFile();
    }

    public static void readFile() throws IOException {
        String str = "";
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\Program Files\\javademo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(true){
            int doc = fileInputStream.read();
            if (doc == -1)break;
            char c = (char)doc;
            str +=c;
        }
        System.out.println("file readed is: " + str);

        fileInputStream.close();
    }

    public static void writeFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Program Files\\javademo.txt");
        String str = "you need to try hard learn java";
        for (int i = 0; i < str.length() ; i++) {
            fileOutputStream.write(str.charAt(i));
        }
        fileOutputStream.close();
        System.out.println("file writed is success ");
    }
}
