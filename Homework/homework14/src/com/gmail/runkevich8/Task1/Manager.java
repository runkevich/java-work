package com.gmail.runkevich8.Task1;

import com.beaglebuddy.mp3.MP3;
import com.gmail.runkevich8.Task1.entity.Album;
import com.gmail.runkevich8.Task1.entity.Artist;
import com.gmail.runkevich8.Task1.entity.Music;
import com.gmail.runkevich8.Task1.entity.Track;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    private static ArrayList<Track> checkSumList = new ArrayList<>();
    private static Music music = new Music();

    public void loadData(String link) {
        File folder = new File(link);
        File[] files = folder.listFiles();

        try {
            for (File s : files) {
                MP3 mp3 = new MP3(s);

                Artist artist = ifExitArtist(mp3.getBand());
                Album album = ifExitAlbum(mp3.getAlbum(), artist);
                ArrayList<Track> list = album.getTracks();

                Track track = new Track();
                track.setNameTrack(mp3.getTitle());
                track.setDuration(mp3.getAudioDuration());
                track.setLink(s.toString());
                track.setCheckSum(findCheckSum(s));
                track.setArtist(artist.getName());
                track.setAlbum(album.getNameAlbum());

                checkSumList.add(track);

                list.add(track);
                artist.getAlbums().add(album);
                music.getArtists().add(artist);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String DescriptionMusic() {
        return music.toString();
    }

    public String Duplicates() {

        Map<String, ArrayList<String>> map = findDuplicates(checkSumList);
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, ArrayList<String>> mapToPrint : map.entrySet()) {
            if (mapToPrint.getValue().size() > 1) {

                stringBuilder.append(mapToPrint.getKey());
                stringBuilder.append("\n");
                for (String d : mapToPrint.getValue()) {

                    stringBuilder.append(d);
                    stringBuilder.append("\n");
                }

                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public String DuplicateCheckSum() {


        Map<String, ArrayList<String>> map = findDuplicatesCheckSum(checkSumList);
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (Map.Entry<String, ArrayList<String>> mapToPrint : map.entrySet()) {
            if (mapToPrint.getValue().size() > 1) {
                count++;
                stringBuilder.append("Duplicates ");
                stringBuilder.append(count);
                stringBuilder.append(":\n");


                for (String d : mapToPrint.getValue()) {
                    stringBuilder.append(d);
                    stringBuilder.append("\n");
                }
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    private Artist ifExitArtist(String check) {

        Artist artist;
        if (!music.getArtists().contains(new Artist(check))) {
            artist = new Artist(check);
            return artist;
        } else {
            for (Artist a : music.getArtists()) {
               if (a.getName().equals(check) ) {
                    return a;
                }
            }
        }
        return null;
    }

    private Album ifExitAlbum(String check, Artist artist) {
        Album album;
        if (!artist.getAlbums().contains(new Album(check))) {
            album = new Album(check);
            return album;
        } else {
            for (Album a : artist.getAlbums()) {
                if (a.getNameAlbum().equals(check)) {
                    return a;
                }
            }
        }

        return null;
    }

    private String findCheckSum(File file) {
        try {

            final MessageDigest md = MessageDigest.getInstance("SHA-1");
            final FileInputStream fis = new FileInputStream(file);
            byte[] dataBytes = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(dataBytes)) > 0) {

                md.update(dataBytes, 0, bytesRead);
            }
            byte[] bytes = md.digest();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16)
                        .substring(1));
            }
            return sb.toString();
        } catch (FileNotFoundException | NoSuchAlgorithmException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    private Map<String, ArrayList<String>> findDuplicatesCheckSum(List<Track> list) {

        Map<String, ArrayList<String>> map = new HashMap<>();

        for (Track track : list) {
            if (!map.containsKey(track.getCheckSum())) {
                ArrayList<String> listTracks = new ArrayList<>();
                listTracks.add(track.getLink());
                map.put(track.getCheckSum(), listTracks);
            } else {
                map.get(track.getCheckSum()).add(track.getLink());
            }
        }
        return map;
    }

    private Map<String, ArrayList<String>> findDuplicates(List<Track> list) {
        Map<String, ArrayList<String>> map = new HashMap<>();

        for (Track track : list) {
            String string = track.getArtist() + " " + track.getAlbum() + " " + track.getNameTrack();
            if (!map.containsKey(string)) {
                ArrayList<String> listTracks = new ArrayList<>();
                listTracks.add(track.getLink());
                map.put(string, listTracks);
            } else {
                map.get(string).add(track.getLink());
            }
        }
        return map;
    }
}
