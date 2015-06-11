package hashcheck;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class to use to test the validity of the HashUtil class
 *
 * @author sakillin
 */
public class HashUtilTest {

    /**
     * Test of getHash method, of class HashUtil using MD5.
     */
    @Test
    public void testGetHashMD5() {
        System.out.println("getHash - MD5");
        String fu = HashUtilTest.class.getClassLoader().getResource("hashcheck/test.txt").getPath();
        File f = new File(fu);
        AlgorithmToUse algorithmToUse = AlgorithmToUse.MD5;
        String expResult = "ed076287532e86365e841e92bfc50d8c";
        String result = HashUtil.getHash(f, algorithmToUse);
        assertEquals(expResult, result);
    }

    /**
     * Test of getHash method, of class HashUtil using SHA1.
     */
    @Test
    public void testGetHashSHA1() {
        System.out.println("getHash - SHA1");
        String fu = HashUtilTest.class.getClassLoader().getResource("hashcheck/test.txt").getPath();
        File f = new File(fu);
        AlgorithmToUse algorithmToUse = AlgorithmToUse.SHA1;
        String expResult = "2ef7bde608ce5404e97d5f042f95f89f1c232871";
        String result = HashUtil.getHash(f, algorithmToUse);
        assertEquals(expResult, result);
    }

    /**
     * Test of generateHash method, of class HashUtil using MD5.
     */
    @Test
    public void testGenerateHashMD5() {
        System.out.println("generateHash - MD5");
        String fu = HashUtilTest.class.getClassLoader().getResource("hashcheck/test.txt").getPath();
        File f = new File(fu);
        String hashAlgorithm = "MD5";
        String expResult = "ed076287532e86365e841e92bfc50d8c";
        String result = HashUtil.generateHash(f, hashAlgorithm);
        assertEquals(expResult, result);
    }

    /**
     * Test of generateHash method, of class HashUtil using SHA1.
     */
    @Test
    public void testGenerateHashSHA1() {
        System.out.println("generateHash - SHA1");
        String fu = HashUtilTest.class.getClassLoader().getResource("hashcheck/test.txt").getPath();
        File f = new File(fu);
        String hashAlgorithm = "SHA";
        String expResult = "2ef7bde608ce5404e97d5f042f95f89f1c232871";
        String result = HashUtil.generateHash(f, hashAlgorithm);
        assertEquals(expResult, result);
    }
}
