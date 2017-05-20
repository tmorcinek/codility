package com.morcinek.codility.permCheck

import junit.framework.Assert.assertEquals
import org.junit.Test

/**
 * Tomasz Morcinek 2017
 */
abstract class PermCheckTest {

    abstract fun solution(A: IntArray): Int

    @Test
    fun exampleEmpty() {
        val result = solution(listOf<Int>().toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun exampleOneElement() {
        val result = solution(listOf(1).toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun exampleOneElement2() {
        val result = solution(listOf(2).toIntArray())

        assertEquals(0, result)
    }

    @Test
    fun exampleTwoElementsRising() {
        val result = solution(listOf(2,3).toIntArray())

        assertEquals(0, result)
    }

    @Test
    fun exampleTwoElementsRisingPerm() {
        val result = solution(listOf(2,3, 1).toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun example4() {
        val result = solution(listOf(2, 3, 1, 5).toIntArray())

        assertEquals(0, result)
    }

    @Test
    fun example4Perm() {
        val result = solution(listOf(2, 3, 1, 5, 4).toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun exampleSame() {
        val result = solution(listOf(2, 2, 2, 5, 4).toIntArray())

        assertEquals(0, result)
    }

    @Test
    fun example7() {
        val result = solution(listOf(2, 3, 1, 5, 8 , 9, 4, 6).toIntArray())

        assertEquals(0, result)
    }

    @Test
    fun example7Perm() {
        val result = solution(listOf(7, 2, 3, 1, 5, 8 , 9, 4, 6).toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun example32() {
        val array = (1..100).toMutableList()
        array.removeAt(32)

        val result = solution(array.toIntArray())

        assertEquals(0, result)
    }

    @Test
    fun example32Perm() {
        val array = (1..100).toMutableList()

        val result = solution(array.toIntArray())

        assertEquals(1, result)
    }

    @Test
    fun exampleBigMilion() {
        val array = (1..1000000).toMutableList()
        array.removeAt(89)

        val result = solution(array.toIntArray())

        assertEquals(0, result)
    }

    @Test
    fun exampleBigMilionPerm() {
        val array = (1..1000000).toMutableList()

        val result = solution(array.toIntArray())

        assertEquals(1, result)
    }

//    @Test
//    fun exampleBig10Milion() {
//        val array = (1..10000000).toMutableList()
//        val element = array.removeAt(89)
//
//        val result = solution(array.toIntArray())
//
//        assertEquals(element, result)
//    }
//
//    @Test
//    fun exampleBig100Milion() {
//        val array = (1..100000000).toMutableList()
//        val element = array.removeAt(89)
//
//        val result = solution(array.toIntArray())
//
//        assertEquals(element, result)
//    }
}
