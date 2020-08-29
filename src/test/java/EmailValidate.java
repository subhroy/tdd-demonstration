import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailValidate {
    @Test
    public void testEmailAddress(){
        MyEmailValidator emailValidateObj = new MyEmailValidator();
        Assert.assertEquals(true,emailValidateObj.isValidEmail("test@email.com"));
    }
}
