package com.morcinek.codility.genomicRangeQuery;

/**
 * Tomasz Morcinek 2017
 */
public class GenomicRangeQueryTestJava extends GenomicRangeQueryTest {

    private static final int MAX_VALUE = 4;

    @Override
    public int[] solution(String S, int[] P, int[] Q) {
        int maxValue = MAX_VALUE;
        int[] values = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int intValue = getIntValue(S.charAt(i));
            values[i] = intValue;
            maxValue = Math.min(maxValue, intValue);
        }
        int M = P.length;
        int[] response = new int[M];
        for (int K = 0; K < M; K++) {
            int start = P[K];
            int end = Q[K];
            response[K] = MAX_VALUE;
            for (int i = start; i <= end; i++) {
                response[K] = Math.min(response[K], values[i]);
                if (response[K] == maxValue) {
                    break;
                }
            }
        }
        return response;
    }

    private int getIntValue(char character) {
        switch (character) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
            default:
                return MAX_VALUE;
        }
    }
}
