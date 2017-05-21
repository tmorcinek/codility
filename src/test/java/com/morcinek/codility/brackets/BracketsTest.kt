package com.morcinek.codility.brackets

import org.junit.Assert
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class BracketsTest {

    abstract fun solution(S: String): Int

    @Test
    fun examplePositive() {
        val solution = solution("{[()()]}")

        Assert.assertEquals(1, solution)
    }

    @Test
    fun exampleNegative() {
        val solution = solution("([)()]")

        Assert.assertEquals(0, solution)
    }

    @Test
    fun odd() {
        val solution = solution("[)()]")

        Assert.assertEquals(0, solution)
    }
}