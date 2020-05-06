package com.baidu.springvuethymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}