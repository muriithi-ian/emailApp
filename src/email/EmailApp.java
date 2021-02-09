package email;

public class EmailApp {
    public static void main(String[] args) {
    Email em1 = new Email("Ian", "Muriithi");
        em1.setAlternateEmail("imuriithiian@gmail.com");
        System.out.println(em1.showInfo());;
    }
}
