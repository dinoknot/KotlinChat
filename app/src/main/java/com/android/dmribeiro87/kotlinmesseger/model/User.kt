package com.android.dmribeiro87.kotlinmesseger.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val uid: String, val username: String, val profileImageUrl: String) : Parcelable{
    constructor(): this("", "", "")
}