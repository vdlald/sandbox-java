package vladislav.problems;

import java.util.stream.Stream;

class Mnemonics {
    static String replace(Stream<String> stream, String replacement) {
        // variant 1: speed 44ms - 49ms for mnemonics.md
//        StringBuilder string = new StringBuilder();
//        stream.forEach(s -> string.append(s.replaceAll("&[^\\s;]+;", replacement)));
//        return string.toString();

        // variant 2: speed 74ms - 90ms for mnemonics.md
//        return stream.map(s -> s.replaceAll("&[^\\s;]+;", replacement)).reduce((s1, s2) -> s1. + s2).get();

        // variant 3: speed 29 - 39ms for mnemonics.md
        return stream.map(s -> s.replaceAll("&[a-zA-Z]+;", replacement)).reduce(String::concat).get();
    }
}
