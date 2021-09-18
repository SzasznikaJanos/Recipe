package com.jszasznika.recipe.repository

import com.google.common.truth.Truth.assertThat
import com.jszasznika.recipe.domain.Diet
import io.mockk.every

import io.mockk.mockk
import io.mockk.mockkObject

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows


internal class ComplexSearchQueryTest {

    private var mockQuery = "test"
    private val subject = ComplexSearchQuery(mockQuery)
    private val veganDietMockk = mockk<Diet.Vegan>()

    @BeforeEach
    fun setUp() {
        mockkObject(Diet.Vegan)
        every { veganDietMockk.dietName } returns "Vegan"
    }

    @Test
    fun getQueryMap() {
        val expectedDefaultMap = mapOf(
            "offset" to 0,
            "number" to 100,
            "instructionsRequired" to false,
            "fillIngredients" to false,
            "addRecipeInformation" to false,
            "query" to mockQuery
        )

        assertThat(subject.query)
            .containsExactlyEntriesIn(expectedDefaultMap)
    }

    @Test
    fun `test contains query`() {
        assertThat(subject.query)
            .containsEntry("query", mockQuery)
    }

    @Test
    fun `test contains offset number`() {
        val count = 50
        assertThat(subject.skipResults(count).query)
            .containsEntry("offset", count)
    }

    @Test
    fun `test contains given number of results`() {
        val count = 50
        assertThat(subject.resultsCount(count).query)
            .containsEntry("number", count)
    }

    @Test
    fun `test contains given diet`() {
        val map = subject.diet(veganDietMockk).query
        assertThat(map).containsEntry("diet", "Vegan")
    }

    @Test
    fun `test contains all chained`() {

      val query =   with(subject){
            diet(veganDietMockk)
            resultsCount(40)
            skipResults(10)
        }.query



        val expectedMap = mutableMapOf(
            "query" to mockQuery,
            "diet" to "Vegan",
            "number" to 40,
            "offset" to 10,
        )

        assertThat(query)
            .containsAtLeastEntriesIn(expectedMap)

    }

    @Test
    fun `throws exception on empty query`(){
        assertThrows<IllegalArgumentException> {
            val subject = ComplexSearchQuery("")
            subject.query
        }
    }

    @Test
    fun `throws exception on new empty query`(){
        assertThrows<IllegalArgumentException> {
            val subject = ComplexSearchQuery("test")

            assertThat(subject.query)
                .containsEntry("query","test")

            subject.newQuery("").query
        }
    }
}