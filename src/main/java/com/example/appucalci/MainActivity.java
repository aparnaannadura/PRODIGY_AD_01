package com.example.appucalci;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String str = "";
    char op = 'q';
    float num, numtemp;
    TextView result;
    Button one, two, three, four, five, six, seven, eight, nine, zero, decimal, equals, add, subtract, multiply, divide, clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.res);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        decimal = findViewById(R.id.decimal);
        equals = findViewById(R.id.equals);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(1);
            }
        });
        // Set OnClickListener for the "2" button
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(2);
            }
        });

// Set OnClickListener for the "3" button
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(3);
            }
        });

// Set OnClickListener for the "4" button
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(4);
            }
        });
        // Set OnClickListener for the "0" button
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(0);
            }
        });

// Set OnClickListener for the "9" button
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(9);
            }
        });

// Set OnClickListener for the "8" button
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(8);
            }
        });

// Set OnClickListener for the "7" button
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(7);
            }
        });

// Set OnClickListener for the "6" button
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(6);
            }
        });

// Set OnClickListener for the "5" button
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert(5);
            }
        });

// Similarly, set OnClickListener for other number buttons as well

// Set OnClickListener for the decimal button
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement decimal functionality here
            }
        });

// Set OnClickListener for the equals button
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement equals functionality here
            }
        });

// Set OnClickListener for the add button
        // Set OnClickListener for the "+" button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = '+';
                perform();
                result.setText(String.valueOf(num) + "+");
            }
        });

// Set OnClickListener for the "-" button
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = '-';
                perform();
                result.setText(String.valueOf(num) + "-");
            }
        });

// Set OnClickListener for the "*" button
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = '*';
                perform();
                result.setText(String.valueOf(num) + "*");
            }
        });

// Set OnClickListener for the "/" button
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op = '/';
                perform();
                result.setText(String.valueOf(num) + "/");
            }
        });

// Set OnClickListener for the "=" button
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = "";
                op = 'q';
                num = 0;
                numtemp = 0;
                result.setText("");
            }
        });
    }

    private void insert(int i) {
        str = str + Integer.toString(i);
        num = Float.parseFloat(str);
        result.setText(str);
    }

    private void perform() {
        str = "";
        numtemp = num;
    }

    private void calculate() {
        if (op == '+') {
            num = numtemp + num;
        } else if (op == '-') {
            num = numtemp - num;
        } else if (op == '*') {
            num = numtemp * num;
        } else if (op == '/') {
            num = numtemp / num;
        }
        result.setText(String.valueOf(num));
    }
}
