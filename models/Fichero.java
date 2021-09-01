
package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Fichero {
    private String URL;

    public Fichero() {
    }

    public Fichero(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
    
    public String read() {
        FileReader fr;
        BufferedReader br;
        String result = "";

        try {
            fr = new FileReader (getURL());
            br = new BufferedReader(fr);

            String line;
            while((line=br.readLine())!=null)
                result += line + "\n";
            br.close();
            fr.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "El archivo no existe");
        }
        return result;
    }
    
    public void write(String content) {
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter pw;
        
        try
        {
            fw = new FileWriter(getURL(), true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            pw.append("\n" + content);
            pw.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("un error al escribir en el fichero");
        }
    }
}
