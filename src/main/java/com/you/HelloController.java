package com.you;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/11/24.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;

    @Autowired
    private GirlProperties girlProterties;
//    @RequestMapping(value = {"/hello","hi"},method= RequestMethod.POST)
//   @RequestMapping(value = {"/say"},method= RequestMethod.GET)
   @GetMapping(value="/say")
//   @RequestMapping(value = {"/say"})
    public String say(@RequestParam(value="id",required=false,defaultValue = "0") Integer myid)
    {
        return "id: "+myid;
//        return girlProterties.getCupSize();
//        return "index";
    }


}
