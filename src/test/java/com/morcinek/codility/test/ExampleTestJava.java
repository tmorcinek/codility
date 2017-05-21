package com.morcinek.codility.test;

/**
 * Tomasz Morcinek 2017
 */
public class ExampleTestJava extends ExampleTest {

    public int solution(int[] A) {
        long sumLeft = 0;
        long sumRight = 0;
        for (int it : A) {
            sumRight += it;
        }
        for (int i = 0; i < A.length; i++) {
            if (sumRight - A[i] == sumLeft) {
                return i;
            }
            sumRight -= A[i];
            sumLeft += A[i];
        }
        return -1;
    }
}
