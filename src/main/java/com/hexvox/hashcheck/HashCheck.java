package com.hexvox.hashcheck;

import com.hexvox.hashcheck.forms.HashFrame;
import java.io.File;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author sakillin
 */
public class HashCheck {

   private static Options makeOptions() {

      // Declare our option set
      Options options;

      // Create our option group
      OptionGroup hashAlgorithm;

      // Instanciate our option set
      options = new Options();

      // Instanciate our options
      Option optFile = new Option("f", "file", true, "The Location of file to hash.");
      Option optExpected = new Option("e", "expected", true, "What the expected hash is.");
      Option optAlgorithm = new Option("a", "algorithm", true, "Which hash algorithm to use.");
      Option optMd5 = new Option("m", "md5", false, "Use MD5 hashing. (Default)");
      Option optSha = new Option("s", "sha", false, "Use SHA1 hashing.");
      Option optQuiet = new Option("q", "quiet", false, "Print only the file hash");
      Option optHelp = new Option("h", "help", false, "Print this help dialog.");

      // Make file option required
      optFile.setRequired(true);

      // Instanciate our option group
      hashAlgorithm = new OptionGroup();

      // Add options to our option group
      hashAlgorithm.addOption(optAlgorithm);
      hashAlgorithm.addOption(optMd5);
      hashAlgorithm.addOption(optSha);

      // Add our option group
      options.addOptionGroup(hashAlgorithm);

      // Add our options
      options.addOption(optFile);
      options.addOption(optExpected);
      options.addOption(optAlgorithm);
      options.addOption(optMd5);
      options.addOption(optSha);
      options.addOption(optQuiet);
      options.addOption(optHelp);

      return options;
   }

   private static void printHelp(HelpFormatter h, Options o) {
      String usage, header, footer;

      usage = "hashchecker";
      header = "Get the hash of a specified file or compare the hash of "
              + "a file against a specified hash."
              + "\n...\n"
              + "Returns 1 if match is made, 0 otherwise.";
      footer = "Made by: Steve K - zero298";

      h.printHelp(usage, header, o, footer, true);
   }

   public static void main(String[] args) {

      if (args.length > 0) {

         CommandLineParser parser = new BasicParser();
         HelpFormatter formatter = new HelpFormatter();
         AlgorithmToUse algorithmToUse = AlgorithmToUse.MD5;
         Options options = makeOptions();
         String fileHash = "";
         String expectedHash = "";
         String fileToHashName = "";
         boolean isMatch = false;

         try {
            // Parse the command line
            CommandLine cmd = parser.parse(options, args, true);

            // Print help message if asked for
            if (cmd.hasOption("h")) {
               printHelp(formatter, options);
            }

            // See if they specified an algorithm
            if (cmd.hasOption("a")) {
               switch (cmd.getOptionValue("a")) {
                  case "md5":
                     algorithmToUse = AlgorithmToUse.MD5;
                     break;
                  case "sha":
                     algorithmToUse = AlgorithmToUse.SHA1;
                     break;
                  default:
                     System.out.println("Unknown algorithm, using default.");
               }
            }
            // See if they wanted MD5
            if (cmd.hasOption("m")) {
               algorithmToUse = AlgorithmToUse.MD5;
            }
            // See if they wanted SHA
            if (cmd.hasOption("s")) {
               algorithmToUse = AlgorithmToUse.SHA1;
            }

            if (cmd.hasOption("f")) {
               File fileToHash = new File(cmd.getOptionValue("f"));
               fileHash = HashUtil.getHash(fileToHash, algorithmToUse);
               fileToHashName = fileToHash.getName();
            }
            if (cmd.hasOption("e")) {
               expectedHash = cmd.getOptionValue("e");
            }

            if (!cmd.hasOption("q")) {
               if (!fileHash.equals("")) {
                  System.out.println("Hashed file: " + fileToHashName);
                  System.out.println("Hash Value: " + fileHash);
               }
               if (!expectedHash.equals("")) {
                  isMatch = (fileHash.equals(expectedHash));
                  System.out.println("Expected Value: " + expectedHash);
                  System.out.println("Match: " + isMatch);
               }
            } else {
               System.out.println(fileHash);
            }

            if (isMatch) {
               System.exit(1);
            } else {
               System.exit(0);
            }
         } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
            printHelp(formatter, options);
         }
      } // If no aguments, start the gui
      else {
         HashFrame frame = new HashFrame();
         frame.setVisible(true);
      }
   }
}
