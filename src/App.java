public class App {
    public static void main(String[] args) {
        User dono = new User(1, "Dono Kasino", 28, "emaildono", "Back End Engineer", "dono123", "donodoyes");
        User koko = new User(2, "Koko Kaka", 25, "emailkoko", "Full Stack Engineer", "kokoruyuk", "ayamayam");

        User[] listUser = {dono, koko};
        UserManagement userManagement = new UserManagement(listUser);
        userManagement.userLogin("asd", "asd");
        userManagement.userLogin("dono123", "donodoyes");
        System.out.println("\n--------------Edit--------------\n");
        userManagement.userEdit("dono123", "donodoye", "asd", "asd");
        userManagement.userEdit("dono123", "donodoyes", "dono111", "doyesdono");
        userManagement.userLogin("dono111", "doyesdono");  
        
        int[] listTravelDono = {100000, 200000, 300000};
        int[] listInsuranceDono = {500000, 500000, 1000000};
        Allowance allowanceDono = new Allowance(1, listTravelDono, listInsuranceDono);
        allowanceDono.calculateTotalTravel();
        allowanceDono.calculateTotalInsurance();

        int[] listTravelKoko = {700000, 200000, 300000};
        int[] listInsuranceKoko = {1000000, 1000000, 1000000};
        Allowance allowanceKoko = new Allowance(2, listTravelKoko, listInsuranceKoko);
        allowanceKoko.calculateTotalInsurance();
        allowanceKoko.calculateTotalTravel();

        Allowance[] listAllowanceEmployee = {allowanceDono, allowanceKoko};
        AllowanceManagement allowancemanagement = new AllowanceManagement(listAllowanceEmployee);
        allowancemanagement.displayAllAllowance();

        allowancemanagement.editAllowance(3, 123);
        allowancemanagement.editAllowance(1, 123);
        allowancemanagement.editAllowance(2, 555, 111);
        allowancemanagement.displayAllAllowance();      

    }

    
}
