package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DemoController {

    /**
     * 测试配置文件是否能打开网页
     * @return
     */
    @RequestMapping("/demo")
    @ResponseBody
    public String demo() {
        return "success";
    }
}

