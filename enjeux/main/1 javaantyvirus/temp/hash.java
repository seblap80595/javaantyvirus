
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class hash {
 
    public String createMD5Hash(final String input) throws NoSuchAlgorithmException {
        String hashtext = null;
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] messageDigest = md.digest(input.getBytes());
        System.out.println(hashtext);
        return hashtext;
        
    }
    public String td(String[] args){
        LocalDateTime tiex = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm");
        String tie = tiex.format(dateTimeFormatter);
        return tie;
    }
    public void create(String[] args){
        hash htd = new hash();
        String qtd = htd.td(args) ;
        String time = qtd.tie;
        String hash = createMD5Hash(time);
        System.out.print(hash + ""+hash.length());
    }
}
