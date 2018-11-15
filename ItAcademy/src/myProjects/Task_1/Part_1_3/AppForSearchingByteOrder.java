package myProjects.Task_1.Part_1_3;

//import java.util.Scanner;

public class AppForSearchingByteOrder {

    public static void main(String[] args) {

        // System.out.println("Enter path for file:");
        // Scanner scan = new Scanner(System.in);
        // String fileName = scan.nextLine();
        ReaderOfFile operation = new ReaderOfFile("fileName");
        SearchingByteOrder byteOrder = new SearchingByteOrder(operation);
        new Thread(byteOrder).start();
    }
}
