package com.iqbal;

class HelloCommon {
    static ResponseClass handleInternal(Person body) {
        String firstName = "";
        String lastName = "";
        if (body != null) {
            firstName = body.getFirstName();
            lastName = body.getLastName();
        }

        String greetingString = String.format("Hello %s %s.", firstName, lastName);
        return new ResponseClass(greetingString);
    }
}
