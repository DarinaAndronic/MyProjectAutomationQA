package ObjectData;

import java.util.HashMap;

public class SignUpSuccesObject {
    private String UserNameValue;
    private String signPassValue;

    public SignUpSuccesObject(HashMap<String,String> testData){
        populateObject(testData);
    }

    private void populateObject(HashMap<String, String> testData){
        for(String Key: testData.keySet()){
            switch (Key){
                case "UserNameValue":
                    setUserNameValue(testData.get(Key));
                    break;
                case "signPassValue":
                    setSignPassValue(testData.get(Key));
                    break;
            }
        }
    }

    public String getUserNameValue() {
        return UserNameValue;
    }

    public void setUserNameValue(String UserNameValue) {
        this.UserNameValue = UserNameValue;
    }

    public String getSignPassValue() {
        return signPassValue;
    }

    public void setSignPassValue(String signPassValue) {
        this.signPassValue = signPassValue;
    }
}
