package com.h2bet.sportsapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "link_table")
data class Link(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    var value: String
)
