package com.baidu.springvuethymeleaf.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ZzsbController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("getage")
    @ResponseBody
    public Object getage(int age) {
        System.out.println(age);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from students limit " + (age - 1) * 10 + ",10");
        return maps;
    }

    @GetMapping("main")
    @ResponseBody
    public Object mains() {
        return "OK";
    }

    @RequestMapping("/")
    public String main() {
        return "index";
    }

    //    @GetMapping("/students")
//    public Object index() {
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from students limit 1,10");
////        int total = Integer.parseInt(jdbcTemplate.queryForMap("SELECT COUNT(*) total FROM students ").get("total").toString());
////        model.addAttribute("total", 10000);
////        model.addAttribute("tableData", maps);
//        return maps;
//    }
    @PostMapping("test")
    @ResponseBody
    public Object test(@RequestBody String jsonObject) {
        Map map = new HashMap();
        for (String s : jsonObject.split("&")) {
            String[] split1 = s.split("=");
            map.put(split1[0], split1[1]);
        }
        System.out.println(map.toString());
        return "test";
    }

    @GetMapping("test1")
    @ResponseBody
    public Object test1(@RequestParam(name = "id") int id) {
        System.out.println(id);
        return "test1";
    }
}