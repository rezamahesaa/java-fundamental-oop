
import java.util.ArrayList;

public class TravelAllowance extends Allowance{
    private ArrayList<Integer[]> listTravel;

    public TravelAllowance(int employeeID, ArrayList<Integer[]> listTravel) {
        super(employeeID);
        this.listTravel = listTravel;
    }

    public ArrayList<Integer[]> getListTravel() {
        return listTravel;
    }

    public void setListTravel(ArrayList<Integer[]> listTravel) {
        this.listTravel = listTravel;
    }

    @Override
    public void calculateTotal(){
        // Integer total = 0;
        // for (Integer[] expense : listTravel) {
        //     total += expense[3]; //index ke-3 adalah total_travel_expense
        // }
        // setTotalTravel(total);
        
        Integer[] total = {0};
        listTravel.stream()
            .forEach(x -> total[0] += x[3]);
        setTotalTravel(total[0]);
    }
}