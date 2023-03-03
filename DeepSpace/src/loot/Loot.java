package loot;

/**
 * @author miguelangelmc
 */
public class Loot {
    private int nSupplies;
    private int nWeapons;
    private int nShields;
    private int nHangars;
    private int nMedals;
    
    Loot(int nsupplies, int nweapons, int nshields, int nhangars, int nmedals){
        nSupplies = nsupplies;
        nWeapons = nweapons;
        nShields = nshields;
        nHangars = nhangars;
        nMedals = nmedals;
    }
    
    public int getNSupplies(){ return nSupplies; }
    public int getNWeapons(){ return nWeapons; }
    public int getNShields(){ return nShields; }
    public int getNHangars(){ return nHangars; }
    public int getNMedals(){ return nMedals; }
}
