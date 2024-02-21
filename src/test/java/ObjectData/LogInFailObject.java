package ObjectData;

import java.util.HashMap;

public class LogInFailObject {
    private String loginUsernameValue;
    private String loginPasswordValue;


    public LogInFailObject(HashMap<String, String> testData) {
        populateObject(testData);
    }

    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "loginUsernameValue":
                    setLoginUsernameValue(testData.get(Key));
                    break;
                case "loginPasswordValue":
                    setLoginPasswordValue(testData.get(Key));
                    break;
            }
        }
    }
    public String getLoginUsernameValue() {
        return loginUsernameValue;
    }

    public void setLoginUsernameValue(String loginUsernameValue) {
        this.loginUsernameValue = loginUsernameValue;
    }

    public String getLoginPasswordValue() {
        return loginPasswordValue;
    }

    public void setLoginPasswordValue(String loginPasswordValue) {
        this.loginPasswordValue = loginPasswordValue;
    }

}


