package hashcheck;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author sakillin
 */
public class HashUtil {

   /**
    * Get a hash of the file given
    *
    * @param f The file to hash
    * @param algorithmToUse Which algorithm to hash with
    * @return The hash of the the file
    */
   public static String getHash(File f, AlgorithmToUse algorithmToUse) {
      // Figure out which algorithm to use
      switch (algorithmToUse) {
         case MD5:
            return generateHash(f, "MD5");
         case SHA1:
            return generateHash(f, "SHA");
         default:
            return "No such algorithm";
      }
   }

   /**
    * Generate an MD5 hash of the supplied file
    *
    * @param f The File to hash
    * @param hashAlgorithm The algorithm to use in the hash
    * @return The hash of the file
    */
   public static String generateHash(File f, String hashAlgorithm) {

      MessageDigest md;
      FileInputStream fis;
      int nread;
      BigInteger bi;
      byte[] mdBytes;
      byte[] dataBytes;

      try {
         // Create a temporary array of bytes to read into
         dataBytes = new byte[1024];
         // Create a message digester of hash type
         md = MessageDigest.getInstance(hashAlgorithm);
         // Create a input stream for our file
         fis = new FileInputStream(f);

         // Read all the file's bytes into the hasher
         while ((nread = fis.read(dataBytes)) > 0) {
            md.update(dataBytes, 0, nread);
         }

         // Digest the bytes
         mdBytes = md.digest();

         // Make an int out of the byte array
         bi = new BigInteger(1, mdBytes);

         // Return our converted string
         return bi.toString(16);

      } catch (NoSuchAlgorithmException e) {
         System.out.println("Algorithm is not supported!");
      } catch (IOException e) {
         System.out.println("Error generating hash");
      }

      return "";
   }
}
