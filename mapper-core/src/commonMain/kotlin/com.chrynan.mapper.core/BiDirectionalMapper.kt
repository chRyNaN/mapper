package com.chrynan.mapper.core

/**
 * An interface that provides a way to map between two types of objects in both directions.
 */
@Suppress("unused")
interface BiDirectionalMapper<IN, OUT> {

    suspend fun mapIn(value: IN): OUT

    suspend fun mapOut(value: OUT): IN
}
