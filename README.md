# mapper
A simple collection of interfaces for mapping objects.

I was tired of creating the same interfaces so made an extremely simple library to encapsulate them. Originally this library had additional functionality but was vague. Now this library contains two interfaces for mapping between different objects: the `UniDirectionalMapper` and the `BiDirectionalMapper`.
This Project is a platform agnostic Kotlin library as it's only dependencies are on the Kotlin Common Library and it only contains two interfaces.

This project is accesssible through [Jitpack](https://jitpack.io/#chRyNaN/mapper/v1.0.1-SNAPSHOT):

[![](https://jitpack.io/v/chRyNaN/mapper.svg)](https://jitpack.io/#chRyNaN/mapper)

**Kotlin Common Project:**
```
implementation 'com.github.chRyNaN.mapper:mapper-common:VERSION'
```
**JVM Project:**
```
implementation 'com.github.chRyNaN.mapper:mapper-jvm:VERSION'
```
**JS Project:**
```
implementation 'com.github.chRyNaN.mapper:mapper-js:VERSION'
```
