package com.example.oways.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView textView;
    EditText replyText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        replyText=(EditText)findViewById(R.id.editText_reply);
    textView=(TextView)findViewById(R.id.textView);
    Bundle bundle=getIntent().getExtras();
     String s1=bundle.getString("user") ;
    textView.setText(s1);
    }

    public void returnReply(View view) {
        String reply=replyText.getText().toString();
        Intent replyintent=new Intent();
        replyintent.putExtra("reply",reply);
        setResult(RESULT_OK,replyintent);
        finish();

    }
}
