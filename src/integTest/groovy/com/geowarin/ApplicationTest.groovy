package com.geowarin

import groovyx.net.http.HttpResponseDecorator
import org.junit.Test

/**
 *
 * Date: 18/05/2014
 * Time: 17:02
 * @author Geoffroy Warin (http://geowarin.github.io)
 */
class ApplicationTest extends AbstractIntegrationTest {

    @Test
    void should_display_home_page() {
        HttpResponseDecorator response = restClient.get(path: '/')
        assert response.status == 200
        assert response.data.text == 'Hello World!'
    }
}
