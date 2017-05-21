package com.morcinek.codility.distinct

import org.junit.Assert
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class DistinctTest {

    abstract fun solution(A: IntArray): Int

    @Test
    fun example() {
        val solution = solution(listOf(2, 1, 1, 2, 3, 1).toIntArray())

        Assert.assertEquals(3, solution)
    }

    @Test
    fun example2() {
        val solution = solution(listOf(2,4, 5, 1, 1, 2, 3, 1, 5 ,4 , 4).toIntArray())

        Assert.assertEquals(5, solution)
    }

    @Test
    fun example3() {
        val solution = solution(listOf(2, 1, 1, 2, 1).toIntArray())

        Assert.assertEquals(2, solution)
    }
}