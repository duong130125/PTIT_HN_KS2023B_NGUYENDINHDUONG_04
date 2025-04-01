package ra.entity;

import java.util.Scanner;

public class Customer implements IApp {
    private String customerId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Boolean gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String customerType;

    public Customer() {
    }

    public Customer(String customerId, String firstName, String lastName, String dateOfBirth, Boolean gender, String address, String phoneNumber, String email, String customerType) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập tên khách hàng: ");
        this.firstName = scanner.nextLine();
        System.out.println("Nhập họ khách hàng: ");
        this.lastName = scanner.nextLine();
        System.out.println("Nhập ngày sinh khách hàng: ");
        this.dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính (true - Nam, false - Nữ): ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập địa chỉ: ");
        this.address = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
        System.out.println("Nhập email khách hàng: ");
        this.email = scanner.nextLine();
        System.out.println("Nhập loại khách hàng: ");
        this.customerType = scanner.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("Mã Khách hàng:" + this.customerId);
        System.out.println("Tên khách hàng:" + this.firstName);
        System.out.println("Họ khách hàng:" + this.lastName);
        System.out.println("Ngày sinh khách hàng:" + this.dateOfBirth);
        System.out.println("Giới tính:" + this.gender);
        System.out.println("Địa chỉ:" + this.address);
        System.out.println("Số điện thoại:" + this.phoneNumber);
        System.out.println("Email Khách hàng:" + this.email);
        System.out.println("Loại Khách hàng:" + this.customerType);
    }
}
