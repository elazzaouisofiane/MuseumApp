
// // importing packages
import java.util.ArrayList;
import java.util.HashMap;

public class Museum {
    public String NAME;
    public String LOCATION;
    // Map for fee structure
    public Map<Daytime, Double> entryFeeTable;
    // Store visitors
    private ArrayList<Visitor> visitors;

    public Museum() {
        entryFeeTable = new HashMap<>();
        visitors = new ArrayList<>();
        populateFeeTable();
    }

    public double getFee(LocalDateTime visitDateTime){
        DayTime dayTime = new DayTime(visitDateTime);
        return entryFeeTable
    }

}