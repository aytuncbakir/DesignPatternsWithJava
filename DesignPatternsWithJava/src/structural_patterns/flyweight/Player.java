package structural_patterns.flyweight;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public abstract class Player {

    private EnumBulletSize bulletSize;

    public Player(EnumBulletSize bulletSize) {
        this.bulletSize = bulletSize;
    }

    public void fire(){

      //Bullet bullet = new Bullet(bulletSize);  // This cause to performance problem

        Bullet bullet = BulletFactory.produceBullet(bulletSize);
        bullet.shoot();
    }

    public void serialFire(){
        for (int i = 0; i < 5; i++){
            fire();
        }
    }

}
