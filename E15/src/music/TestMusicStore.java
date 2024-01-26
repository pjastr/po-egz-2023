package music;

import java.util.ArrayList;

public class TestMusicStore {

    public static void main(String[] args) {
        ArrayList<String> albums = new ArrayList<>();
        albums.add("The Dark Side of the Moon");
        albums.add("The Wall");
        albums.add("Animals");
        MusicStore m1 = new MusicStore("Music Store 1", "City 1", albums);
        System.out.println(m1);
        m1.addAlbum("The Final Cut");
        System.out.println(m1);
        m1.removeAlbum("Animals");
        System.out.println(m1);
        ArrayList<String> albums2 = new ArrayList<>();
        albums2.add("Wish You Were Here");
        albums2.add("Pulse");
        MusicStore m2 = new MusicStore("Music Store 2", "City 2", albums2);
        System.out.println(m2);
        m2.addAlbum("The Division Bell");
        System.out.println(m2);
        m2.removeAlbum("Pulse");
        System.out.println(m2);

    }
}
