package baitap.map_ver2;

import java.util.Scanner;

public class Dictionary {
    private String englishWord;
    private String vietnamWord;

    public Dictionary(String englishWord, String vietnamWord) {
        this.englishWord = englishWord;
        this.vietnamWord = vietnamWord;
    }

    public Dictionary() {
    }

    public String getVietnamWord() {
        return vietnamWord;
    }

    public void setVietnamWord(String vietnamWord) {
        this.vietnamWord = vietnamWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời nhập vào từ tiếng anh: ");
        englishWord = scanner.nextLine();
        System.out.println("Mời nhập vào từ tiếng việt: ");
        vietnamWord = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "englishWord='" + englishWord + '\'' +
                ", vietnamWord='" + vietnamWord + '\'' +
                '}';
    }
}
