package com.tr4n.unittest

import io.mockk.every
import io.mockk.mockk
import org.junit.Test

import org.junit.Assert.*

class ViewModel2Test {

    private val repository: IRepository = MockRepository()
    private val viewModel2 = ViewModel2(repository)

    private val mockRepository: IRepository = mockk()
    private val viewModel3 = ViewModel2(mockRepository)

    @Test
    fun `getMax should return 0 when input 9 15`() {
        val expected = 0
        val actual = viewModel2.getMax(9, 15)
        assertEquals(expected, actual)
    }

    @Test
    fun `getMax should return 1 when input 30 9`(){
        every {
            mockRepository.getNumber(30)
        } returns 1

        every {
            mockRepository.getNumber(9)
        } returns -1

        val expected = 1
        val actual = viewModel2.getMax(30, 9)
        assertEquals(expected, actual)
    }
}
