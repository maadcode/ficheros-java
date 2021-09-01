
package main;

import controllers.Controller;
import views.Form;

public class Main {

    public static void main(String[] args) {
        Form view = new Form();
        Controller controller = new Controller(view);
    }
    
}
