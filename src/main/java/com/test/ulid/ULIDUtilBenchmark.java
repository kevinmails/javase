package com.test.ulid;

import com.test.java8.LongAdderTest;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
//@OutputTimeUnit(TimeUnit.SECONDS)
@Fork(value = 1) // 运行1个副本
@Warmup(iterations = 5) // 5次预热迭代
//@Measurement(iterations = 10) // 10次测量迭代
@State(Scope.Benchmark)
public class ULIDUtilBenchmark {

    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(ULIDUtilBenchmark.class.getName())
                .warmupIterations(2) // 预热次数
                .forks(1).build();
        new Runner(options).run();
    }

    @Benchmark
    @Threads(10)
    @Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
    public String ulid() {
        return ULIDUtil.ulid();
    }

    @Benchmark
    @Threads(10)
    @Measurement(iterations = 5, time = 5)
    public String monotonicULID() {
        return ULIDUtil.monotonicULID();
    }
}
