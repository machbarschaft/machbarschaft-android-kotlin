package jetzt.machbarschaft.android.util

import android.widget.EditText

fun EditText?.value() = if (this == null) "" else text.toString()
