package email;

import java.util.Scanner;

public class Email {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int defaultPasswordLength = 10;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity = 100;
    private String companySuffix = "company.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // set department
        this.department = setDepartment();

        // set password
        this.password = generateRandomPassword();

        // generate email
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
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

    private String generateRandomPassword() {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
        char[] password = new char[defaultPasswordLength];
        for (int i = 0; i < defaultPasswordLength; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
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
        return department;
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

    public String getCompanySuffix() {
        return companySuffix;
    }

    public void setCompanySuffix(String companySuffix) {
        this.companySuffix = companySuffix;
    }

    public String getEmail() {
        return email;
    }

    public String showInfo(){
        return "Name: "+ getFirstName()+" "+getLastName()+"\nDepartment: "+ getDepartment()+"\nEmail: "+getEmail()+"\nAlternate Email: "+ getAlternateEmail()+"\nMailbox capacity: "+ getMailboxCapacity();
    }
}
