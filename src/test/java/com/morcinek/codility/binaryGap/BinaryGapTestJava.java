package com.morcinek.codility.binaryGap;

import org.jetbrains.annotations.NotNull;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Copyright 2017 Tomasz Morcinek. All rights reserved.
 */
public class BinaryGapTestJava extends BinaryGapTest {

    @NotNull
    @Override
    protected Solution createSolution() {
        return new Solution() {

            @Override
            public int solution(int N) {
                int maxGap = 0;
                int currentGap = -1;
                while (N > 0) {
                    if (N % 2 > 0) {
                        maxGap = Math.max(maxGap, currentGap);
                        currentGap = 0;
                    } else if (currentGap >= 0) {
                        currentGap++;
                    }
                    N /= 2;
                }
                return maxGap;
            }
        };
    }

    @Test
    public void test5() throws Exception {
//        5 = 101

        assertEquals(5 / 2, 2); // ^10|1
        assertEquals(5 % 2, 1); // 10|1^
        assertEquals(5 >> 1, 2);// ^10|1
    }

    @Test
    public void test4() throws Exception {
//        4 = 100

        assertEquals(4 / 2, 2); // ^10|0
        assertEquals(4 % 2, 0); // 10|0^
        assertEquals(4 >> 1, 2);// ^10|0
    }

    @Test
    public void test2() throws Exception {
//        2 = 10

        assertEquals(2 / 2, 1); // ^1|0
        assertEquals(2 % 2, 0); // 1|0^
        assertEquals(2 >> 1, 1);// ^1|0
    }
}
