package testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestHelloWorld {

    @Test()
    public void testEmailGenerator() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();
        
        int b = 10/0;
        String fan = null;
        
        Assert.assertNotNull(fan);
        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yiibai.com");
        Assert.assertEquals(email, "feedback@yiibai.comfan");
        
        try {
        	
        }catch(Exception e){
        	
        }
        

    }
    
    @Test()
    public void testEmailGenerator2() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();
        
        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yiibai.com");
        

    }

}