//[mapper-core](../../../index.md)/[com.chrynan.mapper.core](../index.md)/[UniDirectionalMapper](index.md)



# UniDirectionalMapper  
 [common] interface [UniDirectionalMapper](index.md)<[IN](index.md), [OUT](index.md)>

An interface that provides a way to map from one object to another in a single direction.

   


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.mapper.core/UniDirectionalMapper/map/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[map](map.md)| <a name="com.chrynan.mapper.core/UniDirectionalMapper/map/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [map](map.md)(value: [IN](index.md)): [OUT](index.md)  <br><br><br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.mapper.core//invoke/com.chrynan.mapper.core.UniDirectionalMapper[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[invoke](../invoke.md)| <a name="com.chrynan.mapper.core//invoke/com.chrynan.mapper.core.UniDirectionalMapper[TypeParam(bounds=[kotlin.Any?]),TypeParam(bounds=[kotlin.Any?])]#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>suspend operator fun <[IN](../invoke.md), [OUT](../invoke.md)> [UniDirectionalMapper](index.md)<[IN](../invoke.md), [OUT](../invoke.md)>.[invoke](../invoke.md)(value: [IN](../invoke.md)): [OUT](../invoke.md)  <br><br><br>|

