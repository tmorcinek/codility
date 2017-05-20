package com.morcinek.codility.countDiv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tomasz Morcinek 2017
 */
public class CountDivTestJava extends CountDivTest {

    @Override
    public int solution(int A, int B, int K) {
        int modA = A % K;
        int sum = (modA + B - A)/ K;
        if (modA == 0) {
            sum++;
        }
        return sum;
    }

    @Test
    public void modK() throws Exception {
        assertEquals(0, 6 % 2);
        assertEquals(1, 7 % 2);
    }
}
