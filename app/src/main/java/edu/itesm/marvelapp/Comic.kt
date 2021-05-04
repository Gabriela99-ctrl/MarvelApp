package edu.itesm.marvelapp

import android.media.Image

data class Results (
    var results: Comics?
)

data class Comics(
        var comics: List<Comic>?
)

data class Comic(val id: Int,
                 val title: String,
                 val description: String,
                 val thumbnail: Image

)