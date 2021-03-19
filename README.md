# mapper

A simple collection of interfaces for mapping between objects. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/mapper">

## Using the library

This library contains two simple mapping interfaces: `UniDirectionalMapper` and `BiDirectionalMapper`. There is also a
typealias called `Mapper` for the `UniDirectionalMapper` interface.

### Unidirectional Mapping

```kotlin
class MyMapper : Mapper<Model, ViewModel> {

    override fun map(value: Model): ViewModel = ...
}

...

// Using the Mapper
val viewModel = mapper.map(value = myModel)

// Or in a Flow
getFlowOfModels()
    .map(mapper::map)
```

### BiDirectional Mapping

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
    .map(mapper::mapIn)
```

## Building

The library is provided through [Repsy](https://repsy.io). Refer to
the [releases page](https://github.com/chRyNaN/mapper/releases) for the latest version. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/mapper">

### Repository

```kotlin
repositories {
    maven { url = "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

```kotlin
implementation("com.chrynan.mapper:mapper-core:$VERSION")
```

## Documentation

Refer to the [docs](docs) folder for documentation and more information about the library.

## License

```
Copyright 2020 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
