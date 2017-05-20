package com.morcinek.codility.frogJmp;

/**
 * Tomasz Morcinek 2017
 */
public class FrogJmpTestJava extends FrogJmpTest {

    @Override
    public int solution(int X, int Y, int D) {
        return Math.max(0, (int) Math.ceil(Math.abs(Y - X) /  (double)D));
    }
}
