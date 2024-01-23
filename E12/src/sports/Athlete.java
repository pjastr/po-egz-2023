package sports;

import java.util.Arrays;

public class Athlete {

    private String name;
    private String nationality;

    private double[] records;

    public Athlete(String name, String nationality, double[] records){
        this.name = name;
        this.nationality = nationality;
        this.records = records != null ? records.clone() : new double[0];
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", records=" + Arrays.toString(records) +
                '}';
    }

    public double getMaxRecord() {
        if (records.length == 0)
            throw new IllegalStateException("No records found");
        double max = records[0];
        for (double record : records) {
            if (record > max) max = record;
        }
        return max;
    }

    public String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }
}
