package EmployeeDetails;
class department{
    String dept_name;
    void dept(int dept_id){
        if(dept_id==1){
            System.out.println("Civil department");
        }
        else if(dept_id==2){
            System.out.println("Mechanical department");
        }
        else{
            System.out.println("BCA department");
        }
    }
}

