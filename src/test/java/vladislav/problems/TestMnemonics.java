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
}
