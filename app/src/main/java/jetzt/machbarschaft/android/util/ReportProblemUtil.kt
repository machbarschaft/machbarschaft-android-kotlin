package jetzt.machbarschaft.android.util

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import jetzt.machbarschaft.android.BuildConfig
import jetzt.machbarschaft.android.R

fun getBugMailIntent(context: Context) =
    Intent(
        Intent.ACTION_VIEW, Uri.parse(
            "mailto:hallo@machbarschaft.jetzt" +
                    "?subject=" + context.getString(R.string.home_feedback_subject) +
                    "&body=" + context.getString(R.string.home_feedback_body1) +
                    "\nVersion-Name: " + BuildConfig.VERSION_NAME +
                    "\nVersion-Code: " + BuildConfig.VERSION_CODE +
                    "\nAndroid-Version: " + Build.DISPLAY +
                    "\nDevice: " + Build.DEVICE +
                    "\nManufacturer: " + Build.MANUFACTURER +
                    "\nModel: " + Build.MODEL +
                    "\n\n" + context.getString(R.string.home_feedback_body2)
        )
    )