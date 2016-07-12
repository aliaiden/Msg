package com.oneten.alihaider.msg;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateFormat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends AppCompatActivity {
    EditText msg, key1, key2;
    TextView result;
    Button submit;
    String message, k1, k2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        msg = (EditText) findViewById(R.id.etMessage);
        key1 = (EditText) findViewById(R.id.etKey1);
        key2 = (EditText) findViewById(R.id.etKey2);
        result = (TextView) findViewById(R.id.tvResult);
        submit = (Button) findViewById(R.id.bSubmit);

        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String myResult = "";

                result.setText("");

                //Get current time as string
                Date dt = new Date();
                double hour = dt.getHours();
                double min = dt.getMinutes();
                //String time = "" + hr + mn;

                String mn = null;
                mn.format("%2f",min);

                String hr = null;
                hr.format("%2f",min);

                result.append(hr.format("%2f",min));
                myResult=myResult + hr.format("%.2f",min);

                k1 = key1.getText().toString();
                k2 = key2.getText().toString();
                myResult=myResult + k1.substring(0,2) + k2.substring(2,4);

                //myResult=myResult.concat(k1.substring(0,2));
                //myResult=myResult.concat(k2.substring(2,4));
                result.append(k1.substring(0, 2));
                result.append(k2.substring(2, 4));

                message = msg.getText().toString();
                char[] aMessage = message.toCharArray();
                int i;


                for (i = 0; i < message.length(); i++) {
                    result.append(matchCode(aMessage[i]).toString());
                    //myResult=myResult.concat(matchCode(aMessage[i]).toString());
                    myResult=myResult + matchCode(aMessage[i]).toString();

                }

                //myResult=myResult.concat(k1.substring(2,4) + k2.substring(0,2));
                myResult=myResult + k1.substring(2,4) + k2.substring(0,2);
                result.append(k1.substring(2, 4));
                result.append(k2.substring(0, 2));


                result.append(hr.format("%2f",hour));
                myResult=myResult + hr.format("%2f",hour);
                result.setText("");
                result.setText(myResult);

            }
        });


    }

    private Integer matchCode(char c) {
        int code = 0;

        if (c == ' ') {
            code = 1063;
        }
        if (c == 'A') {
            code = 1005;
        }
        if (c == 'B') {
            code = 2007;
        }
        if (c == 'C') {
            code = 1009;
        }
        if (c == 'D') {
            code = 2008;
        }

        if (c == 'E')

        {
            code = 1010;
        }

        if (c == 'F')

        {
            code = 2013;
        }

        if (c == 'G')

        {
            code = 1012;
        }

        if (c == 'H')

        {
            code = 2011;
        }

        if (c == 'I')

        {
            code = 1017;
        }

        if (c == 'J')

        {
            code = 1016;
        }

        if (c == 'K')

        {
            code = 1015;
        }

        if (c == 'L')

        {
            code = 2014;
        }

        if (c == 'M')

        {
            code = 2018;
        }

        if (c == 'N')

        {
            code = 2019;
        }

        if (c == 'O')

        {
            code = 1021;
        }

        if (c == 'P')

        {
            code = 1021;
        }

        if (c == 'Q')

        {
            code = 2020;
        }

        if (c == 'R')

        {
            code = 1024;
        }

        if (c == 'S')

        {
            code = 1023;
        }

        if (c == 'T')

        {
            code = 2025;
        }

        if (c == 'U')

        {
            code = 1006;
        }

        if (c == 'V')

        {
            code = 2004;
        }

        if (c == 'W')

        {
            code = 1003;
        }

        if (c == 'X')

        {
            code = 2002;
        }

        if (c == 'Y') {
            code = 1001;
        }

        if (c == 'Z') {
            code = 2026;
        }


        if (c == 'a') {
            code = 1032;
        }
        if (c == 'b') {
            code = 2036;
        }
        if (c == 'c') {
            code = 2035;
        }
        if (c == 'd') {
            code = 1034;
        }
        if (c == 'e') {
            code = 2039;
        }
        if (c == 'f') {
            code = 2038;
        }
        if (c == 'g') {
            code = 1037;
        }
        if (c == 'h') {
            code = 1042;
        }
        if (c == 'i') {
            code = 1041;
        }
        if (c == 'j') {
            code = 2040;
        }
        if (c == 'k') {
            code = 2044;
        }
        if (c == 'l') {
            code = 1043;
        }
        if (c == 'm') {
            code = 2047;
        }
        if (c == 'n') {
            code = 1048;
        }
        if (c == 'o') {
            code = 1046;
        }
        if (c == 'p') {
            code = 2049;
        }
        if (c == 'q') {
            code = 2050;
        }
        if (c == 'r') {
            code = 1052;
        }
        if (c == 's') {
            code = 1051;
        }
        if (c == 't') {
            code = 1045;
        }
        if (c == 'u') {
            code = 2033;
        }
        if (c == 'v') {
            code = 1027;
        }
        if (c == 'w') {
            code = 2029;
        }
        if (c == 'x') {
            code = 2030;
        }
        if (c == 'y') {
            code = 1028;
        }
        if (c == 'z') {
            code = 2031;
        }
        if (c == '\'') {
            code = 1074;
        }
        if (c == '"') {
            code = 2075;
        }
        if (c == ';') {
            code = 1076;
        }
        if (c == ':') {
            code = 1077;
        }
        if (c == '(') {
            code = 2078;
        }
        if (c == ')') {
            code = 2079;
        }
        if (c == '.') {
            code = 2070;
        }
        if (c == ',') {
            code = 2064;
        }
        if (c == '$') {
            code = 2069;
        }
        if (c == '#') {
            code = 1068;
        }
        if (c == '/') {
            code = 2065;
        }
        if (c == '-') {
            code = 1067;
        }
        if (c == '_') {
            code = 2066;
        }
        if (c == '=') {
            code = 1071;
        }
        if (c == '+') {
            code = 2072;
        }
        if (c == '*') {
            code = 2073;
        }
        if (c == '@') {
            code = 1080;
        }
        if (c == '%') {
            code = 2081;
        }
        if (c == '!') {
            code = 1082;
        }
        if (c == '<') {
            code = 2083;
        }
        if (c == '>') {
            code = 1084;
        }
        if (c == '1') {
            code = 1053;
        }
        if (c == '2') {
            code = 2056;
        }
        if (c == '3') {
            code = 2057;
        }
        if (c == '4') {
            code = 1058;
        }
        if (c == '5') {
            code = 1054;
        }
        if (c == '6') {
            code = 2061;
        }
        if (c == '7') {
            code = 2060;
        }
        if (c == '8') {
            code = 1059;
        }
        if (c == '9') {
            code = 2055;
        }
        if (c == '0') {
            code = 1062;
        }

        return code;
    }
}
