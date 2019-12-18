package vladislav.problems;

import java.util.stream.Stream;

class Mnemonics {
    static String replace(Stream<String> stream, String replacement) {
        StringBuilder string = new StringBuilder();
        stream.forEach(s -> string.append(s.replaceAll("&[^\\s;]+;", replacement)));
        return string.toString();
    }
}
