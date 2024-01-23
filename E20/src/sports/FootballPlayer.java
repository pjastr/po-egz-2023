package sports;

import java.util.Arrays;

public class FootballPlayer implements Cloneable{

    private String name;
    private int[] goals;

    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        this.goals = goals!=null ? goals.clone() : new int[5];
    }

    @Override
    public String toString() {
        return name + " " + Arrays.toString(goals);
    }

    @Override
    public FootballPlayer clone() throws CloneNotSupportedException {
        FootballPlayer clone = (FootballPlayer)super.clone();
        clone.goals = goals.clone();
        return clone;
    }

    public void changeLastGoal(int newGoal) {
        goals[goals.length-1] = newGoal;
    }

}
