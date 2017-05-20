package com.morcinek.codility.frogJmp

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class FrogJmpTest {

    abstract fun solution(X: Int, Y: Int, D: Int): Int

    @Test
    fun example() {
        val result = solution(10, 85, 30)
        assertEquals(3, result)
    }
    @Test
    fun example20() {
        val result = solution(10, 85, 20)
        assertEquals(4, result)
    }

    @Test
    fun exampleBigMilion() {
        val result = solution(10, 1000000, 300)
        assertEquals(3334, result)
    }

    @Test
    fun exampleBig10Milion() {
        val result = solution(10, 1000000000, 300)
        assertEquals(3333334, result)
    }

    @Test
    fun manyJump1() {
        val result = solution(10, 1000000000, 2)
        assertEquals(499999995, result)
    }
}