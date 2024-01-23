package arrayAlg;

public class VideoGame implements Comparable<VideoGame> {

    private String name;
    private String developer;
    private float rating;

    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" + "name=" + name + ", developer=" + developer + ", rating=" + rating + '}';
    }

    @Override
    public int compareTo(VideoGame obj) {
        return this.name.compareTo(obj.name);
    }
}
