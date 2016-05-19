package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class App2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {}

	@Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {}

	@Test
	public void test_01_AssertEquals_Positive() {assertEquals("String not the same", "Testing JUnit 4", App.s);}
	

    @Test
    public void test_02_AssertEquals_Negative() {assertEquals("String not the same.", "Testing JUnit 4", App.s);}

    
    @Test
    public void test_03_AssertEquals_Ignored() {assertEquals("String not the same.", "Testing JUnit 4", App.s);}

    @Test
    public void test_04_AssertSame_Positive() {assertSame("Integer not the same.", 55,App.i);}

    @Test
     public void test_05_AssertSame_Negative() {assertSame("Integer not the same.", 55,App.i);}


    @Test
    public void test_06_AssertSame_Ignored() {assertSame("Integer not the same.", 55,App.i);}

    @Test
    public void test_07_AssertFalse_Positive() {assertFalse("Boolean should be false", App.f);}

   @Test
   public void test_08_AssertFalse_Negative() {assertTrue("Boolean should be false", App.t);}
    
    @Test
    public void test_09_AssertTrue_Positive() {assertTrue("Boolean should be true", App.t);}

   @Test
   public void test_10_AssertTrue_Negative() {assertTrue("Boolean should be true", App.t);}

    
    }