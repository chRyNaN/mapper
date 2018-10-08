package com.chrynan.mapper

/**
 * An interface that provides a way to map between two types of objects. For instance, one may have an entity and it's
 * database counterpart, an implementation of this interface would provide a way to map between both these entities.
 */
interface BiDirectionalMapper<T1, T2> {

    fun mapIn(value: T1): T2

    fun mapOut(value: T2): T1
}