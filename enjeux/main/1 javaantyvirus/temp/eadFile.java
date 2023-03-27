import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.plaf.PanelUI;
import javax.xml.crypto.Data;

public class eadFile {  
    public String xep() {  
      String tey; 
      tey = "";
      try {
        File myObj = new File("ipaccp.txt");
        Scanner myReader = new Scanner(myObj);  
        while (myReader.hasNextLine()) {
          tey = myReader.nextLine();
        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      } 
      return tey;
    }
    
  } 
  /*        File fipsexp = new File("ipaccp.txt");
        Scanner rfipse = new Scanner(fipsexp);
        while (rfipse.hasNextLine()); */