//[mapper-core](../../../index.md)/[com.chrynan.mapper.core](../index.md)/[BiDirectionalMapper](index.md)



# BiDirectionalMapper  
 [common] interface [BiDirectionalMapper](index.md)<[IN](index.md), [OUT](index.md)>

An interface that provides a way to map between two types of objects in both directions.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.mapper.core/BiDirectionalMapper/mapIn/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[mapIn](map-in.md)| <a name="com.chrynan.mapper.core/BiDirectionalMapper/mapIn/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [mapIn](map-in.md)(value: [IN](index.md)): [OUT](index.md)  <br><br><br>|
| <a name="com.chrynan.mapper.core/BiDirectionalMapper/mapOut/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[mapOut](map-out.md)| <a name="com.chrynan.mapper.core/BiDirectionalMapper/mapOut/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [mapOut](map-out.md)(value: [OUT](index.md)): [IN](index.md)  <br><br><br>|

