package com.morcinek.codility.distinct;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Tomasz Morcinek 2017
 */
public class DistinctTestJava extends DistinctTest {

    @Override
    public int solution(@NotNull int[] A) {
        Arrays.sort(A);
        int prev = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (prev != A[i]) {
                count++;
                prev = A[i];
            }
        }
        return count;
    }
}
