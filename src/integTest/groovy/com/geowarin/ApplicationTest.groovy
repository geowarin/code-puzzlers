package com.geowarin

import groovyx.net.http.HttpResponseDecorator
import groovyx.net.http.RESTClient
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

/**
 *
 * Date: 18/05/2014
 * Time: 17:02
 * @author Geoffroy Warin (http://geowarin.github.io)
 */
@RunWith(SpringJUnit4ClassRunner)
@IntegrationTest(['server.port=0'])
@WebAppConfiguration
@SpringApplicationConfiguration(classes = [Application])
class ApplicationTest {

    private RESTClient restClient
    @Value('${local.server.port}')
    private int port

    @Before
    void setUp() {
        restClient = new RESTClient("http://localhost:$port")
    }

    @Test
    void should_display_home_page() {
        HttpResponseDecorator response = restClient.get(path: '/')
        assert response.status == 200
        assert response.data.text == 'Hello World!'
    }
}
