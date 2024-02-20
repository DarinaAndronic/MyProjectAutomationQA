package ShareData;

import PropertyUtility.PropertyUtility;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Hooks extends ShareData{

    public HashMap<String,String> testData;
    public String testName;

    @BeforeMethod
    public void prepareEnviroment(){
        testName=this.getClass().getSimpleName();
         PropertyUtility propertyUtility=new PropertyUtility(testName);
         testData=propertyUtility.getAllData();
         setUP();

    }
}
