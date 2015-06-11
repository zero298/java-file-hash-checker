package com.hexvox.hashcheck;

import java.io.File;
import java.net.URL;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 * Class to use to test the validity of the HashUtil class
 *
 * @author sakillin
 */
public class HashUtilTest {
    
    private static URL testFileUrl;
    private static File testFile;
    
    /**
     * Get a reference to our test file and make sure it's there
     */
    @BeforeClass
    public static void setUpClass(){
        testFileUrl = HashUtilTest.class.getClass().getResource("/test.txt");
        assertNotNull("Test file missing", testFileUrl);
        testFile = new File(testFileUrl.getPath());
    }
    
    /**
     * Test of getHash method, of class HashUtil using MD5.
     */
    @Test
    public void testGetHashMD5() {
        System.out.println("getHash - MD5");
        
        AlgorithmToUse algorithmToUse = AlgorithmToUse.MD5;
        String expResult = "ed076287532e86365e841e92bfc50d8c";
        String result = HashUtil.getHash(testFile, algorithmToUse);
        assertEquals(expResult, result);
    }

    /**
     * Test of getHash method, of class HashUtil using SHA1.
     */
    @Test
    public void testGetHashSHA1() {
        System.out.println("getHash - SHA1");
        
        AlgorithmToUse algorithmToUse = AlgorithmToUse.SHA1;
        String expResult = "2ef7bde608ce5404e97d5f042f95f89f1c232871";
        String result = HashUtil.getHash(testFile, algorithmToUse);
        assertEquals(expResult, result);
    }

    /**
     * Test of generateHash method, of class HashUtil using MD5.
     */
    @Test
    public void testGenerateHashMD5() {
        System.out.println("generateHash - MD5");
        
        String hashAlgorithm = "MD5";
        String expResult = "ed076287532e86365e841e92bfc50d8c";
        String result = HashUtil.generateHash(testFile, hashAlgorithm);
        assertEquals(expResult, result);
    }

    /**
     * Test of generateHash method, of class HashUtil using SHA1.
     */
    @Test
    public void testGenerateHashSHA1() {
        System.out.println("generateHash - SHA1");
        
        String hashAlgorithm = "SHA";
        String expResult = "2ef7bde608ce5404e97d5f042f95f89f1c232871";
        String result = HashUtil.generateHash(testFile, hashAlgorithm);
        assertEquals(expResult, result);
    }
}
