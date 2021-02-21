package com.talkingandroid.hour2application;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        String message = "no data from intent";
        Intent intent = getIntent();

        if (intent != null) {
            if (intent.hasExtra("com.talkingandroid.MESSAGE")) {
                message = intent.getStringExtra("com.talkingandroid.MESSAGE");
            } else if (intent.hasExtra(Intent.EXTRA_TEXT)) {
                message = intent.getStringExtra(Intent.EXTRA_TEXT);
            }
        }
        TextView messageTextView = (TextView) findViewById(R.id.message);
        messageTextView.setText(message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_secondary, menu);
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
}
