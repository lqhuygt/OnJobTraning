package com.nopbaikiemtra;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class File {
    public static void main(String[] args) throws IOException {
        try {
            // Đọc file
            List<Integer> arrayList = new ArrayList<>();
            FileInputStream fileInputStream = new FileInputStream("./input.txt");
            int c = fileInputStream.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fileInputStream.read();
                arrayList.add(c);
            }

            // Ghi file
//            FileOutputStream fileOutputStream = new FileOutputStream("./output.txt");
            FileOutputStream fos = new FileOutputStream("./output.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(osw);
            Collections.sort(arrayList);
            for (Integer item: arrayList){
                writer.write(item);
            }
            fileInputStream.close();
            writer.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

}
