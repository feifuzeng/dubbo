package com.tydic.dubbo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/8/1 10:58
 */
@Controller
@RequestMapping("/demo")
public class DubboDemoControl {

    @Resource
    private DubboDemoService dubboDemoService;

    @RequestMapping("/name")
    @ResponseBody
    public String getName(){
        return dubboDemoService.getName();
    }
}

