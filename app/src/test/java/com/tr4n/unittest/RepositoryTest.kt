package com.tr4n.unittest

import org.junit.Test

import org.junit.Assert.*

class RepositoryTest {

    private val repository = Repository()

    @Test
    fun `getNumber should return -1 when input is 1`() {
        val expected = -1
        val actual = repository.getNumber(1)
        assertEquals(expected, actual)
    }

    @Test
    fun `getNumber should return 0 when input is 11`() {
        val expected = 0
        val actual = repository.getNumber(11)
        assertEquals(expected, actual)
    }

    @Test
    fun `getNumber should return 1 when input is 21`() {
        val expected = 1
        val actual = repository.getNumber(21)
        assertEquals(expected, actual)
    }

    @Test
    fun `getNumber should return 1 when input is 0`() {
        val expected = 1
        val actual = repository.getNumber(0)
        assertEquals(expected, actual)
    }
}
