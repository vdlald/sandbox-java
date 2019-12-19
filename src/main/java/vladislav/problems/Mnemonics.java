package vladislav.problems;

import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Mnemonics {
    static String replace(Stream<String> stream, String replacement) {
        // variant 1: speed 44ms - 49ms for mnemonics.md
//        StringBuilder string = new StringBuilder();
//        stream.forEach(s -> string.append(s.replaceAll("&[^\\s;]+;", replacement)));
//        return string.toString();

        // variant 2: speed 74ms - 90ms for mnemonics.md
//        return stream.map(s -> s.replaceAll("&[^\\s;]+;", replacement)).reduce((s1, s2) -> s1. + s2).get();

        // variant 3: speed 29ms - 39ms for mnemonics.md
        return stream.map(s -> s.replaceAll("&[a-zA-Z]+;", replacement)).reduce(String::concat).get();

        // variant 4: speed 32ms - 43ms for mnemonics.md
//        return stream.map(s -> s.replaceAll("&[a-zA-Z]+;", replacement)).collect(Collectors.joining());

        // variant 5: speed 29ms - 36ms for mnemonics.md
//        return stream.map(s -> s.replaceAll("&[a-zA-Z]+;", replacement)).collect(Collector.of(
//                () -> new StringJoiner(""),
//                StringJoiner::add,
//                StringJoiner::merge,
//                StringJoiner::toString
//        ));

        // variant 6: speed 30ms - 39ms (max: 54ms) for mnemonics.md
//        return stream.map(s -> s.replaceAll("&[a-zA-Z]+;", replacement)).collect(Collector.of(
//                StringBuilder::new,
//                StringBuilder::append,
//                StringBuilder::append,
//                StringBuilder::toString
//        ));
    }
}
