package com.geowarin

import groovyx.net.http.RESTClient
import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

/**
 *
 * Date: 18/05/2014
 * Time: 17:24
 * @author Geoffroy Warin (http://geowarin.github.io)
 */
@RunWith(SpringJUnit4ClassRunner)
@IntegrationTest(['port=0'])
@WebAppConfiguration
@SpringApplicationConfiguration(classes = [Application])
abstract class AbstractIntegrationTest {

    protected RESTClient restClient
    @Value('${local.server.port}')
    private int port

    @Before
    void setUp() {
        restClient = new RESTClient("http://localhost:$port")
    }
}
