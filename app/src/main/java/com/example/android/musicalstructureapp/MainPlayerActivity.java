package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by fiona on 07/05/2018.
 */

public class MainPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main_player.xml layout file
        setContentView(R.layout.activity_main_player);

        // Use the artist/title passed from the TrackListActivity
        Intent mainPlayer = getIntent();
        String mainPlayerArtist = mainPlayer.getStringExtra("artistName");
        String mainPlayerTrack = mainPlayer.getStringExtra("trackName");

        // Populate the activity_main_player text views with these values
        TextView artistTextView = (TextView) findViewById(R.id.artist_display);
        artistTextView.setText(mainPlayerArtist);

        TextView songTextView = (TextView) findViewById(R.id.song_display);
        songTextView.setText(mainPlayerTrack);

        // Find the View that shows back button
        ImageView back = (ImageView) findViewById(R.id.back_button);

        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), R.string.back_button_toast, Toast.LENGTH_SHORT).show();
            }
        });

        // Find the View that shows play button
        ImageView play = (ImageView) findViewById(R.id.play_button);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), R.string.play_button_toast, Toast.LENGTH_SHORT).show();
            }
        });

        // Find the View that shows pause button
        ImageView pause = (ImageView) findViewById(R.id.pause_button);

        // Set a click listener on that View
        pause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), R.string.pause_button_toast, Toast.LENGTH_SHORT).show();
            }
        });

        // Find the View that shows skip button
        ImageView skip = (ImageView) findViewById(R.id.forward_button);

        // Set a click listener on that View
        skip.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the back button is clicked on.
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), R.string.skip_button_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

