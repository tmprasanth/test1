package daynine;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
//JUnit Suite Test
@RunWith(Suite.class)
@Suite.SuiteClasses(
		{ 
			TC1_VerifyLogin.class ,
			TC2_AssertExample.class
		}
	)

public class Orange_Suite {

}
