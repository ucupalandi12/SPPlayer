package com.example.ucupalandi12.spplayer;

import com.example.ucupalandi12.spplayer.Config;
import com.example.ucupalandi12.spplayer.Track;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SCService {
    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    Call<List<Track>> getRecentTracks(@Query("created_art") String date);
}
