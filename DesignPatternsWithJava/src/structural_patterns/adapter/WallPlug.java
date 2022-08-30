package structural_patterns.adapter;

public class WallPlug {

	public void giveElectric(ElectricalAppliances electricalAppliances){
        int volt = electricalAppliances.plugAndWork();
        System.out.println("Wall plug provide " + volt + " volt.");
    }
}
