package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragment(View view){
        Fragment fragment = null;
        switch (view.getId()){
            case R.id.buttonfrag1:
                fragment = new BlankFragment1();
                break;
            case R.id.buttonfrag2:
                fragment = new BlankFragment2();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainerView, fragment);
        ft.commit();
    }

    public void onRadioButtonClicked(View view){
        int scope = 0;
        int error = 0;
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.rq1);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.rq2);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.rq3);
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.rq4);
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.rq5);
        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.rq6);
        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.rq7);

        TextView selectText1 = (TextView) findViewById(R.id.textq1o);
        TextView selectText2 = (TextView) findViewById(R.id.textq2o);
        TextView selectText3 = (TextView) findViewById(R.id.textq3o);
        TextView selectText4 = (TextView) findViewById(R.id.textq4o);
        TextView selectText5 = (TextView) findViewById(R.id.textq5o);
        TextView selectText6 = (TextView) findViewById(R.id.textq6o);
        TextView selectText7 = (TextView) findViewById(R.id.textq7o);


        TextView selectScope = (TextView) findViewById(R.id.scopeText);


        int rbq1 = radioGroup1.getCheckedRadioButtonId();
        RadioButton rbidq1 = findViewById(rbq1);
        int rbq2 = radioGroup2.getCheckedRadioButtonId();
        RadioButton rbidq2 = findViewById(rbq2);
        int rbq3 = radioGroup3.getCheckedRadioButtonId();
        RadioButton rbidq3 = findViewById(rbq3);
        int rbq4 = radioGroup4.getCheckedRadioButtonId();
        RadioButton rbidq4 = findViewById(rbq4);
        int rbq5 = radioGroup5.getCheckedRadioButtonId();
        RadioButton rbidq5 = findViewById(rbq5);
        int rbq6 = radioGroup6.getCheckedRadioButtonId();
        RadioButton rbidq6 = findViewById(rbq6);
        int rbq7 = radioGroup7.getCheckedRadioButtonId();

        RadioButton rbidq7 = findViewById(rbq7);

        switch (rbidq1.getId()){
            case R.id.rq1q1:
            case R.id.rq1q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq1q2:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq2.getId()){
            case R.id.rq2q1:
            case R.id.rq2q2:
            case R.id.rq2q4:
            case R.id.rq2q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq2q5:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq3.getId()){
            case R.id.rq3q1:
            case R.id.rq3q5:
            case R.id.rq3q4:
            case R.id.rq3q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq3q2:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq4.getId()){
            case R.id.rq4q1:
            case R.id.rq4q5:
            case R.id.rq4q4:
            case R.id.rq4q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq4q2:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq5.getId()){
            case R.id.rq5q2:
            case R.id.rq5q4:
            case R.id.rq5q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq5q1:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq6.getId()){
            case R.id.rq6q2:
            case R.id.rq6q4:
            case R.id.rq6q1:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq6q3:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq7.getId()){
            case R.id.rq7q2:
            case R.id.rq7q4:
            case R.id.rq7q1:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq7q3:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }

        selectScope.setText("Right answers: " + scope + "Wrong answers: " + error);

    }
    public void onRadioButton2Clicked(View view){
        int scope = 0;
        int error = 0;
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.rq1);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.rq2);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.rq3);
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.rq4);
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.rq5);
        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.rq6);
        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.rq7);

        TextView selectText1 = (TextView) findViewById(R.id.textq1o);
        TextView selectText2 = (TextView) findViewById(R.id.textq2o);
        TextView selectText3 = (TextView) findViewById(R.id.textq3o);
        TextView selectText4 = (TextView) findViewById(R.id.textq4o);
        TextView selectText5 = (TextView) findViewById(R.id.textq5o);
        TextView selectText6 = (TextView) findViewById(R.id.textq6o);
        TextView selectText7 = (TextView) findViewById(R.id.textq7o);


        TextView selectScope = (TextView) findViewById(R.id.scopeText);


        int rbq1 = radioGroup1.getCheckedRadioButtonId();
        RadioButton rbidq1 = findViewById(rbq1);
        int rbq2 = radioGroup2.getCheckedRadioButtonId();
        RadioButton rbidq2 = findViewById(rbq2);
        int rbq3 = radioGroup3.getCheckedRadioButtonId();
        RadioButton rbidq3 = findViewById(rbq3);
        int rbq4 = radioGroup4.getCheckedRadioButtonId();
        RadioButton rbidq4 = findViewById(rbq4);
        int rbq5 = radioGroup5.getCheckedRadioButtonId();
        RadioButton rbidq5 = findViewById(rbq5);
        int rbq6 = radioGroup6.getCheckedRadioButtonId();
        RadioButton rbidq6 = findViewById(rbq6);
        int rbq7 = radioGroup7.getCheckedRadioButtonId();

        RadioButton rbidq7 = findViewById(rbq7);

        switch (rbidq1.getId()){
            case R.id.rq1q1:
            case R.id.rq1q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq1q2:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq2.getId()){
            case R.id.rq2q1:
            case R.id.rq2q2:
            case R.id.rq2q4:
            case R.id.rq2q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq2q5:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq3.getId()){
            case R.id.rq3q1:
            case R.id.rq3q5:
            case R.id.rq3q4:
            case R.id.rq3q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq3q2:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq4.getId()){
            case R.id.rq4q1:
            case R.id.rq4q5:
            case R.id.rq4q4:
            case R.id.rq4q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq4q2:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq5.getId()){
            case R.id.rq5q2:
            case R.id.rq5q4:
            case R.id.rq5q3:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq5q1:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq6.getId()){
            case R.id.rq6q2:
            case R.id.rq6q4:
            case R.id.rq6q1:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq6q3:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }
        switch (rbidq7.getId()){
            case R.id.rq7q2:
            case R.id.rq7q4:
            case R.id.rq7q1:
                selectText1.setText("Selected answer wrong");
                error += 1;
                break;
            case R.id.rq7q3:
                selectText1.setText("Selected answer True");
                scope += 1;
                break;
        }

        selectScope.setText("Right answers: " + scope + "Wrong answers: " + error);

    }
}