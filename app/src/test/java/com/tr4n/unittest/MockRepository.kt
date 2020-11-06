package com.tr4n.unittest

class MockRepository : IRepository {

    override fun getNumber(key: Int): Int {
        if (key == 9) return -1
        if (key == 15) return 0
        if (key == 30) return 1
        else return 1
    }
}
