import java.time.LocalDate;
import java.util.List; 

public class s1v1ut {

    public static void main(String[] args) {

        Gender g1 = GenderDao.getById(1);
        Gender g2 = GenderDao.getById(2);

        System.out.println(g1.getName());
        System.out.println(g2.getName());

         /*

        Designation d1 = DesignationDao.getById(1);
        Designation d2 = DesignationDao.getById(2);

        System.out.println(d1.getName());
        System.out.println(d2.getName());

        Statusemployee s1 = StatusemployeeDao.getById(1);
        Statusemployee s2 = StatusemployeeDao.getById(2);

        System.out.println(s1.getName());
        System.out.println(s2.getName());

        List<Employee> emplist = EmployeeDao.getAll(); 

        LocalDate today = LocalDate.now();
        int cy = today.getYear();  

        for(Employee emp : emplist){
            int by = emp.getDob().getYear(); 
            System.out.println( emp.getName()+"("+(cy-by)+")"+ "\t" + emp.getNic() + "\t" + emp.getDesignation().getId() +"("+ emp.getDesignation().getName() +")" );
        }

        List<Employee> emplist2 = EmployeeController.get(); 

        for(Employee emp : emplist2){            
            System.out.println( emp.getName()+"\t" + emp.getNic() + "\t" + emp.getDesignation().getId() +"("+ emp.getDesignation().getName() +")" );
        }

        */ 

    }

}