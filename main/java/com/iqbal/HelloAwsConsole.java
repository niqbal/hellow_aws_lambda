package com.iqbal;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import static com.iqbal.HelloCommon.handleInternal;

public class HelloAwsConsole implements RequestHandler<InputClassAwsConsole, ResponseClass> {

    public ResponseClass handleRequest(InputClassAwsConsole request, Context context) {
        return handleInternal(request.body);
    }
}