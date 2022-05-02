
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import java.util.Vector;
import java.util.List;

public class EmployeeUi extends JFrame {

    JTable tblEmployee;
    JComboBox<Object> cmbSearchGender;
    JTextField txtSearchName;

    EmployeeUi() {

        setTitle("Harvest Super");
        setLocation(200, 300);
        setSize(550, 400);

        Container con = getContentPane();
        FlowLayout lay = new FlowLayout();
        con.setLayout(lay);

        JLabel search1 = new JLabel("=======================================================================");
        JLabel search2 = new JLabel("                                 Search                                ");
        JLabel search3 = new JLabel("=======================================================================");
        con.add(search1);
        con.add(search2);
        con.add(search3);

        JLabel lblSearchName = new JLabel("Name : ");
        txtSearchName = new JTextField(10);
        JLabel lblSearchGender = new JLabel("Gender : ");
        cmbSearchGender = new JComboBox();
        JButton btnSearchClear = new JButton(" Clear Search ");
        JButton btnSearch = new JButton(" Search ");

        con.add(lblSearchName);
        con.add(txtSearchName);
        con.add(lblSearchGender);
        con.add(cmbSearchGender);
        con.add(btnSearchClear);
        con.add(btnSearch);

        JLabel view1 = new JLabel("=======================================================================");
        JLabel view2 = new JLabel("                                  View                                 ");
        JLabel view3 = new JLabel("=======================================================================");
        con.add(view1);
        con.add(view2);
        con.add(view3);

        Vector titles = new Vector();
        titles.add("Name");
        titles.add("DOB");
        titles.add("NIC");
        titles.add("Gender");
        titles.add("Designation");

        Vector data = new Vector();

        DefaultTableModel dataModel = new DefaultTableModel(data, titles);
        tblEmployee = new JTable();
        tblEmployee.setModel(dataModel);

        JScrollPane jspTable = new JScrollPane();
        jspTable.setPreferredSize(new Dimension(500, 200));
        jspTable.setViewportView(tblEmployee);

        con.add(jspTable);

        intitialize();
    }

    public void intitialize() {
        loadView();
    }

    public void loadView() {

        List<Employee> emplist = EmployeeController.get();
        fillTable(emplist);

        List<Gender> genlist = GenderController.get();         
        Vector<Object> genders = new Vector(); 
        genders.add("Select"); 
            
        for(Gender gen : genlist){
                genders.add(gen); 
        }

        DefaultComboBoxModel<Object> gndModel = new DefaultComboBoxModel(genders); 
        cmbSearchGender.setModel(gndModel); 

    }

    public void fillTable(List<Employee> employees) {

        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();

        for (Employee emp : employees) {

            Vector r = new Vector();
            r.add(emp.getName());
            r.add(emp.getDob().toString());
            r.add(emp.getNic());
            r.add(emp.getGender().getName());
            r.add(emp.getDesignation().getName());

            model.addRow(r);
        }

    }

}
