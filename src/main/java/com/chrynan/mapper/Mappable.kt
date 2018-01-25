package com.chrynan.mapper

/**
 * An interface that represents an object that can be transformed and represented as a [Map].
 */
interface Mappable<K, out V> {

    fun toMap(): Map<K, V>
}