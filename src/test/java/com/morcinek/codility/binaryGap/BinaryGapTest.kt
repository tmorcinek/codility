package com.morcinek.codility.binaryGap

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class BinaryGapTest {

    interface Solution {
        fun solution(N: Int): Int
    }

    private lateinit var solution: Solution

    protected abstract fun createSolution(): Solution

    @Before
    fun setUp() {
        solution = createSolution()
    }

    @Test
    fun example() {
        val solution = this.solution.solution(0)

        assertEquals(solution.toLong(), 0)
    }

    @Test
    fun example9() {
        val solution = this.solution.solution(9)

        assertEquals(solution.toLong(), 2)
    }

    @Test
    fun example529() {
        val solution = this.solution.solution(529)

        assertEquals(solution.toLong(), 4)
    }

    @Test
    fun example20() {
        val solution = this.solution.solution(20)

        assertEquals(solution.toLong(), 1)
    }

    @Test
    fun example15() {
        val solution = this.solution.solution(15)

        assertEquals(solution.toLong(), 0)
    }
}