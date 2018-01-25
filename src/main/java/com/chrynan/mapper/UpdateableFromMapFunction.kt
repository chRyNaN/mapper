package com.chrynan.mapper

/**
 * An interface that extends from [UpdateableFromMap] where the implementing object itself can be invoked as a function
 * which calls the [UpdateableFromMap.updateFromMap] function.
 */
interface UpdateableFromMapFunction<K, in V> : UpdateableFromMap<K, V>,
        ((Map<K, V>) -> Unit) {

    override fun invoke(values: Map<K, V>) = updateFromMap(values)
}