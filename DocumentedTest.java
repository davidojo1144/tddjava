import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentedTest{

	@Test
	public void powerOfIntegers(){
	Documented document = new Documented();
	int raiseToPower = document.multiply(10, 10);
	assertEquals(100, raiseToPower);
	}

}
	
