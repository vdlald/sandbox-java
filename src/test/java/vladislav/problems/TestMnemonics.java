package vladislav.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMnemonics {

    private Stream<String> stream;

    @BeforeEach
    void setUp() throws IOException {
        stream = Files.lines(Paths.get(
                getClass().getClassLoader().getResource("mnemonic.md").getPath()
        ));
    }

    @Test
    void test_replace_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace(stream, "\"\n"));
    }

    @Test
    void test_replace1_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace1(stream, "\"\n"));
    }

    @Test
    void test_replace2_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace2(stream, "\"\n"));
    }

    @Test
    void test_replace3_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace3(stream, "\"\n"));
    }

    @Test
    void test_replace4_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace4(stream, "\"\n"));
    }

    @Test
    void test_replace5_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace5(stream, "\"\n"));
    }

    @Test
    void test_replace6_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace6(stream, "\"\n"));
    }

    @Test
    void test_replace7_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace7(stream, "\"\n"));
    }

    @Test
    void test_replace8_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace8(stream, "\"\n"));
    }

    @Test
    void test_replace9_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace9(stream, "\"\n"));
    }

    @Test
    void test_replace10_mnemonics() {
        assertEquals("Text with \"\n" +
                "symbol-mnemonics\"\n" +
                " and \"\n" +
                "Some text here", Mnemonics.replace10(stream, "\"\n"));
    }
}
