package com.example.moises.botonesyetiquetas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mText;
    TextView mTextView;
    public static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView1);
        mText = (EditText) findViewById(R.id.edit_text1);
        mText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
              Log.d(TAG, "beforeTextChanged" + s);
              Log.d(TAG, "beforeTextChanged" + mText.getText());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG,"onTextChanged " + s.toString());
                mTextView.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}//final de la clase
