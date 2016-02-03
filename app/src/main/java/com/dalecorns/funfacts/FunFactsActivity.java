package com.dalecorns.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
//Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private FactBook mFactBook = new FactBook();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //Assign layout views to view variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
        public void onClick(View v){
                //randomly select a fact
                String fact = mFactBook.getFact();
                //Update the screen with new fact
                mFactTextView.setText(fact);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
