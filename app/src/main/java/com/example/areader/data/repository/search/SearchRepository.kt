package com.example.areader.data.repository.search

import com.example.areader.data.Dto.GoogleBooksDto.BookDto
import com.example.areader.data.Resource

interface SearchRepository {
    suspend fun preformSearch(q: String): Resource<BookDto>
}