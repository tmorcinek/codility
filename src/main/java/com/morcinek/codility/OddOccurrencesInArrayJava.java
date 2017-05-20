package com.morcinek.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Copyright 2017 Tomasz Morcinek. All rights reserved.
 */
public class OddOccurrencesInArrayJava implements Solution {

    @Override
    public int solution(int[] A) {
        int sum = 0;
        for (int it : A) {
            sum ^= it;
        }
        return sum;
    }

    public int solutionLogN(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int value : A) {
            if (set.contains(value)) {
                set.remove(value);
            } else {
                set.add(value);
            }
        }
        return set.iterator().next();
    }
}
