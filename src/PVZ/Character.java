package PVZ;

import java.util.Comparator;
import java.util.List;

public abstract class Character {
    String name;
    int hp;
    int damage;
    float column;
    int row;

    public Character(String name, int hp, int damage, float column, int row) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.column = column;
        this.row = row;
    }


    public void takeDamage(int damage) {
        if (this instanceof Shieldable && ((Shieldable)this).getShield().hp > 0) {
            Shieldable c = (Shieldable) this;
            c.getShield().hp -= damage;
        } else {
            hp -= damage;
        }
    }

    public boolean isDead() {
        return hp <= 0;
    }

    @Override
    public String toString() {
        if (this instanceof Shieldable) {
            return name + " (" + hp + "+" + ((Shieldable)this).getShield().hp+") r:" + row + "|c:" + column;
        }
        return name + " (" + hp + ") r:" + row + "|c:" + column;
    }

    public static class DistanceComparator implements Comparator<Character> {
        Character source;
        public DistanceComparator(Character source) {
            this.source = source;
        }

        @Override
        public int compare(Character o1, Character o2) {
            if (o1.row == source.row && o2.row == source.row) {
                return Double.compare(o1.column - source.column, o2.column - source.column);
            }
            if (o1.row == source.row) {
                return -1;
            }
            if (o2.row == source.row) {
                return 1;
            }
            return 0;
        }
    }
}
