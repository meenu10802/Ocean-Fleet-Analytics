import java.util.ArrayList;
import java.util.List;

/*
 * VesselUtil class
 * ----------------
 * UC5: Provides storage and retrieval for UI.
 */
public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public void addVessel(Vessel vessel) {
        vesselList.add(vessel);
    }

    public List<Vessel> getAllVessels() {
        return vesselList;
    }
}