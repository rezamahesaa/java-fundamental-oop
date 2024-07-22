
import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> listUser;

    public UserManagement(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    public ArrayList<User> getListUser() {
        return listUser;
    }

    public void setListUser(ArrayList<User> listUser) {
        this.listUser = listUser;
    }

    public void userLogin(String username, String password){
        System.out.println();
        User validUser = listUser.stream()
                .filter(u -> ((u.getUsername().equals(username)) && (u.getPassword().equals(password))))
                .findFirst()
                .orElse(null);
        if(validUser == null){
            System.out.println("Username atau password SALAH!");
        }
        else{
            System.out.println("Halo " + validUser.getName() + " ("+ validUser.getUsername() +")!");
        }

    }
    public void userEdit(String oldUsername, String oldPassword, String newUsername, String newPassword){
        System.out.println();
        User validUser = listUser.stream()
                .filter(u -> ((u.getUsername().equals(oldUsername)) && (u.getPassword().equals(oldPassword))))
                .findFirst()
                .orElse(null);
        if(validUser == null){
            System.out.println("Username atau password SALAH!");
        }
        else{
            System.out.println("Halo " + validUser.getName() + " ("+ validUser.getUsername() +")!");
            validUser.setUsername(newUsername);
            validUser.setPassword(newPassword);
        }
    }
}
