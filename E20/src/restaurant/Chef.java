package restaurant;

public class Chef {

    private int id;
    private String name;
    private double skillLevel;

    public Chef(int id, String name, double skillLevel) {
        this.id = id;
        this.name = name;
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + skillLevel;
    }

    public String getName() {
        return name;
    }

    public double getSkillLevel() {
        return skillLevel;
    }
}
