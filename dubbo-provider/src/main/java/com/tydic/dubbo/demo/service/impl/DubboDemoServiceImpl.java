package com.tydic.dubbo.demo.service.impl;

import com.tydic.dubbo.demo.DubboDemoService;

/**
 * @author feifz
 * @version 1.0.0
 * @Description TOOD
 * @Date 2018/8/1 9:41
 */
public class DubboDemoServiceImpl implements DubboDemoService {


    @Override
    public String getName() {
        return "this is dubbo-provider's getName methods";
    }
}
