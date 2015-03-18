package com.example.abunaim.guessarandomnumber;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void generate(View v) {
        EditText usernum = (EditText) findViewById(R.id.editText);
        int intnum = Integer.parseInt(usernum.toString());
        Random randnum = new Random();
        int finalnum = randnum.nextInt(1000);
        TextView rslt = (TextView) findViewById(R.id.textView2);
        if ((finalnum - intnum) == 0) {
            rslt.setText("Wow,its a correct guess ");
        }
        if (intnum <= finalnum + 5 && intnum > finalnum - 5) {
            rslt.setText("your very close");


        }
        if (intnum > finalnum) {

            rslt.setText("your guess is greater");

        }
        if (intnum < finalnum) {

            rslt.setText("Your guess is smaller, Try again");

        }
    }
}
