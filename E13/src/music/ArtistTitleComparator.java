package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song>{
    @Override
    public int compare(Song obj1, Song obj2) {
        int baseComparison = obj2.getArtist().compareTo(obj1.getArtist());
        if (baseComparison != 0) {
            return baseComparison;
        }
        return obj2.getTitle().compareTo(obj1.getTitle());
    }
}
