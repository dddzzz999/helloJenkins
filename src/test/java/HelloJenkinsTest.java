import org.junit.Test;
import static org.junit.Assert.*;

public class HelloJenkinsTest {
    @Test public void testSomeLibraryMethod() {
    	HelloJenkins classUnderTest = new HelloJenkins();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
