package com.morcinek.codility.countDiv

import org.junit.Assert
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class CountDivTest {

    abstract fun solution(A: Int, B: Int, K: Int): Int

    @Test
    fun example() {
        val solution = solution(6, 11, 2)

        Assert.assertEquals(3, solution)
    }

    @Test
    fun example3() {
        val solution = solution(6, 11, 3)

        Assert.assertEquals(2, solution)
    }

    @Test
    fun example4() {
        val solution = solution(6, 11, 4)

        Assert.assertEquals(1, solution)
    }

    @Test
    fun example5() {
        val solution = solution(6, 11, 5)

        Assert.assertEquals(1, solution)
    }

    @Test
    fun example7() {
        val solution = solution(6, 11, 7)

        Assert.assertEquals(1, solution)
    }

    @Test
    fun example7Variant1() {
        val solution = solution(6, 28, 7)

        Assert.assertEquals(4, solution)
    }

    @Test
    fun example7Variant2() {
        val solution = solution(0, 28, 7)

        Assert.assertEquals(5, solution)
    }

    @Test
    fun example7Variant3() {
        val solution = solution(0, 27, 7)

        Assert.assertEquals(4, solution)
    }

    @Test
    fun example7Variant4() {
        val solution = solution(1, 27, 7)

        Assert.assertEquals(3, solution)
    }

    @Test
    fun exampleBigMilion() {
        val solution = solution(6, 1000006, 7)

        Assert.assertEquals(142858, solution)
    }
}
