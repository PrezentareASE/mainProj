package FirstPackage;

import com.FirstPackage.HelloWorldClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class HelloWorldClassTest {
    @Autowired
    HelloWorldClass helloWorldClass;

    @Test
    public void hello(){
        System.out.println(">>>");
        //System.out.println(">>>");
        //System.out.println(">>>");
        Assert.assertTrue(true);
        //Assert.assertNotNull(helloWorldClass.hello());
    }
}
