package baitap.map_ver2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main_Dictionary implements Serializable {
    public static void main(String[] args) {
        Map<String, Dictionary> dictionaryMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        // set giá giá trị mặc định cho map
        Dictionary dictionarys = new Dictionary();
        dictionarys.setEnglishWord("strong");
        dictionarys.setVietnamWord("sức mạnh");
        dictionaryMap.put(dictionarys.getEnglishWord(),dictionarys);

        while (true){
            System.out.println("Mời bạn nhập vào lựa chọn:");
            System.out.println(" 1. Thêm từ mới vào từ điển \n 2. Tìm kiếm từ tiếng việt theo từ tiêng anh \n" +
                    " 3. xóa từ khỏi từ điển \n 4. cập nhật từ trong từ điển \n 5. thoát");
            int selected = scanner.nextInt();
            scanner.nextLine();
            if (selected == 5){
                break;}

            switch (selected){
                case 1:
                    // Nhập vào từ điển
                    System.out.println("Mời bạn nhập vào số lượng từ trong từ điển: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Mời bạn nhập vào từ thứ: " + (i+1));
                        Dictionary dictionary = new Dictionary();
                        dictionary.input();
                        dictionaryMap.put(dictionary.getEnglishWord(), dictionary);
                    }

                    // in ra màn hình
                    System.out.println();
                    System.out.println("Thông tin từ điển là: ");
                    Set<String> dictionarySet = dictionaryMap.keySet();
                    for (String set : dictionarySet) {
                        System.out.println(dictionaryMap.get(set.toString()));
                    }
                    break;
                case 2:
                    // tìm kiếm theo tên tiếng anh
                    System.out.println();
                    System.out.println("Mời bạn nhập vào từ tiếng anh cần tìm kiếm: ");
                    String english_word = scanner.nextLine();
                    if (dictionaryMap.containsKey(english_word)){
                        Dictionary dictionaryFind = dictionaryMap.get(english_word);

                        //in ra màn hình
                        System.out.println("Từ bạn vừa tìm kiếm là: ");
                        System.out.println(dictionaryFind);
                    }else{
                        System.out.println("Từ bạn tìm không có trong từ điển!");
                    }
                    break;
                case 3:
                    // remove từ điển theo tên tiếng anh
                    System.out.println();
                    System.out.println("Mời bạn nhập vào từ tiếng anh cần xóa: ");
                    String enlish_word1 = scanner.nextLine();
                    if (dictionaryMap.containsKey(enlish_word1)){
                        dictionaryMap.remove(enlish_word1);

                        //in ra màn hình
                        System.out.println("Thông tin từ điển sau khi xóa là: ");
                        Set<String> dictionaryRemove = dictionaryMap.keySet();
                        for (String dtc : dictionaryRemove) {
                            System.out.println(dictionaryMap.get(dtc.toString()));
                        }
                    }else {
                        System.out.println("Từ bạn cần xóa không có trong từ điển:");
                    }
                    break;
                case 4:
                    // sửa một từ trong từ điển
                    System.out.println();
                    System.out.println("Mời bạn nhập vào từ cần sửa: ");
                    String editWord = scanner.nextLine();
                    if (dictionaryMap.containsKey(editWord)){
                        Dictionary dictionaryEdit = new Dictionary();
                        dictionaryEdit.input();
                        dictionaryMap.put(dictionaryEdit.getEnglishWord(),dictionaryEdit);

                        System.out.println("Từ trước khi sửa là: ");
                        System.out.println(dictionaryMap.get(editWord));

                        dictionaryMap.remove(editWord);

                        System.out.println("Từ điển sau khi sửa là: ");
                        System.out.println(dictionaryEdit);
                    }else {
                        System.out.println("Từ bạn cần sửa không có trong từ điển");
                    }
                    break;
            }
        }
        File file = new File("D:\\Compressed\\Nộp BT\\Java\\db.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
            out.writeObject(dictionaryMap);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
