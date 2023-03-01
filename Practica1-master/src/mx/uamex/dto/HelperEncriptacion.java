
package mx.uamex.dto;

/**
 *
 * @author jorge
 */
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HelperEncriptacion {
    public static String getMD5(String texto) {
String hashtext="";
try {
MessageDigest md = MessageDigest.getInstance("MD5");
byte[] messageDigest = md.digest(texto.getBytes());
BigInteger no = new BigInteger(1, messageDigest);
hashtext = no.toString(16);
while (hashtext.length() < 32) {
hashtext = "0" + hashtext;
}
} catch (NoSuchAlgorithmException e) {

}
return hashtext;
}
    
}
