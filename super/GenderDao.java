import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;
import java.util.ArrayList; 

public class GenderDao {

    public static List<Gender> getAll() {

        List<Gender> genders = new ArrayList();

        try {
            String qry = "select * from gender";
            ResultSet rslt = CommonDao.get(qry);

            while(rslt.next()){ 
                Gender gender = new Gender(); 
                gender.setId(rslt.getInt("id"));
                gender.setName(rslt.getObject("name").toString());
                
                genders.add(gender);                 
            }

        } catch (SQLException e) {
            System.out.println("Can't Get Results as : " + e.getMessage());
        }

        return genders;
    }

    public static Gender getById(int id) {

        Gender gender = new Gender();

        try {
            String qry = "select * from gender where id=" + id;
            ResultSet rslt = CommonDao.get(qry);
            rslt.next();
            gender.setId(rslt.getInt("id"));
            gender.setName(rslt.getObject("name").toString());

        } catch (SQLException e) {
            System.out.println("Can't Get Results as : " + e.getMessage());
        }

        return gender;

    }



}
