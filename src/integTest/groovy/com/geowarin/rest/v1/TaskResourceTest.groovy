package com.geowarin.rest.v1;

import com.geowarin.AbstractIntegrationTest;
import groovyx.net.http.HttpResponseDecorator
import org.junit.Test;

public class TaskResourceTest extends AbstractIntegrationTest {

    @Test
    void should_list_all_tasks() {
        HttpResponseDecorator response = restClient.get(path: '/task/all')
        assert response.status == 200
        assert response.contentType == 'application/json'
        assert (response.data instanceof List)
        assert response.data.size() == 1
        assert response.data[0].sourceCode.contains('public class Main')
    }
}