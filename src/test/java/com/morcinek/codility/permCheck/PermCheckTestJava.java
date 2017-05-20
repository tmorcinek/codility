package com.morcinek.codility.permCheck;

/**
 * Tomasz Morcinek 2017
 */
public class PermCheckTestJava extends PermCheckTest {

    @Override
    public int solution(int[] A) {
        boolean[] exists = new boolean[A.length + 1];
        long sum = 0;
        for (int it : A) {
            sum += it;
            if (exists[it-1]) {
                return 0;
            } else {
                exists[it-1] = true;
            }
        }
        long length = A.length;
        long realSum = length * (2 + length - 1) / 2;
        return (int) (realSum - sum) == 0 ? 1 : 0;
    }
}
