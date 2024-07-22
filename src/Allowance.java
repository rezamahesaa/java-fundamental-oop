public class Allowance{
    private int employeeID;
    private int totalTravel;
    private int totalInsurance;
    private TravelAllowance objTravelAllowance;
    private InsuranceAllowance objInsuranceAllowance;
    private int totalAllowance;
    
    public Allowance(int employeeID) {
        this.employeeID = employeeID;
    }

    public Allowance(int employeeID, InsuranceAllowance objInsuranceAllowance, TravelAllowance objTravelAllowance) {
        this.employeeID = employeeID;
        this.objInsuranceAllowance = objInsuranceAllowance;
        this.objTravelAllowance = objTravelAllowance;
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
    
    public TravelAllowance getObjTravelAllowance() {
        return objTravelAllowance;
    }

    public void setObjTravelAllowance(TravelAllowance objTravelAllowance) {
        this.objTravelAllowance = objTravelAllowance;
    }

    public InsuranceAllowance getObjInsuranceAllowance() {
        return objInsuranceAllowance;
    }

    public void setObjInsuranceAllowance(InsuranceAllowance objInsuranceAllowance) {
        this.objInsuranceAllowance = objInsuranceAllowance;
    }

    public int getTotalAllowance() {
        return totalAllowance;
    }

    public void setTotalAllowance(int totalAllowance) {
        this.totalAllowance = totalAllowance;
    };

    public void calculateTotal(){
        setTotalAllowance(totalTravel + totalInsurance);
    }
    
}
