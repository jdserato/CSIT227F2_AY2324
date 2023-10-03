package PVZ;

import java.util.List;
import java.util.Random;

public abstract class Zombie extends Character{
    double speed;
    public Zombie(String name, int hp, int damage, double speed) {
        super(name, hp, damage, 10, 0);
        Random random = new Random();
        super.row = random.nextInt(5) + 1;
        super.column = 10 + random.nextFloat();
        this.speed = speed;
    }

    public void attack(List<Plant> everyone) {
        Plant nearby = plantNearby(everyone);
        if (nearby == null) {
            column -= 1 / speed;
        } else {
            nearby.takeDamage(this.damage);
        }
    }

    private Plant plantNearby(List<Plant> everyone) {
        for (Character c : everyone) {
            if (c instanceof Plant && c.row == this.row && c.column == Math.ceil(this.column)) {
                return (Plant) c;
            }
        }
        return null;
    }
}
