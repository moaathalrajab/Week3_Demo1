package com.leuenroo.week3_demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
int i=0;
    TextView mTextView;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView= (TextView)findViewById(R.id.tv1);
        mTextView.setOnClickListener(view -> {
            ((TextView)view).setTextSize(45);
        });

        mButton= (Button)findViewById(R.id.btn3);
        mButton.setOnClickListener(this::toShowToastMSH);

    }

    private void toShowToastMSH(View view) {
        Toast.makeText(MainActivity.this, "Moaath Alrajab",
                Toast.LENGTH_LONG).show();
    }

    public void toShowSBMSG(View view) {
        Snackbar sb= Snackbar.make(view,"Alrajab, Moaath",
                    Snackbar.LENGTH_LONG);
            sb.show();
    }


    class MyLsntr implements View.OnClickListener{
        @Override
        public void onClick(View view) {


//
        }
    }


    @Override
    protected void onStart() {
        super.onStart();


    }
}