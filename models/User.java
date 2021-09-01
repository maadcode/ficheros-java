
package models;

public class User {
    private String name;
    private String lastname;
    private double salario;
    private String position;

    public User() {
    }

    public User(String name, String lastname, double salario, String position) {
        this.name = name;
        this.lastname = lastname;
        this.salario = salario;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getInfo() {
        return getName() + "-" + getLastname()+ "-" + getPosition() + "-" + getSalario();
    }
    
}
