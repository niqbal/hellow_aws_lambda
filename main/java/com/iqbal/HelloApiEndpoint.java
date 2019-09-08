package com.iqbal;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import static com.iqbal.HelloCommon.handleInternal;

public class HelloApiEndpoint implements RequestHandler<InputClassApiEndpoint, ResponseClass> {
    public ResponseClass handleRequest(InputClassApiEndpoint request, Context context) {
        return handleInternal(request.body);
    }
}