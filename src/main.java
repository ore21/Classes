

public class main {
    //public class void main(String[] args) {
    String EmployeeName;
    String EmployeeNumber;
    int EmployeeShift; // shift is an int of 1,2 or 3


    public main() {

    }
    public main(String EmployeeName, String EmployeeNumber,int EmployeeShift){
        this.EmployeeName = EmployeeName;
        this.EmployeeNumber = EmployeeNumber;
        this.EmployeeShift = EmployeeShift;
}
        public String getEmployeeName () {
            return EmployeeName;
        }
        public void setEmployeeName (String employeeName){
            this.EmployeeName = employeeName;
        }
        public String getEmployeeNumber () {
            return EmployeeNumber;
        }
        public void setEmployeeNumber (String employeeNumber){
            this.EmployeeNumber = employeeNumber;
        }
        public int getEmployeeShift () {
            return EmployeeShift;
        }
        public void setEmployeeShift (int employeeShift){
            this.EmployeeShift = employeeShift;
        }
        public void printAll(){
            System.out.println("Employee Name: " + EmployeeName + "\n" + "Employee Number: " + EmployeeNumber + "\n" +
                    "Employee Shift: " + EmployeeShift);
        }
    }
