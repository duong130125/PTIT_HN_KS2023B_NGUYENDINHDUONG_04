package ra.presentation;

import ra.bussiness.CustomerBusiness;

import java.util.Scanner;

public class CustomerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayMenu(scanner);
    }

    public static void displayMenu(Scanner scanner) {
        do {
            System.out.println("***************Customer Menu*************");
            System.out.println("1. Hiển thị danh sách các khách hàng");
            System.out.println("2. Thêm mới khách hàng");
            System.out.println("3. Chỉnh sửa thông tin khách hàng");
            System.out.println("4. Xóa khách hàng");
            System.out.println("5. Tìm kiếm khách hàng");
            System.out.println("6. Sắp xếp");
            System.out.println("0. Thoát chương trình");
            System.out.println("Lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    CustomerBusiness.ShowCustomerList();
                    break;
                case 2:
                    CustomerBusiness.AddCustomer(scanner);
                    break;
                case 3:
//                    CustomerBusiness.UpdateCustomer();
                    break;
                case 4:
                    CustomerBusiness.DeleteCustomer();
                    break;
                case 5:
//                    CustomerBusiness.SearchCustomer();
                    break;
                case 6:
                    CustomerBusiness.ArrangeCustomer(scanner);
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình.");
                    System.exit(0);
                    scanner.close();
                default:
                    System.out.println("Lựa chọn không hợp lệ, Vui lòng chọn 0 -> 6.");
            }
        }while (true);
    }
}
