
import java.util.ArrayList;

public class AllowanceManagement implements InterfaceAllowanceManagement {
    private ArrayList<Allowance> listAllowanceEmployee;

    public AllowanceManagement(ArrayList<Allowance> listAllowanceEmployee) {
        this.listAllowanceEmployee = listAllowanceEmployee;
    }

    public ArrayList<Allowance> getListAllowanceEmployee() {
        return listAllowanceEmployee;
    }

    public void setListAllowanceEmployee(ArrayList<Allowance> listAllowanceEmployee) {
        this.listAllowanceEmployee = listAllowanceEmployee;
    }

    @Override
    public void displayAllAllowance(){
        for (Allowance allowance : listAllowanceEmployee) {
            System.out.println();
            System.out.println("User ID\t\tTotalTravel\tTotal Insurance\tTotal Allowance");
            System.out.println(allowance.getEmployeeID() + "\t\t"+ allowance.getTotalTravel() + "\t\t" + allowance.getTotalInsurance() + "\t\t" + allowance.getTotalAllowance());
        }
        System.out.println();
    }

    @Override
    public void editAllowance(int employeeID, int newTotalTravel, int newTotalInsurance){
        boolean isIdValid = false;
        for (Allowance allowance : listAllowanceEmployee) {
            if(allowance.getEmployeeID() == employeeID){
                allowance.setTotalTravel(newTotalTravel);
                allowance.setTotalInsurance(newTotalInsurance);
                isIdValid = true;
                break;
            }
        }
        if(!isIdValid){
            System.out.println("Employee ID salah");
        }
    }


}
