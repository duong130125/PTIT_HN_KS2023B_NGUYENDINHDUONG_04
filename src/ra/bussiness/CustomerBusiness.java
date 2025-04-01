package ra.bussiness;

import ra.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerBusiness {
    static List<Customer> customerList = new ArrayList<Customer>();

    public static void ShowCustomerList() {
        System.out.println("*********Danh sách khách hàng*******");
        for (Customer customer : customerList) {
            customer.displayData();
        }
    }

    public static void AddCustomer(Scanner scanner) {
        Customer customer = new Customer();
        customer.inputData(scanner);
        customerList.add(customer);
        System.out.println("Thêm khách hàng thành công!");
    }

    public static void UpdateCustomer(String id, Scanner scanner) {
    }

    public static void DeleteCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ID khách hàng cần xóa: ");
        String id = scanner.nextLine();
        Customer customer = null;

        for (Customer c : customerList) {
            if (c.getCustomerId() == id) {
                customer = c;
                break;
            }
        }

        if (customer != null) {
            customerList.remove(customer);
            System.out.println("Xóa khách hàng thành công!");
        } else {
            System.out.println("Khách shàng không tồn tại!");
        }
    }
    public static void SearchCustomer(String id, Scanner scanner) {
    }
    public static void ArrangeCustomer(Scanner scanner) {
    }
}
