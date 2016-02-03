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
                String[] facts = {
                    "No Food in the Library", "Study rooms are limited to 2 hours per day",
                    "Study Rooms are first come, first serve", "I like working at the library",
                        "Library hours are too short", "I use the library more for the Internet access than the books"
                };
                //update with new fact
                String fact = "";
                //randomly select a fact
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(facts.length);
                fact = facts[randomNumber];
                //Update the screen with new fact

                mFactTextView.setText(fact);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
