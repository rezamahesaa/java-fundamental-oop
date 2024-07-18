public class User extends Employee{
    private String username;
    private String password;
    
    public User(int id, String name, int age, String email, String job, String username, String password) {
        super(id, name, age, email, job);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", getId()=" + getId() + ", getName()="
                + getName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + ", getJob()=" + getJob() + "]";
    }

    

}
