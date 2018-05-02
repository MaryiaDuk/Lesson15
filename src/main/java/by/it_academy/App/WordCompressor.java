package by.it_academy.App;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCompressor {

    public String compressWord(String word) {
        Pattern pattern = Pattern.compile("([a-zA-Z])\\1+");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            word = matcher.replaceFirst(matcher.group().substring(0, 1) + matcher.group().length());
            matcher.reset(word);
        }
        return word;
    }

    public String decompressWord(String word) {
        Pattern pattern = Pattern.compile("[a-zA-Z]\\d+");
        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            String resultString = "";
            for (int i = 0; i < Integer.parseInt(matcher.group().substring(1)); i++)
                resultString += matcher.group().substring(0, 1);
            word = matcher.replaceFirst(resultString);
            matcher.reset(word);
        }
        return word;
    }
}