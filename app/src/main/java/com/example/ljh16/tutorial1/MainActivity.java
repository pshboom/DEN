package com.example.ljh16.tutorial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addClick(View v) {
        EditText number1 = (EditText) findViewByld(R. id. number1);
        EditText number2 = (EditText) findViewByld(R. id. number2);
        TextView result = (TextView) findViewByld(R. id. result);
        int n1 = lnteger .parselnt(number1. getText() . toString());
        int n2 = lnteger .parselnt(number2. getText() . toString());
        result.setText(Integer.toString(n1 + n2));

    }
    public void subtractClick(View v) {
        EditText number1 = (EditText) findViewByld(R. id. number1);
        EditText number2 = (EditText) findViewByld(R. id. number2);
        TextView result = (TextView) findViewByld(R. id. result);
        int n1 = lnteger .parselnt(number1. getText() . toString());
        int n2 = lnteger .parselnt(number2. getText() . toString());
        result.setText(Integer.toString(n1 - n2));

    }
    public void multiplyClick(View v) {
        EditText number1 = (EditText) findViewByld(R. id. number1);
        EditText number2 = (EditText) findViewByld(R. id. number2);
        TextView result = (TextView) findViewByld(R. id. result);
        int n1 = lnteger .parselnt(number1. getText() . toString());
        int n2 = lnteger .parselnt(number2. getText() . toString());
        result.setText(Integer.toString(n1 * n2));

    }
    public void diviveClick(View v) {
        EditText number1 = (EditText) findViewByld(R. id. number1);
        EditText number2 = (EditText) findViewByld(R. id. number2);
        TextView result = (TextView) findViewByld(R. id. result);
        int n1 = lnteger .parselnt(number1. getText() . toString());
        int n2 = lnteger .parselnt(number2. getText() . toString());
        result.setText(Integer.toString(n1 / n2));

    }
}
