/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Metrics Request Marshaller
 */
public class ListMetricsRequestMarshaller implements Marshaller<Request<ListMetricsRequest>, ListMetricsRequest> {

    public Request<ListMetricsRequest> marshall(ListMetricsRequest listMetricsRequest) {
        Request<ListMetricsRequest> request = new DefaultRequest<ListMetricsRequest>(listMetricsRequest, "AmazonCloudWatch");
        request.addParameter("Action", "ListMetrics");
        request.addParameter("Version", "2009-05-15");
        if (listMetricsRequest != null) {
            if (listMetricsRequest.getNextToken() != null) {
                request.addParameter("NextToken", StringUtils.fromString(listMetricsRequest.getNextToken()));
            }
        }


        return request;
    }
}