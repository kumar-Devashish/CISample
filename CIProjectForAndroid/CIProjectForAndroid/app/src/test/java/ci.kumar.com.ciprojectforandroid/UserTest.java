package ci.kumar.com.ciprojectforandroid;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by a1176582 on 11/4/15.
 */
public class UserTest {

    @Test
    public void UserNametest() {
        User u = new User();
        u.setName("Kumar");
        Assert.assertEquals("Kumar", u.getName());
    }

    @Test
    public  void lastNameTest(){
        User u =new User();
        u.setLastName("Devashish");
        Assert.assertEquals("Devashish", u.getLastName());
    }
}
