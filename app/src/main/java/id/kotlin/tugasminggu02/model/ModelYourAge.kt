package id.kotlin.tugasminggu02.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelYourAge (
    val birthYear : Int,
    val desiredYear : Int,
) : Parcelable