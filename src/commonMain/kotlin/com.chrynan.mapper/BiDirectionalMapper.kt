package com.chrynan.mapper

/**
 * An interface that provides a way to map between two types of objects. For instance, one may have an entity and it's
 * database counterpart, an implementation of this interface would provide a way to map between both these entities.
 */
@Suppress("unused")
interface BiDirectionalMapper<IN, OUT> {

    fun mapIn(value: IN): OUT

    fun mapOut(value: OUT): IN

    suspend fun mapInSuspending(value: IN): OUT = mapIn(value = value)

    suspend fun mapOutSuspending(value: OUT): IN = mapOut(value = value)
}