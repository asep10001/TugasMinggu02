package id.kotlin.tugasminggu02.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelLogin (
    var user: String,
    var password: String
) : Parcelable