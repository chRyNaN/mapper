package com.chrynan.mapper

/**
 * An interface that extends from [Mappable] where the implementing object itself can be invoked as a function which
 * calls the [Mappable.toMap] function.
 */
interface MappableFunction<K, out V> : Mappable<K, V>,
        (() -> Map<K, V>) {

    override fun invoke() = toMap()
}