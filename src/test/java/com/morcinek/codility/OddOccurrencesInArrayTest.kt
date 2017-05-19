package com.morcinek.codility

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 *      A[0] = 9  A[1] = 3  A[2] = 5
 *      A[3] = 3  A[4] = 9  A[5] = 7
 *      A[6] = 5
 */
class OddOccurrencesInArrayTest {

    private lateinit var solution: Solution

    @Before
    fun setUp() {
//        solution = OddOccurrencesInArrayJava()
        solution = OddOccurrencesInArrayKotlin()
    }

    @Test
    fun zeroElement() {
        val solution = this.solution.solution(arrayOf<Int>(0).toIntArray())

        assertEquals(solution.toLong(), 0)
    }

    @Test
    fun example() {
        val solution = this.solution.solution(arrayOf<Int>(9, 3, 9, 3, 9, 7, 9).toIntArray())

        assertEquals(solution.toLong(), 7)
    }

    @Test
    fun example2() {
        val solution = this.solution.solution(arrayOf<Int>(1, 9, 3, 1, 9, 3, 2).toIntArray())
        assertEquals(solution.toLong(), 2)
    }


}