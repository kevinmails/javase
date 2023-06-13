package com.test.java8;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

@OutputTimeUnit(TimeUnit.MICROSECONDS)
@BenchmarkMode(Mode.Throughput)
public class LongAdderTest {

//    private static  long sum = 0L;

    private static LongAdder sum = new LongAdder();


    public static void main(String[] args) throws RunnerException {


        Options options = new OptionsBuilder().include(LongAdderTest.class.getName()).forks(1).build();
        new Runner(options).run();


    }

    @Benchmark
    @Threads(10)
    public void measureRun() {
        sum.increment();
    }

}
