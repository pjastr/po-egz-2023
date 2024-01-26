package music;

import java.util.ArrayList;

public class VinylStore extends MusicStore{

    private int numberOfVinyls;

    public VinylStore(String name, String city, ArrayList<String> albums, int numberOfVinyls) {
        super(name, city, albums);
        this.numberOfVinyls = numberOfVinyls;
    }

    public int getNumberOfVinyls() {
        return numberOfVinyls;
    }

    public void setNumberOfVinyls(int numberOfVinyls) {
        this.numberOfVinyls = numberOfVinyls;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfVinyls=" + numberOfVinyls;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        VinylStore that = (VinylStore) o;
        return this.numberOfVinyls == that.numberOfVinyls;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash = 31 * hash + this.numberOfVinyls;
        return hash;
    }
}
