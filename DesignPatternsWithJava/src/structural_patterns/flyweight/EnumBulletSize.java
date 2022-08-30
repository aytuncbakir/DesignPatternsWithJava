package structural_patterns.flyweight;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public enum EnumBulletSize {

    TWO(2),
    FOUR(4),
    SIX(6)
    ;

    private int size;

    EnumBulletSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.valueOf(size);
    }

    public int getSize() {
        return size;
    }
}
