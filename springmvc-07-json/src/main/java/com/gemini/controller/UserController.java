package com.gemini.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.gemini.pojo.User;
import com.gemini.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author gemini
 * Created in  2021/5/11 12:27
 * 在类上直接使用 @RestController,里面所有的方法都只会返回 json 字符串
 * 我们在前后端分离开发中，一般都使用 @RestController
 */
@RestController
public class UserController {
    //produces:指定响应体返回类型
    @RequestMapping("/json1")
    public String json1() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("GEMINI", 3, "男");
        //将我们的对象解析成为json格式
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return mapper.writeValueAsString(user);
    }

    //测试集合输出
    @RequestMapping("/json2")
    public String json2() throws JsonProcessingException {

        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user1 = new User("秦疆1号", 3, "男");
        User user2 = new User("秦疆2号", 3, "男");
        User user3 = new User("秦疆3号", 3, "男");
        User user4 = new User("秦疆4号", 3, "男");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        //将我们的对象解析成为json格式
        return mapper.writeValueAsString(list);
    }

    @RequestMapping("/json3")
    public String json3() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        //创建时间一个对象，java.util.Date
        Date date = new Date();
        //将我们的对象解析成为json格式
        return mapper.writeValueAsString(date);
    }

    @RequestMapping("/json4")
    public String json4() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //指定日期格式
        mapper.setDateFormat(sdf);

        Date date = new Date();

        return mapper.writeValueAsString(date);
    }
    //使用工具类，使代码更加简洁
    @RequestMapping("/json5")
    public String json5() {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }
}
