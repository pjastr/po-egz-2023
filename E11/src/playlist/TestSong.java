package playlist;

import java.util.Arrays;

public class TestSong {

    public static void main(String[] args) {
        Song[] songs = new Song[5];
        songs[0] = new Song("The Twist", "Chubby Checker", 120);
        songs[1] = new Song("Smooth", "Santana", 180);
        songs[2] = new Song("Mack the Knife", "Bobby Darin", 120);
        songs[3] = new Song("How Do I Live", "LeAnn Rimes", 240);
        songs[4] = new Song("Party Rock Anthem", "LMFAO", 180);
        for(var element : songs) {
            System.out.println(element);
        }
        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println("After sorting:");
        for(var element : songs) {
            System.out.println(element);
        }
    }
}
