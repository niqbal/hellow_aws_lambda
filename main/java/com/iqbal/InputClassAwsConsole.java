package com.iqbal;

public class InputClassAwsConsole {
    Person body;

    public Person getBody() {
        return body;
    }

    /**
     * Required for directly using lambda from aws console.
     */
    public void setBody(Person body) {
        this.body = body;
    }

    public InputClassAwsConsole() {
    }
}
