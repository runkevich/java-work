package com.gmail.runkevich8.Task1.entity;

public class Track {

    private String artist;
    private String album;
    private String nameTrack;
    private int duration;
    private String link;
    private String checkSum;

    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum;
    }


    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }


    @Override
    public String toString() {
        return "Track{" +
                "nameTrack='" + nameTrack + '\'' +
                ", duration=" + duration +
                ", link='" + link + '\'' +
                '}';
    }

}
