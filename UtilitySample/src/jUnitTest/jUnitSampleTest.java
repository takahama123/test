package jUnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class jUnitSampleTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("最初に１度だけ実行");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("最後に１度だけ実行");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("メソッド前に毎回実行される");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("メソッド後に毎回実行される");
    }

    @Test
    public void test() {
        System.out.println("test()");
        jUnitSample test = new jUnitSample();
        assertEquals(2, test.doExcec(1, 2));
    }


    @Test
    public void test2() {
        System.out.println("test2()");
        jUnitSample test = new jUnitSample();
        assertEquals("ファイル.txt", test.getPropertiesFileName());
    }

}
