package com.gmail.runkevich8.Task1.entity;

import java.util.ArrayList;

public class Album {

    private String nameAlbum;
    private ArrayList<Track> tracks = new ArrayList<>();

    @Override
    public String toString() {
        return "Album{" +
                "nameAlbum='" + nameAlbum + '\'' +
                ", tracks=" + tracks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;

        return nameAlbum != null ? nameAlbum.equals(album.nameAlbum) : album.nameAlbum == null;
    }

    @Override
    public int hashCode() {
        return nameAlbum != null ? nameAlbum.hashCode() : 0;
    }

    public Album(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public String getNameAlbum() {
        return this.nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }

    public void setTracks(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }
}
