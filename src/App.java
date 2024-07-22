
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        User dono = new User(1, "Dono Kasino", 28, "emaildono", "Back End Engineer", "dono123", "donodoyes");
        User koko = new User(2, "Koko Kaka", 25, "emailkoko", "Full Stack Engineer", "kokoruyuk", "ayamayam");
        User tara = new User(3, "Tara Tiri", 31, "emailtara", "Marketing", "tara123", "kungking");
        ArrayList<User> listUser = new ArrayList<>();
        listUser.add(dono);
        listUser.add(koko);
        listUser.add(tara);
        UserManagement userManagement = new UserManagement(listUser);
        userManagement.userLogin("asd", "asd");
        userManagement.userLogin("dono123", "donodoyes");
        System.out.println("\n--------------Edit--------------\n");
        userManagement.userEdit("dono123", "donodoye", "asd", "asd");
        userManagement.userEdit("dono123", "donodoyes", "dono111", "doyesdono");
        userManagement.userLogin("dono111", "doyesdono");  
        
        // travel expense =  hotel, transport, other, total
        Integer[] travelDono1 = {100000, 100000, 0, 200000};
        Integer[] travelDono2 = {200000, 300000, 0, 500000};
        Integer[] travelDono3 = {0, 200000, 50000, 250000};
        ArrayList<Integer[]> listTravelDono = new ArrayList<>(); //untuk constructor TravelAllowance
        listTravelDono.add(travelDono1);
        listTravelDono.add(travelDono2);
        listTravelDono.add(travelDono3);
        TravelAllowance travelDono = new TravelAllowance(1, listTravelDono);
        Integer[] travelDono4 = {0, 0, 100000, 100000};
        travelDono.getListTravel().add(travelDono4); //insert into class TravelAllowance dengan expense baru
        System.out.println();

        ArrayList<Integer> listInsuranceDono = new ArrayList<>();
        InsuranceAllowance insuranceDono = new InsuranceAllowance(1, listInsuranceDono);
        insuranceDono.getListInsurance().add(1000000);
        insuranceDono.getListInsurance().add(1000000);
        insuranceDono.getListInsurance().add(1000000);
        insuranceDono.getListInsurance().add(1000000);
        insuranceDono.getListInsurance().add(1000000);

        Allowance allowanceDono = new Allowance(1, insuranceDono, travelDono);
        // msh ada bug dua line dibawah
        // allowanceDono.getObjInsuranceAllowance().calculateTotal();
        // allowanceDono.getObjTravelAllowance().calculateTotal();
        travelDono.calculateTotal();        
        insuranceDono.calculateTotal();
        allowanceDono.setTotalTravel(travelDono.getTotalTravel());
        allowanceDono.setTotalInsurance(insuranceDono.getTotalInsurance());
        allowanceDono.calculateTotal();    
        
        Integer[] travelKoko1 = {100000, 100000, 100000, 300000};
        Integer[] travelKoko2 = {200000, 300000, 200000, 700000};
        Integer[] travelKoko3 = {250000, 200000, 50000, 500000};
        ArrayList<Integer[]> listTravelKoko = new ArrayList<>(); //untuk constructor TravelAllowance
        listTravelKoko.add(travelKoko1);
        listTravelKoko.add(travelKoko2);
        listTravelKoko.add(travelKoko3);
        TravelAllowance travelKoko = new TravelAllowance(2, listTravelKoko);

        ArrayList<Integer> listInsuranceKoko = new ArrayList<>();
        InsuranceAllowance insuranceKoko = new InsuranceAllowance(2, listInsuranceKoko);

        insuranceKoko.getListInsurance().add(200000);
        insuranceKoko.getListInsurance().add(200000);
        insuranceKoko.getListInsurance().add(200000);
        insuranceKoko.getListInsurance().add(200000);
        insuranceKoko.getListInsurance().add(200000);
        insuranceDono.calculateTotal();

        Allowance allowanceKoko = new Allowance(2, insuranceKoko, travelKoko);
        travelKoko.calculateTotal();
        insuranceKoko.calculateTotal();
        allowanceKoko.setTotalTravel(travelKoko.getTotalTravel());
        allowanceKoko.setTotalInsurance(insuranceKoko.getTotalInsurance());
        allowanceKoko.calculateTotal();

        ArrayList<Allowance> listAllowanceEmployee = new ArrayList<>();
        listAllowanceEmployee.add(allowanceDono);
        listAllowanceEmployee.add(allowanceKoko);
        AllowanceManagement  allowanceManagement= new AllowanceManagement(listAllowanceEmployee);

        allowanceManagement.displayAllAllowance();

        allowanceManagement.editAllowance(1, 123, 332);
        allowanceManagement.editAllowance(2, 555, 111);
        System.out.println("\n--------------Edit--------------\n");
        allowanceManagement.displayAllAllowance();      

    }

    
}
