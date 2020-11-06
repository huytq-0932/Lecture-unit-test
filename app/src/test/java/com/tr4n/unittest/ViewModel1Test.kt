package com.tr4n.unittest

import junit.framework.TestCase
import org.junit.Assert
import org.junit.Test

class ViewModel1Test  {

    private val viewModel1 = ViewModel1()

    @Test
    fun findMax_returnFirstMaxWhenFirstBigger() {
        //2 4 => 4

        val expected = 4
        val actual = viewModel1.findMax(4, 2)
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `findMax return Second Max When Second Bigger`() {
        //2 4 => 4

        val expected = 4
        val actual = viewModel1.findMax(2, 4)
        Assert.assertEquals(expected, actual)
    }
}
