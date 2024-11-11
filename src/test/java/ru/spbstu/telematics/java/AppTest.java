package ru.spbstu.telematics.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void TestPrerecording() throws IOException {

        String prerecording = "Строка для дозаписи \n";

        String information = App.ReadTxt("src/test/resources/test_processed_file.txt");
        information += prerecording;

        App.WriteFileTxt("src/test/resources/test_processed_file.txt", prerecording);

        String information_after_update = App.ReadTxt("src/test/resources/test_processed_file.txt");

        assertEquals(information, information_after_update);
    }



}
