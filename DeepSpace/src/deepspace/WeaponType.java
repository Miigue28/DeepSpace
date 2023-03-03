package deepspace;

/**
 * @author miguelangelmc
 */
public enum WeaponType {
    LASER(2.0),
    MISSILE(3.0),
    PLASMA(4.0);
    
    private final double power;
    
    WeaponType(double power){
        this.power = power;
    }
    
    public double getPower(){ return power; }
}