package employeeCIE;

import java.util.Scanner;
class employee extends department{
    String emp_name;
    String date_of_join;
    int dept_id;
    void getdetails(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of Employee: ");
        emp_name=s.nextLine();
        System.out.println("Enter date of join: ");
        date_of_join=s.nextLine();
        System.out.println("Enter the department id: ");
        dept_id=s.nextInt();
    }
    void display(){
        department d=new department();
            System.out.println("Employee name is "+emp_name);
            System.out.println("Date of join is "+date_of_join);
            d.dept(dept_id);
    }
    public static void main(String args[]){
        employee e=new employee();
        e.getdetails();
        e.display();
    }
}
