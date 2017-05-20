package com.morcinek.codility.permMissingElem;

import org.jetbrains.annotations.NotNull;

/**
 * Tomasz Morcinek 2017
 */
public class PermMissingElemTestJava extends PermMissingElemTest {

    @NotNull
    @Override
    protected Solution createSolution() {
        return new Solution() {

            @Override
            public int solution(@NotNull int[] A) {
                long sum = 0;
                int min = 1;
                for (int it : A) {
                    sum += it;
                    min = Math.min(min, it);
                }
                long length = A.length + 1;
                long realSum = length * (2 * min + length - 1) / 2;
                return (int) (realSum - sum);
            }
        };
    }
}
