package com.tr4n.unittest

import org.junit.Assert
import org.junit.Test

class ViewModel1Test {

    private val viewModel1 = ViewModel1()

    @Test
    fun findMax_shouldReturnFirstNumberWhenFirstNumberIsBigger() {
        val expected = 4
        val actual = viewModel1.findMax(4, 2)

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `findMax should return second number when sencond number is bigger`() {
        val expected = 5
        val actual = viewModel1.findMax(4, 5)

        Assert.assertEquals(expected, actual)
    }
}