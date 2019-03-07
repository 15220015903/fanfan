package net.xdclass.demo.testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

import net.xdclass.demo.testng.RandomEmailGenerator;


public class TestHelloWorld {

    @Test()
    public void testEmailGenerator() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();
        
        int b = 10/1;
        String fan = "";
        
        Assert.assertNotNull(fan);
        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yiibai.com2");
        Assert.assertEquals(email, "feedback@yiibai.com");
        
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