package PVZ;

import java.util.List;

public abstract class Plant extends Character{
    int sun_cost;
    public Plant(String name, int hp, int damage, int sun_cost, float column, int rows) {
        super(name, hp, damage, column, rows);
        this.sun_cost = sun_cost;
    }

    public abstract void attack(List<Zombie> everyone);
    public static class Peashooter extends Plant {

        public Peashooter(float column, int rows) {
            super("Peashooter", 500, 20, 100, column, rows);
        }

        @Override
        public void attack(List<Zombie> everyone) {
            everyone.sort(new DistanceComparator(this));
//            System.out.println("Closest to " + this);
            for (Character c : everyone) {
                if (c.row == this.row) {
                    System.out.println("Attacking " + c);
                    c.takeDamage(damage);
                    break;
                }

            }
        }
    }
}
