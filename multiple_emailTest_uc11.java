import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;

import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class multiple_emailTest_uc11 {
    private String EmailAddress;
    private boolean ExpectedResult;

    public multiple_emailTest_uc11(String emailAddress, boolean expectedResult){
        this.EmailAddress = emailAddress;
        this.ExpectedResult = expectedResult;
    }
    @Parameters
    public static Collections data(){
        return (Collections) Arrays.asList(new Object[][] { {"abc@yahoon.com",true},{"abc-100@yahoo.com",true},
                {"abc100.com",true}});

    }


    @Test
    public void multipleEmailAddress(){
        UserValidator validator = new  UserValidator();
        boolean Result = validator.validateEmailAddress(this.EmailAddress);
        Assert.assertEquals(this.ExpectedResult,Result);

    }
    public class  UserValidator{
        public static final String EmailAddress = "^[A-Za-z0-9+_.-]+@(.+)$";
        public boolean validateEmailAddress(String Email) {
            Pattern pattern = Pattern.compile(EmailAddress);
            return pattern.matcher(Email).matches();
        }

    }
}
