import java.util.List;

public class UT{
public static void main(String[]args){

    List <Employee> emplist =EmployeeDao.getAll();

    for(Employee emp : emplist){


        System.out.println(emp.getName());
    }


}
}