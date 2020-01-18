package com.mmlodawski.jvmoverloadsmediumexample.widget.button

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class ButtonJvmOverloads2 @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null
) : Button(context, attrs)
