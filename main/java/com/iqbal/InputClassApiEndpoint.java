package com.iqbal;

public class InputClassApiEndpoint {
    Person body;

    public Person getBody() {
        return body;
    }

    /**
     * This is required for deserializing the input while using REST api endpoint!
     * <p>
     * <p>
     * curl -X POST 'https://jnbvy62soi.execute-api.us-east-1.amazonaws.com/default/helloaug20' -H   'Content-Type: application/json' -d ' { "firstName": "Nawab", "lastName": "Iqbal"} '
     */
    public void setBody(String body) {
        this.body = Person.createPersonObject(body);
    }
    
    public InputClassApiEndpoint() {
    }
}
