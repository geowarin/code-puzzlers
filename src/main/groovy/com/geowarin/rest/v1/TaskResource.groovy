package com.geowarin.rest.v1

import com.geowarin.model.Task
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 * Date: 18/05/2014
 * Time: 16:38
 * @author Geoffroy Warin (http://geowarin.github.io)
 */
@RestController
@RequestMapping('/task')
class TaskResource {

    final List<Task> tasks = [
new Task(
        sourceCode:
'''public class Main {
}''',
        targetCode:
'''public class Main {
    public static void main(String[] args) {
        System.out.println('Hello world!')
    }
} ''')
    ]

    @RequestMapping('/all')
    List<Task> allTasks() {
        tasks
    }
}
