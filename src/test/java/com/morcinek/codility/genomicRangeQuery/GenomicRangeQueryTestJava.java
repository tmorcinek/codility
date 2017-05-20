package com.morcinek.codility.genomicRangeQuery;

/**
 * Tomasz Morcinek 2017
 */
public class GenomicRangeQueryTestJava extends GenomicRangeQueryTest {

    @Override
    public int[] solution(String S, int[] P, int[] Q) {
        int[] values = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            values[i] = getIntValue(S.charAt(i));
        }
        int M = P.length;
        int[] response = new int[M];
        for (int K = 0; K < M; K++) {
            int start = P[K];
            int end = Q[K];
            response[K] = Integer.MAX_VALUE;
            for (int i = start; i <= end; i++) {
                response[K] = Math.min(response[K], values[i]);
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
                return 4;
            default:
                return Integer.MAX_VALUE;
        }
    }
}
