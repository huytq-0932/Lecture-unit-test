package com.tr4n.unittest

import org.junit.Test

import org.junit.Assert.*

class RepositoryTest {

    private val repository = Repository()

    @Test
    fun `getNumber should return -1 when key from 1 to 10`() {
        val expected = -1
        val actual = repository.getNumber(5)

        assertEquals(expected, actual)
    }

    @Test
    fun `getNumber should return 0 when key from 11 to 20`() {
        val expected = 0
        val actual = repository.getNumber(15)

        assertEquals(expected, actual)
    }

    @Test
    fun `getNumber should return 1 when key bigger than 20`() {
        val expected = 1
        val actual = repository.getNumber(50)

        assertEquals(expected, actual)
    }

    @Test
    fun `getNumber should return 1 when key smaller than 1`() {
        val expected = 1
        val actual = repository.getNumber(-50)

        assertEquals(expected, actual)
    }
}