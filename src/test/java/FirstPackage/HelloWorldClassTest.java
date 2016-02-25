package FirstPackage;

import com.FirstPackage.HelloWorldClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class HelloWorldClassTest {

    HelloWorldClass helloWorldClass;

    @Before
    public void setup(){
        helloWorldClass = new HelloWorldClass();
    }

    @Test
    public void hello(){
        System.out.println(">>>");

        Assert.assertTrue(true);
        Assert.assertNotNull(helloWorldClass.hello());
    }

    @After
    public void after(){
        helloWorldClass = null;
    }
}
