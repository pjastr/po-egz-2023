package space;

import java.util.Arrays;
import java.util.Objects;

public class Spacecraft {

    private String name;
    private String manufacturer;
    private double[] ratings;

    public Spacecraft(String name, String manufacturer, double[] ratings) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.ratings = ratings.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings.clone();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": "+
                name +", "+manufacturer+", "+ Arrays.toString(ratings) +".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spacecraft that = (Spacecraft) o;

        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(manufacturer, that.manufacturer)) return false;
        return Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }
}
