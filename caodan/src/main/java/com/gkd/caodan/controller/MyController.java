package com.gkd.caodan.controller;/**
 * 一些声明信息
 *
 * @author gtr<br />
 * @version
 * @since JDK 1.8
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: MyController <br/>
 * Description: <br/>
 * date: 2020/12/11 23:34<br/>
 * @author gtr<br />
 */
@RestController
public class MyController {


    @RequestMapping("out")

    @ResponseBody

    public String test(){
        return "hello word!";
    }
}

