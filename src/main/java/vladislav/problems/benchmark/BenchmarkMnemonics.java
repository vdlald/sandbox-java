package vladislav.problems.benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import vladislav.problems.Mnemonics;

import java.util.stream.Stream;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

@BenchmarkMode({Mode.AverageTime, Mode.Throughput})
@State(Scope.Benchmark)
@OutputTimeUnit(MILLISECONDS)
@Warmup(iterations = 5, time = 1000, timeUnit = MILLISECONDS)
@Measurement(iterations = 10, time = 1000, timeUnit = MILLISECONDS)
@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
public class BenchmarkMnemonics {

    @Param({"10"})
    private int N;

    public static void main(String[] args) throws RunnerException {

        Options opt = new OptionsBuilder()
                .include(BenchmarkMnemonics.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    public void replace(Blackhole bh) {
        bh.consume(Mnemonics.replace(createData(), "\"\n"));
    }

    @Benchmark
    public void replace1(Blackhole bh) {
        bh.consume(Mnemonics.replace1(createData(), "\"\n"));
    }

    @Benchmark
    public void replace2(Blackhole bh) {
        bh.consume(Mnemonics.replace2(createData(), "\"\n"));
    }

    @Benchmark
    public void replace3(Blackhole bh) {
        bh.consume(Mnemonics.replace3(createData(), "\"\n"));
    }

    @Benchmark
    public void replace4(Blackhole bh) {
        bh.consume(Mnemonics.replace4(createData(), "\"\n"));
    }

    @Benchmark
    public void replace5(Blackhole bh) {
        bh.consume(Mnemonics.replace5(createData(), "\"\n"));
    }

    @Benchmark
    public void replace6(Blackhole bh) {
        bh.consume(Mnemonics.replace6(createData(), "\"\n"));
    }

    @Benchmark
    public void replace7(Blackhole bh) {
        bh.consume(Mnemonics.replace7(createData(), "\"\n"));
    }

    @Benchmark
    public void replace8(Blackhole bh) {
        bh.consume(Mnemonics.replace8(createData(), "\"\n"));
    }

    @Benchmark
    public void replace9(Blackhole bh) {
        bh.consume(Mnemonics.replace9(createData(), "\"\n"));
    }

    @Benchmark
    public void replace10(Blackhole bh) {
        bh.consume(Mnemonics.replace10(createData(), "\"\n"));
    }

    private Stream<String> createData() {
        Stream.Builder<String> stream;
        stream = Stream.<String>builder();
        for (int i = 0; i < N; i++) {
            stream.add(String.format("&quot%d;", i));
        }
        return stream.build();
    }

}

