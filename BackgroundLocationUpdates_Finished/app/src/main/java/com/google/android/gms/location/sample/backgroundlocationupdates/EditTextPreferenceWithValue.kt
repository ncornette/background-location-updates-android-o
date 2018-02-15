package com.google.android.gms.location.sample.backgroundlocationupdates

import android.content.Context
import android.preference.EditTextPreference
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

class EditTextPreferenceWithValue: EditTextPreference {

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        widgetLayoutResource = R.layout.preference_widget_value
    }

    lateinit var myTextView: TextView

    override fun onBindView(view: View) {
        super.onBindView(view)

        // Set our custom views inside the layout
        myTextView = view.findViewById(R.id.mypreference_widget) as TextView
        myTextView.text = text
    }

    override fun onDialogClosed(positiveResult: Boolean) {
        super.onDialogClosed(positiveResult)
        myTextView.text = text
    }
}