package structural_patterns.flyweight;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Bullet {

    private EnumBulletSize bulletSize;

    public Bullet(EnumBulletSize bulletSize) {
        this.bulletSize = bulletSize;

        System.out.println(this.bulletSize.getSize() + " mm is created");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void shoot(){
        System.out.println("Shooting....!!!");
    }
}
