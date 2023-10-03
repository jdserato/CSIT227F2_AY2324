package PVZ;

public abstract class Shield {
    int hp;

    public Shield(int hp) {
        this.hp = hp;
    }

    public static class Cone extends Shield {

        public Cone() {
            super(370);
        }
    }

    public static class Newspaper extends Shield {

        public Newspaper() {
            super(150);
        }
    }


}
