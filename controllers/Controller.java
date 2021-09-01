
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Fichero;
import models.User;
import views.Form;

public class Controller implements ActionListener {
    private Form view;

    public Controller(Form view) {
        this.view = view;
        this.view.setVisible(true);
        
        this.view.btnRegister.addActionListener(this);
        this.view.btnMostrar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.view.btnRegister)) {
            if(this.view.txtName.getText().length() > 0 && this.view.txtLastname.getText().length() > 0 && this.view.txtSalary.getText().length() > 0 && this.view.txtPosition.getText().length() > 0) {
                String regex = "^[0-9]+";
                if (this.view.txtSalary.getText().matches(regex)) {
                    addEmployee();
                } else {
                    JOptionPane.showMessageDialog(null, "Coloca un valor numérico entero en el salario");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Completa todos los campos");
            }
            
        }
        if(e.getSource().equals(this.view.btnMostrar)) {
            showEmployees();
        }
    }

    private void addEmployee() {
        Fichero file = new Fichero("Employees.txt");
        User user = new User();
        user.setName(this.view.txtName.getText());
        user.setLastname(this.view.txtLastname.getText());
        user.setSalario(Double.parseDouble(this.view.txtSalary.getText()));
        user.setPosition(this.view.txtPosition.getText());
        file.write(user.getInfo());
        showEmployees();
    }

    private void showEmployees() {
        Fichero file = new Fichero("Employees.txt");
        String result = file.read();
        this.view.txtEmployeesList.setText(result);
    }
}
