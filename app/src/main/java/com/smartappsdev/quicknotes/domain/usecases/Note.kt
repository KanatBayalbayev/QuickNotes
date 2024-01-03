package com.smartappsdev.quicknotes.domain.usecases

data class Note(
    val name: String,
    var id: Int = UNDEFINED_ID
) {
    private companion object {
        const val UNDEFINED_ID = 0
    }
}
