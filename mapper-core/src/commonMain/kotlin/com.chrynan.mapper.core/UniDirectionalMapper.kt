package com.chrynan.mapper.core

/**
 * An interface that provides a way to map from one object to another in a single direction.
 */
@Suppress("unused")
interface UniDirectionalMapper<IN, OUT> {

    suspend fun map(value: IN): OUT
}

suspend operator fun <IN, OUT> UniDirectionalMapper<IN, OUT>.invoke(value: IN): OUT = map(value)
