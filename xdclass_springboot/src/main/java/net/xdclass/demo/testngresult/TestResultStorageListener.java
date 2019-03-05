package net.xdclass.demo.testngresult;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

public class TestResultStorageListener extends TestListenerAdapter {
	 
    @Override
    public void onFinish(ITestContext testContext) {
        StorageHandler storageHandler = (StorageHandler) testContext.getAttribute("storageHandler");
        if(storageHandler != null){
            //storageHandler.handle(testContext);
        }
    }
 
}
