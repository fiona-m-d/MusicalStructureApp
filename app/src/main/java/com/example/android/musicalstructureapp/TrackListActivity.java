package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;



public class TrackListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_music_list.xml layout file
        setContentView(R.layout.activity_music_list);

        // Create a list of tracks
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Beatles", "Come Together"));
        songs.add(new Song("Kanye", "Stronger"));
        songs.add(new Song("Sufjan", "Chicago"));
        songs.add(new Song("Sia", "Big Girls Cry"));
        songs.add(new Song("Miley", "Malibu"));
        songs.add(new Song("First Aid Kit", "To Live a Life"));
        songs.add(new Song("Prince", "Let's go Crazy"));
        songs.add(new Song("Cardi", "I like it"));
        songs.add(new Song("Ed Sheeran", "Perfect"));
        songs.add(new Song("Gaga", "Born This Way"));

        // Create an TrackAdapter, whose data source is a list of Songs. The
        // adapter knows how to create list items for each item in the list.
        TrackAdapter adapter = new TrackAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the activity_music_list.
        // There should be a ListView with the view ID called list, which is declared in the
        // activity_music_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the ListView use the TrackAdapter} created above, so that the
        // ListView will display list items for each Song in the list.
        listView.setAdapter(adapter);


        // Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent mainPlayer = new Intent(TrackListActivity.this, MainPlayerActivity.class);
                mainPlayer.putExtra("artistName", songs.toString());
                mainPlayer.putExtra("trackName", songs.toString());
                startActivity(mainPlayer);
            }
        });


} }