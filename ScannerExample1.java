import java.util.Scanner;

public class ScannerExample1{
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        
        System.out.println("Employee Detalis");
        
        System.out.println("Enter the Employee Name:");
        String EmployeeName=s.nextLine();
        
        System.out.println("Enter your Employee Age:");
        byte employeeage=s.nextByte();
        
        System.out.println("Enter your Employee Salary:");
        float EmployeeSalary=s.nextFloat();


        System.out.println("Employee Name:"+EmployeeName);
        System.out.println("Employee Age:"+employeeage);
        System.out.println("Employee Salary:"+EmployeeSalary);
        
        s.close();
    }       

}