package vladislav.sandbox;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vladislav.sandbox.Mnemonic;

import static org.junit.jupiter.api.Assertions.*;

class TestMnemonic {
    private Mnemonic quote1;
    private Mnemonic quote2;

    @BeforeEach
    void setUp() throws Exception {
        quote1 = new Mnemonic("&quot;");
        quote2 = Mnemonic.quote();
    }

    @Test
    void test_is_mnemonic() {
        assertTrue(Mnemonic.isMnemonic("&quot;"));
        assertFalse(Mnemonic.isMnemonic("quot;"));
        assertFalse(Mnemonic.isMnemonic("&quot"));
        assertFalse(Mnemonic.isMnemonic("&;"));
    }

    @Test
    void test_to_string() {
        assertEquals("&quot;", quote2.toString());
    }
}
