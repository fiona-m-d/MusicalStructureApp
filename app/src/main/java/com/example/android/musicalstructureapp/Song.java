package com.example.android.musicalstructureapp;

import android.content.Context;
import android.view.View;

/**
 * Created by fiona on 15/04/2018.
 */

public class Song {

    /**
     * artist name
     */
    private String mArtistName;

    /**
     * song title
     */
    private String mTrackName;

    /**
     * Create a new Song object.
     */
    public Song(String artistName, String trackName) {
        mArtistName = artistName;
        mTrackName = trackName;
    }

    /**
     * Get the atrist's name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the song title
     */
    public String getTrackName() {
        return mTrackName;
    }
}