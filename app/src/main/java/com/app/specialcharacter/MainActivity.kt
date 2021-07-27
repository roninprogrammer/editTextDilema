package com.app.specialcharacter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.EditText

private val textFilter = InputFilter { source, start, end, _, _, _ ->
    for (i in start until end) {
        if (!ValidUtil.isMatchRegex(source[i].toString(), "")) {
            return@InputFilter ""
        }
    }
    null
}
/*
- It would only allow the special characters mentioned in the regExp , and the quotes(Single quote['] and double quote ["] are not allowed
- other special chracters which are not allowed are #,$,%,^,{,[,],},\,',",?
- it would allow all the numnbers (0-9)
- it would allow all the alpha character small or caps
- Remove unwanted chracters while typing, meaning that you shall check for those special character above and remove it if user type/Copy paste it in
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.et_enter_text)
        editText.filters += textFilter
    }
}