package com.chrynan.mapper

/**
 * A file containing convenience functions related to mapping and formatting objects.
 */

inline fun <reified T, reified R> map(value: T, mapper: (T) -> R) = mapper(value)

inline infix fun <reified T, reified R> T.mapWith(mapper: (T) -> R) = mapper(this)

inline fun <reified T, reified R> format(value: T, formatter: (T) -> R) = formatter(value)

inline infix fun <reified T, reified R> T.formatWith(formatter: (T) -> R) = formatter(this)

inline fun <reified T, reified K, reified V> toMap(value: T, mapper: T.() -> Map<K, V>): Map<K, V> = mapper(value)

inline infix fun <reified T, reified K, reified V> T.toMapWith(mapper: T.() -> Map<K, V>) = mapper(this)

inline fun <reified T, reified K, reified V> update(value: T, map: Map<K, V>, updater: T.(Map<K, V>) -> Unit): T {
    updater(value, map)

    return value
}

inline fun <reified T, reified K, reified V> T.updateWith(map: Map<K, V>, updater: T.(Map<K, V>) -> Unit): T {
    updater(map)

    return this
}