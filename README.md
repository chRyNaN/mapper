# mapper
A simple collection of interfaces for mapping between objects.

I was tired of recreating these interfaces for every project so I made a library for them.

![Build CI Badge](https://github.com/chRyNaN/mapper/workflows/Build/badge.svg)

### Using the library

This library contains two simple mapping interfaces: `UniDirectionalMapper` and `BiDirectionalMapper`. There is also a typealias, `Mapper`, for the `UniDirectionalMapper` interface.

There are both suspending and non-suspending versions of each function on the interfaces. Ex: `map` and `mapSuspending`.

### Building
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
