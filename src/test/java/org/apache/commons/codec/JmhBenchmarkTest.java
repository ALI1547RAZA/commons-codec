/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.apache.commons.codec;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import java.net.URLClassLoader;
import java.io.File;

public class JmhBenchmarkTest {

    public static void main(String[] args) throws Exception {
        URLClassLoader classLoader = (URLClassLoader) JmhBenchmarkTest.class.getClassLoader();
        StringBuilder classpath = new StringBuilder();
        for (URL url : classLoader.getURLs()) {
            classpath.append(url.getPath()).append(File.pathSeparator);
        }
        System.setProperty("java.class.path", classpath.toString());

        org.openjdk.jmh.Main.main(args);
    }

    @State(Scope.Benchmark)
    public static class ExecutionPlan {

        @Param({"100", "200", "300", "500", "1000"})
        public int iterations;

        //public Hasher murmur3;
        public String password = "4v3rys3kur3p455w0rd";

        @Setup(Level.Invocation)
        public void setUp() {
            //        murmur3 = Hashing.murmur3_128().newHasher();
        }
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    public void benchMurmur3_128(ExecutionPlan plan) {
        for (int i = plan.iterations; i > 0; i--) {
            //       plan.murmur3.putString(plan.password, Charset.defaultCharset());
        }
        //  plan.murmur3.hash();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public void doNothing() {
        // Do nothing
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public void objectCreation() {
        new Object();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public Object pillarsOfCreation() {
        return new Object();
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @BenchmarkMode(Mode.AverageTime)
    public void blackHole(Blackhole blackhole) {
        blackhole.consume(new Object());
    }

    @Benchmark
    public double foldedLog() {
        int x = 8;
        return Math.log(x);
    }

    @Benchmark
    public double foldedLogConstant() {
        return 2.0794415416798357;
    }

    @State(Scope.Benchmark)
    public static class Log {
        public int x = 8;
    }

    @Benchmark
    public double log(Log input) {
        return Math.log(input.x);
    }
}
