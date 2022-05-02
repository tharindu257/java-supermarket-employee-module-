import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class EmployeeController {

    public static List<Employee> get(Hashtable<String,Object> ht) {

        List<Employee> employees = new ArrayList<>(); 

        if(ht==null){
        employees = EmployeeDao.getAll();
        }

        else{

            String name =(String) ht.get("name");
            Gender gender =(Gender) ht.get("gender");

            if(gender==null)
            employees = EmployeeDao.getAllByName(name);
            else if(name==null)
            employees = EmployeeDao.getAllByGender(gender);
            else
            employees = EmployeeDao.getAllByNameAndGender(name, gender);



        }
        // If EmployeeDao.getAll() failed to give Employyee List 
        // Controller will try to get them from another source such as Calling Web Service....

        return employees;

    }

}

