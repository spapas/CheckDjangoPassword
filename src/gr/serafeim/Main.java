package gr.serafeim;


import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class Main {

    public static void main(String[] args) throws InvalidKeySpecException, NoSuchAlgorithmException {
        String encoded = "pbkdf2_sha256$24000$Y9OjerJldaQE$yXv6chPxTX2+b0fF9by6Dn3JtrfKhCCQhT/HigBERwA=";
        String password = "123";
        DjangoPasswordHasher h = new DjangoPasswordHasher();
        if(h.checkDjangoPassword(encoded, password)) {
            System.out.println("Passwords match!");
        } else {
            System.out.println("Passwords don't match!");
        }

    }



}
