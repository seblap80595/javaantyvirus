
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.time.LocalDateTime;
import javax.swing.plaf.PanelUI;

public class Main {
    public static void main(String[] args) throws IOException {
        eadFile inf = new eadFile();
        String ipsexp = inf.xep();
        System.out.println(ipsexp);
        if (ipsexp =="204.81.212.72") {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time); 
    } 
}
/*        File fipsexp = new File("ipaccp.txt");
        Scanner rfipse = new Scanner(fipsexp);
        while (rfipse.hasNextLine()); */