package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // Set the content of the activity to use the activity_main.xml layout file
            setContentView(R.layout.activity_main);

            // Find the View that shows the track list
            Button start = (Button) findViewById(R.id.welcome_button);

            // Set a click listener on that View (numbers)
            start.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the welcome button is clicked on.
                @Override
                public void onClick(View view) {
                    Intent tracksIntent = new Intent(MainActivity.this, TrackListActivity.class);
                    startActivity(tracksIntent);
                }
            });
        }
    }
