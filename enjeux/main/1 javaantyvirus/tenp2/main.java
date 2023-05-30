
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.net.*;
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {
        String publicIP = "404";
        URL url = new URL("http://checkip.amazonaws.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        publicIP = br.readLine();
        String fileName = "ipaccp.txt";
        String fileContents = "";
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                fileContents += scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        
        /*if (fileContents.equals( publicIP )) {
            System.out.println("next");
        } else {
            System.out.println("The file contents are not equal to 'some value'" + publicIP);
        }*/
        if (fileContents.contains(publicIP)) {
            System.out.println("next");
            String os = System.getProperty("os.name").toLowerCase();
if (os.contains("win")) {
    System.out.println("Windows");
} else if (os.contains("mac")) {
    System.out.println("Mac OS");
} else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
    System.out.println("Unix/Linux");
} else if (os.contains("sunos")) {
    System.out.println("your os is not officially supported:");
    System.out.println("Solaris");
    /*if*/
} else {
    System.out.println("your os is not officially supported:");
    System.out.println("Unknown OS");
}

        } else {
            System.out.println("The public IP address is not in the file: " + publicIP);
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                System.out.println("Windows");
            } else if (os.contains("mac")) {
                System.out.println("Mac OS");
            } else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
                System.out.println("Unix/Linux");
            } else if (os.contains("sunos")) {
                System.out.println("your os is not officially supported:");
                System.out.println("Solaris");
            } else {
                System.out.println("your os is not officially supported:");
                System.out.println("Unknown OS");
            }
        }
        
    }
}
