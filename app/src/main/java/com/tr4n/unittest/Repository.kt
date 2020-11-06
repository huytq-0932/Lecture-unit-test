package com.tr4n.unittest

class Repository : IRepository {

    override fun getNumber(key: Int) =
        when (key) {
            in 1..10 -> -1
            in 11..20 -> 0
            else -> 1
        }
}
