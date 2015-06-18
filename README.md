# java-file-hash-checker

[![Build Status](https://travis-ci.org/zero298/java-file-hash-checker.svg?branch=master)](https://travis-ci.org/zero298/java-file-hash-checker)

## What is java-file-hash-checker?

As the name implies, it is a Java based utility to perform hash sum checks on 
files.  The tool can run both on the command line and as a GUI application 
with drag and drop support.  Presently the tool supports MD5 and SHA hashsums.

## How do I compile java-file-hash-checker?

As of SHA: f3d15103e177b27d3e5d0533de6ca77e966fb4ba jfhc has been converted to a 
Maven project so you will need to have Maven  installed.  Navigate to the root
directory after cloning the repo.  Then run `mvn compile` which will compile 
the project.

## How do I run java-file-hash-checker?

After compiling, you should have a `java-file-hash-checker.jar` file in 
the target directory.  Move that jar to wherever you want your binary to
live and then execute it as normal with `java -jar java-file-hash-checker.jar`.
You can see a list of command switches below or by running the command:
`java -jar java-file-hash-checker.jar -h`.

Running the tool without any switches will open the tool as a Java Swing GUI 
tool that will allow you to drag and drop files on to buttons denoting their
respective algorithm.

When running the tool to compare  two files (providing both --file and
--expected) the utility will exit with  code 1 if there is a match and 0 for
anything else.

|Short Switch | Long Switch | Arguments | Description
|----|-------------|---------------|-----------------
| -a | --algorithm | md5/sha       | Which hash algorithm to use.
| -e | --expected  | expected hash | What the expected hash is.
| -f | --file      | filename      | The Location of file to hash.
| -h | --help      |               | Print this help dialog.
| -m | --md5       |               | Use MD5 hashing. (Default)
| -q | --quiet     |               | Print only the file hash
| -s | --sha       |               | Use SHA1 hashing.

So if you wanted the utility to generate *just* the md5 sum of a file, you can 
run the command:

`java -jar java-file-hash-checker.jar -a md5 -f somefile.txt -q`

If you just wanted to know whether or not a file matches a given sum:

`java -jar java-file-hash-checker.jar -a md5 -f somefile.txt -e hashstring`