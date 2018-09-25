import java.util.Scanner;

public class main2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        main employee = new main();
        String empInfo;
        int empShift;



        Scanner in = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        empInfo = in.nextLine();
        employee.EmployeeName = empInfo;


        System.out.println("Enter Employee Number: ");
        empInfo = in.nextLine();
        employee.EmployeeNumber = empInfo;


        System.out.println("Enter Employee Shift: ");
        empShift = in.nextInt();
        employee.EmployeeShift = empShift;
        

        employee.printAll();
    }

}
