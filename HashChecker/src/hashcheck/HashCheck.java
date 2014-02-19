package hashcheck;

import hashcheck.forms.HashFrame;
import java.io.File;

/**
 *
 * @author sakillin
 */
public class HashCheck {

   public static void main(String[] args) {

      if (args.length > 0) {
         String command, argument, expectedHash, fileToHash;
         command = "";
         argument = "";
         expectedHash = "";
         fileToHash = "";
         for (int i = 0; i < args.length; i++) {

            // Parse our arguments
            switch (args[i].charAt(0)) {
               case ('-'):
                  if (args[i].charAt(1) == '-') {
                     command = args[i].substring(2);
                     if (args.length >= i + 1) {
                        argument = args[i + 1];
                     }
                  } else {
                     command = Character.toString(args[i].charAt(1));
                     if (args.length > i + 1) {
                        argument = args[i + 1];
                     }
                  }
                  break;
               default:
                  File f = new File(args[i]);
                  System.out.println("[MD5]  Hash of [" + f.getName() + "]: " + HashUtil.getHash(f, AlgorithmToUse.MD5));
                  System.out.println("[SHA1] Hash of [" + f.getName() + "]: " + HashUtil.getHash(f, AlgorithmToUse.SHA1));
            }

            // Utilize our arguments
            if ((!command.isEmpty()) && (!argument.isEmpty())) {
               if (command.equals("e")) {
                  expectedHash = argument;
               }
               if (command.equals("f")) {
                  fileToHash = argument;
               }
            }
         }
         if ((!expectedHash.isEmpty()) && (!fileToHash.isEmpty())) {
            String fileHash = HashUtil.getHash(new File(fileToHash), AlgorithmToUse.SHA1);
            boolean test = (fileHash.equals(expectedHash));
            System.out.println("Expected: " + expectedHash);
            System.out.println("Derived:  " + fileHash);
            System.out.println("Does hash equal? " + test);
         }
      } else {
         HashFrame frame = new HashFrame();
         frame.setVisible(true);
      }
   }
}
