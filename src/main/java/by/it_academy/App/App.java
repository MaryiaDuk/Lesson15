package by.it_academy.App;

public class App {
    public static void main(String[] args) {
        String str ="Hellowoooorld";
        WordCompressor wc = new WordCompressor();
        String compressWord = wc.compressWord(str);
        System.out.println(compressWord);
        System.out.println(wc.decompressWord(compressWord));
    }
}