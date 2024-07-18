public class UserManagement {
    private User[] listUser;

    public UserManagement(User[] listUser) {
        this.listUser = listUser;
    }

    public User[] getListUser() {
        return listUser;
    }

    public void setListUser(User[] listUser) {
        this.listUser = listUser;
    }

    public void userLogin(String username, String password){
        System.out.println();
        boolean isValid = false;
        for (User user : getListUser()) {
            if((user.getUsername().equals(username)) && user.getPassword().equals(password)){
                System.out.println("Halo " + user.getName() + " !");
                isValid = true;
                break;
            }
        }
        if(!isValid){
            System.out.println("Username atau password SALAH!");
        }
    }
    public void userEdit(String oldUsername, String oldPassword, String newUsername, String newPassword){
        boolean isValid = false;
        for (User user : getListUser()) {
            if((user.getUsername().equals(oldUsername)) && user.getPassword().equals(oldPassword)){
                System.out.println("Halo " + user.getName() + " !");
                isValid = true;
                user.setUsername(newUsername);
                user.setPassword(newPassword);
                break;
            }
        }
        if(!isValid){
            System.out.println("Username atau password SALAH!");
        }
    }
}
