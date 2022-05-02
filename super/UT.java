import java.util.List;

public class UT{
public static void main(String[]args){

    /*List <Employee> emplist =EmployeeDao.getAllByName("s");

    for(Employee emp : emplist){


        System.out.println(emp.getName());
    }


    List <Employee> emplist2 =EmployeeDao.getAll();

    for(Employee emp : emplist2){


        System.out.println(emp.getName());
    }
    */
    Gender g1 = GenderDao.getById(1);
    Gender g2 = GenderDao.getById(2);

    List <Employee> emplistg1 = EmployeeDao.getAllByGender( g1 );

    System.out.println(emplistg1.size() );

    for(Employee emp : emplistg1){
    System.out.println(emp.getName() );
    }


    List <Employee> emplistg2 = EmployeeDao.getAllByGender( g2 );

    System.out.println(emplistg2.size() );

    for(Employee emp : emplistg2){
    System.out.println(emp.getName() );
    }

}
}