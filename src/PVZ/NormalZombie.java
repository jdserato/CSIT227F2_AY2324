package PVZ;

public class NormalZombie extends Zombie{
    public NormalZombie() {
        super("Normal Zombie", 181, 100, 4.7);
    }

    public NormalZombie(String name) {
        super(name, 181, 100, 4.7);
    }

    public static class ConeheadZombie extends NormalZombie implements Shieldable {
        Shield.Cone myCone;

        public ConeheadZombie() {
            super("Conehead Zombie");
            myCone = new Shield.Cone();
        }

        @Override
        public Shield getShield() {
            return myCone;
        }
    }

    public static class NewspaperZombie extends NormalZombie implements Shieldable {
        Shield.Newspaper myNews;

        public NewspaperZombie() {
            super("Newspaper Zombie");
            this.myNews = new Shield.Newspaper();
        }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
            if (myNews.hp <= 0) {
                speed = 1.8;
            }
        }

        @Override
        public Shield getShield() {
            return myNews;
        }
    }
}
