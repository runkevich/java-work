package com.gmail.runkevich8.Task1.entity;

import java.util.HashSet;
import java.util.Set;

public class Artist {

    private String name;
    private Set<Album> albums = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        return name != null ? name.equals(artist.name) : artist.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public Artist(String name){
        this.name = name;
    }

    public String toString() {
        return "Band{name='" + this.name + '\'' + ", albums=" + this.albums + '}';
    }

    public String getName() {
        return this.name;
    }

    public Set<Album> getAlbums() {
        return this.albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }

}
