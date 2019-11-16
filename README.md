# mapper
A simple collection of interfaces for mapping between objects.

I was tired of recreating these interfaces for every project so I made a library for them.

![Build CI Badge](https://github.com/chRyNaN/mapper/workflows/Build/badge.svg)

### Using the library

This library contains two simple mapping interfaces: `UniDirectionalMapper` and `BiDirectionalMapper`. There is also a typealias, `Mapper`, for the `UniDirectionalMapper` interface.

There are both suspending and non-suspending versions of each function on the interfaces. Ex: `map` and `mapSuspending`.

#### Unidirectional Mapping
```kotlin
class MyMapper : Mapper<Model, ViewModel> {

    override fun map(value: Model): ViewModel = ...
}

...

// Using the Mapper
val viewModel = mapper.map(value = myModel)
// Or in a Flow
getFlowOfModels()
    .map(mapper::mapSuspending)
```

#### BiDirectional Mapping
```kotlin
class MyMapper : BiDirectionalMapper<InModel, OutModel> {

    override fun mapIn(value: InModel): OutModel = ...

    override fun mapOut(value: OutModel): InModel = ...
}

// Using the Mapper
val mapOut = mapper.mapIn(value = mapIn)
val mapInAgain = mapper.mapOut(value = mapOut)
// Or in a Flow
getFlowOfModels()
    .map(mapper::mapInSuspending) // Or .map(mapper::mapOutSuspending)
```

### Building

This project should be accessible through Github Packages. Checkout the "packages" tab for more information.
