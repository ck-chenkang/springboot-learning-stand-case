package com.itcodai.course05.controller;

import com.itcodai.course05.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/test", produces = "application/json; charset=UTF-8")
public class TestController {

    /**
     * 测试@RequestMapping
     * @return
     */
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String testGet() {
        return "success";
    }

    /**
     * 测试@Pathvariable注解，一个参数
     * @param id
     * @return
     */
    @GetMapping("/user/{idd}")
    public String testPathVariable(@PathVariable(value = "idd") Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    /**
     * 测试@Pathvariable注解，多个参数
     * @param id
     * @return
     */
    @GetMapping("/user/{idd}/{name}")
    public String testPathVariable(@PathVariable(value = "idd") Integer id, @PathVariable String name) {
        System.out.println("获取到的id为：" + id);
        System.out.println("获取到的name为：" + name);
        return "success";
    }

    @GetMapping("/user")
    public String testRequestParam(@RequestParam Integer id) {
        System.out.println("获取到的id为：" + id);
        return "success";
    }

    @PostMapping("/user")
    public String testRequestBody(@RequestBody User user) {
        System.out.println("获取到的username为：" + user.getUsername());
        System.out.println("获取到的password为：" + user.getPassword());
        return "success";
    }
}
