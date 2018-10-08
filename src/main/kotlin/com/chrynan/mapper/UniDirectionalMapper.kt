package com.chrynan.mapper

/**
 * An interface that provides a way to map one object to another. For instance, one may have a domain layer entity that
 * needs to be mapped to a presentation layer model, an implementation of this interface would provide a way to map
 * from the domain layer entity to the presentation layer model.
 */
interface UniDirectionalMapper<in T, out R> {

    fun map(value: T): R
}