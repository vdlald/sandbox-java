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
}
