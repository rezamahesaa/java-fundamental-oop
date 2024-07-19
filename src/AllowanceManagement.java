public class AllowanceManagement implements InterfaceAllowanceManagement {
    private Allowance[] listAllowanceEmployee;

    public AllowanceManagement(Allowance[] listAllowanceEmployee) {
        this.listAllowanceEmployee = listAllowanceEmployee;
    }

    public Allowance[] getListAllowanceEmployee() {
        return listAllowanceEmployee;
    }

    public void setListAllowanceEmployee(Allowance[] listAllowanceEmployee) {
        this.listAllowanceEmployee = listAllowanceEmployee;
    }

    @Override
    public void displayAllAllowance(){
        for (Allowance allowance : listAllowanceEmployee) {
            System.out.println();
            System.out.println("User ID\t\tTotalTravel\tTotal Insurance");
            System.out.println(allowance.getEmployeeID() + "\t\t"+ allowance.getTotalTravel() + "\t\t" + allowance.getTotalInsurance());
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

    // OVERLOAD edit allowance jd HANYA ubah total travel
    public void editAllowance(int employeeID, int newTotalTravel){
        boolean isIdValid = false;
        for (Allowance allowance : listAllowanceEmployee) {
            if(allowance.getEmployeeID() == employeeID){
                allowance.setTotalTravel(newTotalTravel);
                isIdValid = true;
                break;
            }
        }
        if(!isIdValid){
            System.out.println("Employee ID salah");
        }
    }


}
