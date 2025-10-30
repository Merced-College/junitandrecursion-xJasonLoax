// Jason Loa
// 10/30/25
// Recursion Problems with JUnit tests

public class UnitTest {
    // first JUnit test

    @org.junit.Test
    public void test1CountHi() {
        int result = TestClass.countHi("xxhixxxxhixxxx");
        org.junit.Assert.assertEquals(2, result);
    }

    // first JUnit test

    @org.junit.Test
    public void test2CountHi() {
        int result = TestClass.countHi("sdfghjklkjhg");
        org.junit.Assert.assertEquals(0, result);
    }

    // first JUnit test

    @org.junit.Test
    public void test3CountHi() {
        int result = TestClass.countHi("hihihihihihi");
        org.junit.Assert.assertEquals(6, result);
    }

    // first JUnit test

    @org.junit.Test
    public void test4CountHi() {
        int result = TestClass.countHi("");
        org.junit.Assert.assertEquals(0, result);
    }

    // first JUnit test

    @org.junit.Test
    public void test5CountHi() {
        int result = TestClass.countHi(null);
        org.junit.Assert.assertEquals(0, result);
    }
}
