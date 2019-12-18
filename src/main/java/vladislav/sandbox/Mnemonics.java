package vladislav.sandbox;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Mnemonics {
    public static ArrayList<Mnemonic> findAllMnemonics(String s) {
        ArrayList<Mnemonic> mnemonics = new ArrayList<>();

        final char[] chars = s.toCharArray();
        final int len = chars.length;
        StringBuilder raw_mnemonic;
        for (int i = 0; i < len; i++) {
            if (chars[i] == '&') {
                raw_mnemonic = new StringBuilder("&");
                i++;
                for (; i < len; i++) {
                    if (chars[i] == ' ') {
                        break;
                    } else if (chars[i] == ';') {
                        raw_mnemonic.append(';');
                        try {
                            mnemonics.add(new Mnemonic(raw_mnemonic.toString()));
                            break;
                        } catch (Exception e) {
                            break;
                        }
                    } else {
                        raw_mnemonic.append(chars[i]);
                    }
                }
            }
        }

        return mnemonics;
    }

    public static ArrayList<Integer> findAllMnemonicsIndexes(String s) {
        ArrayList<Integer> mnemonics = new ArrayList<>();

        final char[] chars = s.toCharArray();
        final int len = chars.length;
        int index_start;
        int index_end;
        for (int i = 0; i < len; i++) {
            if (chars[i] == '&') {
                index_start = i;
                i++;
                for (; i < len; i++) {
                    if (chars[i] == ' ') {
                        break;
                    } else if (chars[i] == ';') {
                        index_end = i;
                        if (index_end - index_start > 1) {
                            mnemonics.add(index_start);
                            mnemonics.add(index_end);
                        }
                    }
                }
            }
        }

        return mnemonics;
    }

    public static void replaceAllMnemonics(Stream<String> stream) {
        stream.forEach(str -> Mnemonics.replaceAllMnemonics(str, "\""));
    }

    private static void replaceAllMnemonics(String str, String s) {
//        ArrayList<Integer> indexes = findAllMnemonicsIndexes(str);
//        str.chars();
//        for (int i = 0; i < indexes.size(); i += 2) str.replace()
    }

    public static class UtilsHolder {
        public static final Mnemonics HOLDER_INSTANCE = new Mnemonics();
    }

    public static Mnemonics getInstance() {
        return UtilsHolder.HOLDER_INSTANCE;
    }


}
