package com.morcinek.codility

/**
 * Copyright 2017 Tomasz Morcinek. All rights reserved.
 */
class OddOccurrencesInArrayKotlin : Solution {

    override fun solution(A: IntArray): Int {
        return A.reduce(Int::xor)
    }

    fun solutionBetter(A: IntArray): Int {
        return A.reduce { first, second -> first.xor(second) }
    }

    fun solutionLame(A: IntArray): Int {
        var sum = 0
        A.forEach { sum = sum.xor(it) }
        return sum
    }

    fun solutionLogN(A: IntArray): Int {
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
