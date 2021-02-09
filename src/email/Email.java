package email;

import java.util.Scanner;

public class Email {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.defaultPasswordLength = 10;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public String setPassword() {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
        char[] password = new char[defaultPasswordLength];
        for (int i= 0; i<defaultPasswordLength; i++){
            int rand =(int) (Math.random()*passwordSet.length());
            password [i] = passwordSet.charAt(rand);
        }
        return this.password = new String(password);


    }

    public String getDepartment() {
        return department;
    }

    public String setDepartment() {
        System.out.println("Department codes:\n1.Sales\n2.Development\n3.Accounting\n0.None\nSelect a department:");
        int option = scanner.nextInt();
        String department = "";
        switch (option) {
            case 1:
                department = "sales";
                break;
            case 2:
                department = "development";
                break;
            case 3:
                department = "acounting";
                break;
            default:
                department = "none";
                break;
        }
        return this.department = department;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }
}
