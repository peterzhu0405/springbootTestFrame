package com.course.controller;


//import com.course.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Log4j
@RestController
@Api(value = "v1",description = "这是我的第一个版本的demo")
@RequestMapping("v1")
public class Demo {

    //首先获取一个执行sql语句的对象
    //启动既加载
    @Autowired
    private SqlSessionTemplate template;

    @RequestMapping(value = "/getCarCount",method = RequestMethod.GET)
    @ApiOperation(value = "可以获取库存中的数量",httpMethod = "GET")
    public int getCarCount(){
       return template.selectOne("getCarCount");
    }

//    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
//    public int addUser(@RequestBody User user){
//        int result = template.insert("addUser",user);
//        return result;
//    }

//    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
//    public int updateUser(@RequestBody User user){
//
//       return  template.update("updateUser",user);
//
//    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public int delUser(@RequestParam int id){
        return template.delete("deleteUser",id);
    }

}
