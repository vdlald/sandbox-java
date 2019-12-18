package vladislav.sandbox;

public class Mnemonic {

    private final String value;

    public Mnemonic(String s) throws Exception {
        if (Mnemonic.isMnemonic(s)) {
            value = s;
        } else {
            throw new Exception("is not a symbol of a mnemonic");
        }
    }

    public static Mnemonic quote() throws Exception {
        return new Mnemonic("&quot;");
    }

    public static boolean isMnemonic(String s) {
        return s.length() > 2 && s.charAt(0) == '&' && s.charAt(s.length() - 1) == ';';
    }

    @Override
    public String toString() {
        return value;
    }
}
