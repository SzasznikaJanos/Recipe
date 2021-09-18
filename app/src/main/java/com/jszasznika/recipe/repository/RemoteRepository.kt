package com.jszasznika.recipe.repository

import kotlinx.coroutines.flow.flow

class RemoteRepository(private val dataSource: RemoteDataSource) {

     fun complexSearch(complexSearchQuery: ComplexSearchQuery) = flow {
        emit(dataSource.complexSearch(complexSearchQuery.query))
    }

}