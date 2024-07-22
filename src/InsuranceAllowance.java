
import java.util.ArrayList;

public class InsuranceAllowance extends Allowance {
    private ArrayList<Integer> listInsurance;

    public InsuranceAllowance(int employeeID, ArrayList<Integer> listInsurance) {
        super(employeeID);
        this.listInsurance = listInsurance;
    }

    public ArrayList<Integer> getListInsurance() {
        return listInsurance;
    }

    public void setListInsurance(ArrayList<Integer> listInsurance) {
        this.listInsurance = listInsurance;
    }

    @Override
    public void calculateTotal(){
        Integer total[] = {0};
        listInsurance.stream()
            .forEach(x -> total[0]+=x);
        setTotalInsurance(total[0]);
    }
}
