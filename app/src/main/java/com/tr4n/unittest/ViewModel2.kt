package com.tr4n.unittest

class ViewModel2(
    private val repository: IRepository
) {

    fun getMax(key1: Int, key2: Int): Int {
        val first = repository.getNumber(key1)
        val second = repository.getNumber(key2)
        if (first > second) return first
        return second
    }
}
