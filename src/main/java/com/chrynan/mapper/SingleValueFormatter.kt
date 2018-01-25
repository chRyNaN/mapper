package com.chrynan.mapper

import java.util.*

/**
 * An interface that provides a way to format a provided object into another object. This is similar to a
 * [UniDirectionalMapper] but it used to format a particular object rather than map one object to another. For example,
 * one might wish to format a [Date] object to a particular [String] format.
 */
interface SingleValueFormatter<in T, out R> : Formatter,
        ((T) -> R) {

    override fun invoke(value: T) = format(value)

    fun format(value: T): R
}