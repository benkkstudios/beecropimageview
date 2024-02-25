package com.benkkstudio.beecropimageview

import android.content.Context
import android.util.AttributeSet
import com.benkkstudio.beecropimageview.cropper.CropImageView

class BeeCropImageView : CropImageView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
}