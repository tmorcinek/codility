package com.morcinek.codility

/**
 * Copyright 2017 Tomasz Morcinek. All rights reserved.
 */
class OddOccurrencesInArrayKotlin : Solution{

    override fun solution(A: IntArray): Int {
        val set = mutableSetOf<Int>()   //Log(N)
        A.forEach {
            if (set.contains(it)) {
                set.remove(it)
            } else {
                set.add(it)
            }
        }
        return set.first()
    }
}
