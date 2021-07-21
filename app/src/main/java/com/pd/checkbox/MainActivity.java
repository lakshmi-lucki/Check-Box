package com.pd.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.strictmode.WebViewMethodCalledOnWrongThreadViolation;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        //TextView tv1 = (TextView)findViewById(R.id.tv);
        Button btn = (Button) findViewById( R.id.btn_Choices );
        btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox chb1 = (CheckBox) findViewById( R.id.ch1 );
                CheckBox chb2 = (CheckBox) findViewById( R.id.ch2 );
                CheckBox chb3 = (CheckBox) findViewById( R.id.ch3 );

                StringBuffer result = new StringBuffer(); //both does the same but BUFFER & builder, BUILDER is more efficient while working
                //  StringBuilder result = new StringBuilder();
                result.append( "Your selected hobbies:" ).append( chb1.isChecked() );
                result.append( "Your selected hobbies:" ).append( chb2.isChecked() );
                result.append( "Your selected hobbies:" ).append( chb3.isChecked() );

                Toast.makeText( MainActivity.this, result.toString(), Toast.LENGTH_LONG ).show();
            }
        } );
    }
}