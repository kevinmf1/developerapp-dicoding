package com.kevinmalikfajar.jobview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Job(
    val title: String,
    val description: String,
    val image: Int
) : Parcelable
