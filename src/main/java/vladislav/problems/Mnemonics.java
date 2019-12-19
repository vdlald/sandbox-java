package vladislav.problems;

import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mnemonics {
    public static String replace(Stream<String> stream, String replacement) {
        return stream.map(s -> s.replaceAll("&[a-zA-Z0-9]+;", replacement)).reduce(String::concat).get();
    }

    public static String replace1(Stream<String> stream, String replacement) {
        StringBuilder string = new StringBuilder();
        stream.forEach(s -> string.append(s.replaceAll("&[a-zA-Z0-9]+;", replacement)));
        return string.toString();
    }

    // Equals replace
    public static String replace2(Stream<String> stream, String replacement) {
        return stream.map(s -> s.replaceAll("&[a-zA-Z0-9]+;", replacement)).reduce((s1, s2) -> s1 + s2).get();
    }

    public static String replace3(Stream<String> stream, String replacement) {
        return stream.map(s -> s.replaceAll("&[a-zA-Z0-9]+;", replacement)).collect(Collectors.joining());
    }

    public static String replace4(Stream<String> stream, String replacement) {
        return stream.map(s -> s.replaceAll("&[a-zA-Z0-9]+;", replacement)).collect(Collector.of(
                () -> new StringJoiner(""),
                StringJoiner::add,
                StringJoiner::merge,
                StringJoiner::toString
        ));
    }

    public static String replace5(Stream<String> stream, String replacement) {
        return stream.map(s -> s.replaceAll("&[a-zA-Z0-9]+;", replacement)).collect(Collector.of(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append,
                StringBuilder::toString
        ));
    }

    public static String replace6(Stream<String> stream, String replacement) {
        return stream.reduce(
                "",
                (s, s2) -> s.concat(s2.replaceAll("&[a-zA-Z0-9]+;", replacement)),
                String::concat
        );
    }

    public static String replace7(Stream<String> stream, String replacement) {
        return stream.parallel().reduce(
                "",
                (s, s2) -> s.concat(s2.replaceAll("&[a-zA-Z0-9]+;", replacement)),
                String::concat
        );
    }

    public static String replace8(Stream<String> stream, String replacement) {
        return stream.parallel().reduce(
                "",
                (s, s2) -> s.concat(s2.replaceAll("&[a-zA-Z0-9]+;", replacement))
        );
    }

    public static String replace9(Stream<String> stream, String replacement) {
        return stream.reduce("", String::concat).replaceAll("&[a-zA-Z0-9]+;", replacement);
    }

    public static String replace10(Stream<String> stream, String replacement) {
        return stream.parallel().reduce("", String::concat).replaceAll("&[a-zA-Z0-9]+;", replacement);
    }
}
