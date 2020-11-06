package com.tr4n.unittest

import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class ViewModel2Test {

    private val repository: IRepository = MockRepository()
    private val viewModel2 = ViewModel2(repository)

    private val mockRepository: IRepository = mockk()
    private val viewModel3 = ViewModel2(mockRepository)

    @Test
    fun `getMax should return 0 when key1 = 9 and key2 = 15`() {
        val expected = 0
        val actual = viewModel2.getMax(9, 15)

        assertEquals(expected, actual)
    }

    @Test
    fun `getMax should return 1 when key1 = 30 and key2 = 9`() {
        every {
            mockRepository.getNumber(30)
        } returns -1

        every {
            mockRepository.getNumber(9)
        } returns 1

        val expected = 1
        val actual = viewModel3.getMax(9, 30)

        assertEquals(expected, actual)
    }
}
