package ra.validate;

public class ValidatorException {
    public static int validateInt(int i) throws Exception{
        do {
            try  {
                System.out.println("Dữ liệu nhập vào hợp lệ" + i);
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu nhập vào không phải số nguyên");
            } catch (Exception e) {
                System.out.println("Lỗi dữ liệu đầu vào không hợp lệ");
            }
        } while (true);
    }

    public static void validateString() throws Exception {
        do {
            try {
                System.out.println("Dữ liệu nhập vào hợp lệ");
            } catch (Exception e) {
                System.out.println("Dữ liệu nhập vào không hợp lệ");
            }
        } while (true);
    }

    public static void validateBoolean() throws Exception {
        do {
            try {
                System.out.println("Dữ liệu nhập vào hợp lệ");
            } catch (Exception e) {
                System.out.println("Dữ liệu nhập vào không hợp lệ");
            }
        } while (true);
    }
}
