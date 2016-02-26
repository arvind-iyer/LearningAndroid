package com.arvind.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends Activity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        String value = extras.getString("value");
        System.out.println(value);
        setContentView(R.layout.activity_result);
        TextView textView = (TextView) findViewById(R.id.displayintentextra);
        textView.setText(value);
    }

    @Override
    public void finish() {
        //Create new intent
        Intent intent = new Intent();
        //Read EditText
        EditText editText = (EditText) findViewById(R.id.returnvalue);
        String extra = editText.getText().toString();
        //Add extra to intent
        intent.putExtra("returnvalue", extra);
        //Set result
        setResult(RESULT_OK, intent);

        super.finish();
    }
}
