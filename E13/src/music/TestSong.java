package music;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = new Song[4];
        songs[0] = new Song("Roar", "Katy Perry", 228);
        songs[1] = new Song("Let it go", "Idina Menzel", 223);
        songs[2] = new Song("Red", "Taylor Swift", 223);
        songs[3] = new Song("Uptown Funk!", "Mark Ronson", 270);
        System.out.println("Before sorting:");
        for (Song song : songs) {
            System.out.println(song);
        }
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("After sorting:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
