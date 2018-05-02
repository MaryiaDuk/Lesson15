package by.it_academy.Test;

import by.it_academy.App.WordCompressor;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordCompressorTest {
    @Test
    public void compressString() {
        WordCompressor wc = new WordCompressor();
        assertEquals("hel2owo4rld", wc.compressWord("hellowoooorld"));
    }

    @Test
    public void compressOneWord() {
        WordCompressor wc = new WordCompressor();
        assertEquals("Hi2", wc.compressWord("Hii"));
    }

    @Test
    public void compressFewWords() {
        WordCompressor wc = new WordCompressor();
        assertEquals("Hi2 M2y name2 i3s Ma2ry", wc.compressWord("Hii MMy namee iiis Maary"));
    }

    @Test
    public void decompressOneWords() {
        WordCompressor wc = new WordCompressor();
        assertEquals("Heeellooo", wc.decompressWord("He3l2o3"));
    }

    @Test
    public void decompressFewWords() {
        WordCompressor wc = new WordCompressor();
        assertEquals("Hii MMy namee iiis Maary", wc.decompressWord("Hi2 M2y name2 i3s Ma2ry"));
    }

    @Test
    public void decompressString() {
        WordCompressor wc = new WordCompressor();
        assertEquals("hellowoooorld", wc.decompressWord("hel2owo4rld"));
    }
}