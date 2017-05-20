package com.morcinek.codility.permMissingElem;

import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class PermMissingElemTest {

    interface Solution {
        fun solution(A: IntArray): Int
    }

    private lateinit var solution: Solution

    protected abstract fun createSolution(): Solution

    @Before
    fun setUp() {
        solution = createSolution()
    }

    @Test
    fun exampleEmpty() {
        val result = solution.solution(listOf<Int>().toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun exampleOneElement() {
        val result = solution.solution(listOf(2).toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun exampleTwoElementsRising() {
        val result = solution.solution(listOf(2,3).toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun example4() {
        val result = solution.solution(listOf(2, 3, 1, 5).toIntArray())

        assertEquals(4, result)
    }

    @Test
    fun example7() {
        val result = solution.solution(listOf(2, 3, 1, 5, 8 , 9, 4, 6).toIntArray())

        assertEquals(7, result)
    }

    @Test
    fun example32() {
        val array = (1..100).toMutableList()
        val element = array.removeAt(32)

        val result = solution.solution(array.toIntArray())

        assertEquals(element, result)
    }

    @Test
    fun exampleBigMilion() {
        val array = (1..1000000).toMutableList()
        val element = array.removeAt(89)

        val result = solution.solution(array.toIntArray())

        assertEquals(element, result)
    }

    @Test
    fun exampleBig10Milion() {
        val array = (1..10000000).toMutableList()
        val element = array.removeAt(89)

        val result = solution.solution(array.toIntArray())

        assertEquals(element, result)
    }

    @Test
    fun exampleBig100Milion() {
        val array = (1..100000000).toMutableList()
        val element = array.removeAt(89)

        val result = solution.solution(array.toIntArray())

        assertEquals(element, result)
    }
}
