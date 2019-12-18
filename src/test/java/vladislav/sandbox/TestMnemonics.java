package vladislav.sandbox;

import org.junit.jupiter.api.Test;
import vladislav.sandbox.Mnemonic;
import vladislav.sandbox.Mnemonics;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMnemonics {
    @Test
    void test_find_mnemonics_string() {
        ArrayList<Mnemonic> mnemonics = Mnemonics.findAllMnemonics("&quot;  &not;");
        assertEquals("[&quot;, &not;]", mnemonics.toString());

        mnemonics = Mnemonics.findAllMnemonics("&quot;");
        assertEquals("[&quot;]", mnemonics.toString());

        mnemonics = Mnemonics.findAllMnemonics("&;");
        assertEquals("[]", mnemonics.toString());

        mnemonics = Mnemonics.findAllMnemonics("&quot; &  a; &not;");
        assertEquals("[&quot;, &not;]", mnemonics.toString());
    }

    @Test
    void test_find_mnemonics_indexes() {
        ArrayList<Integer> mnemonics = Mnemonics.findAllMnemonicsIndexes("&quot;  &not;");
        assertEquals("[0, 5, 8, 12]", mnemonics.toString());
    }

    @Test
    void test_find_mnemonics_stream() throws IOException {
        Stream<String> stream = Files.lines(Paths.get(
                getClass().getClassLoader().getResource("mnemonic.md").getPath()
        ));
        stream.forEach(str -> str.chars().forEach(System.out::println));
//        System.out.println(Mnemonics.replaceAllMnemonics(stream));
    }
}
