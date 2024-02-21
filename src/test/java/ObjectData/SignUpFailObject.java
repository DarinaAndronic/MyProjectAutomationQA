package ObjectData;

import java.util.HashMap;

public class SignUpFailObject {
    public String signUserNameValue;
    public String signPassValue;

    public SignUpFailObject(HashMap<String,String> testData){
        populateObject(testData);
    }

    private void populateObject(HashMap<String, String> testData){
        for(String Key: testData.keySet()){
            switch (Key){
                case "signUserNameValue":
                    setSignUserNameValue(testData.get(Key));
                    break;
                case "signPassValue":
                    setSignPassValue(testData.get(Key));
                    break;
            }
        }
    }
    public String getSignUserNameValue() {
        return signUserNameValue;
    }
    public void setSignUserNameValue(String signUserNameValue) {
        this.signUserNameValue = signUserNameValue;
    }
    public String getSignPassValue() {
        return signPassValue;
    }
    public void setSignPassValue(String signPassValue) {
        this.signPassValue = signPassValue;
    }
}
