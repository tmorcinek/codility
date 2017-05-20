package com.morcinek.codility.genomicRangeQuery

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class GenomicRangeQueryTest {

    abstract fun solution(S: String, P: IntArray, Q: IntArray): IntArray

    @Test
    fun example() {
        val solution = solution("CAGCCTA", listOf(2, 5, 0).toIntArray(), listOf(4, 5, 6).toIntArray())

        assertEquals(listOf(2, 4, 1), solution.toList())
    }

    @Test
    fun oneA() {
        val solution = solution("A", listOf(0).toIntArray(), listOf(0).toIntArray())

        assertEquals(listOf(1), solution.toList())
    }

    @Test
    fun oneC() {
        val solution = solution("C", listOf(0).toIntArray(), listOf(0).toIntArray())

        assertEquals(listOf(2), solution.toList())
    }

    @Test
    fun oneG() {
        val solution = solution("G", listOf(0).toIntArray(), listOf(0).toIntArray())

        assertEquals(listOf(3), solution.toList())
    }

    @Test
    fun oneT() {
        val solution = solution("T", listOf(0).toIntArray(), listOf(0).toIntArray())

        assertEquals(listOf(4), solution.toList())
    }

}