package com.chrynan.mapper

/**
 * An interface that represents an object that can be updated from fields of a [Map].
 */
interface UpdateableFromMap<K, in V> {

    fun updateFromMap(values: Map<K, V>)
}