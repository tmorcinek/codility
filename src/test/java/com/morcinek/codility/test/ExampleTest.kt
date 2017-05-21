package com.morcinek.codility.test

import org.junit.Assert
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class ExampleTest {

    abstract fun solution(A: IntArray): Int

    /**
     * A[0] = -1
    A[1] =  3
    A[2] = -4
    A[3] =  5
    A[4] =  1
    A[5] = -6
    A[6] =  2
    A[7] =  1
     */
    @Test
    fun example() {
        val solution = solution(listOf(-1, 3, -4, 5, 1, -6, 2, 1).toIntArray())

        Assert.assertEquals(1, solution)
    }

    @Test
    fun exampleDifferent() {
        val solution = solution(listOf(-1, 8, -4, 5, 1, -6, 2, 1).toIntArray())

        Assert.assertEquals(1, solution)
    }

    @Test
    fun example2() {
        val solution = solution(listOf(-1, 3, -4, 5, 1, -4, 2, 2).toIntArray())

        Assert.assertEquals(5, solution)
    }
}