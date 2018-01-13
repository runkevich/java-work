package com.gmail.runkevich8.Task1.entity;

import java.util.HashSet;
import java.util.Set;

public class Music {

    Set<Artist> artists = new HashSet<>();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Artist artist : artists) {
            builder.append(artist.getName());
            builder.append("\n");
            for (Album album : artist.getAlbums()) {
                builder.append("   ");
                builder.append(album.getNameAlbum());
                builder.append("\n");
                for (Track track : album.getTracks()) {
                    builder.append("      ");
                    builder.append("Name: ");
                    builder.append(track.getNameTrack());
                    builder.append(", duration: ");
                    builder.append(track.getDuration());
                    builder.append(", location: ");
                    builder.append(track.getLink());
                    builder.append("\n");
                }
            }

        }
        return builder.toString();
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }
}
