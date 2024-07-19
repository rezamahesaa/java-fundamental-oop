import java.util.Arrays;

public class Allowance implements InterfaceAllowance{
    private int employeeID;
    private int totalTravel;
    private int totalInsurance;
    private int[] listTravelAllowance;
    private int[] listInsuranceAllowance;
    
    public Allowance(int employeeID, int[] listTravelAllowance, int[] listInsuranceAllowance) {
        this.employeeID = employeeID;
        this.listTravelAllowance = listTravelAllowance;
        this.listInsuranceAllowance = listInsuranceAllowance;
    }

    public int getTotalTravel() {
        return totalTravel;
    }

    public void setTotalTravel(int totalTravel) {
        this.totalTravel = totalTravel;
    }

    public int getTotalInsurance() {
        return totalInsurance;
    }

    public void setTotalInsurance(int totalInsurance) {
        this.totalInsurance = totalInsurance;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int[] getListTravelAllowance() {
        return listTravelAllowance;
    }

    public void setListTravelAllowance(int[] listTravelAllowance) {
        this.listTravelAllowance = listTravelAllowance;
    }
    
    public int[] getListInsuranceAllowance() {
        return listInsuranceAllowance;
    }

    public void setListInsuranceAllowance(int[] listInsuranceAllowance) {
        this.listInsuranceAllowance = listInsuranceAllowance;
    };

    @Override
    public void calculateTotalTravel(){
        int total = 0;
        for (int i : listTravelAllowance) {
            total += i;
        }
        setTotalTravel(total);
    };

    @Override
    public void calculateTotalInsurance(){
        int total = 0;
        for (int i : listInsuranceAllowance) {
            total += i;
        }
        setTotalInsurance(total);
    }

    @Override
    public String toString() {
        return "Allowance [employeeID=" + employeeID + ", totalTravel=" + totalTravel + ", totalInsurance="
                + totalInsurance + ", listTravelAllowance=" + Arrays.toString(listTravelAllowance)
                + ", listInsuranceAllowance=" + Arrays.toString(listInsuranceAllowance) + "]";
    }


    
    
}
