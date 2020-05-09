package com.baidu.springvuethymeleaf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringVueThymeleafApplicationTests {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Test
    void contextLoads() {
        System.out.println("hello");
        System.out.println(this.sql("gao"));
    }

    public String sql(String name) {
        jdbcTemplate.execute("Test3('" + name + "')");
        return jdbcTemplate.queryForMap("select * from T_TEST where name='" + name + "'").toString();
    }


    public static void main(String[] args) {
        String info = "";
        char[] chars = info.toCharArray();
        int i = 3;
        int length = chars.length;
        String[] array=null;
        if (length % 3 == 0) {
            array = new String[length / 3];
        } else {
            array = new String[length / 3 + 1];
        }
        for (String s : array) {
            System.out.println(s);
        }
//        List<Integer> list = new ArrayList<Integer>();
//        for (int j=0; j<array.length; j++) {
//            if(!list.contains(array[j])) {
//                String s = array[j];
//                System.out.println(s);
////                list.add(array[j]);
//            }
//        }
//        System.out.println("去除重复后的list集合"+list);
    }

    public static String[] Pro(String number) {
        String[] str;
        int length = number.length();
        int group = length / 2;
        if (0 == length % 2) {
            str = new String[group];
        } else {
            str = new String[group + 1];
        }
        for (int i = 0, j = 0; i < group; i++, j += 2) {
            str[i] = number.substring(j, j + 2);
            if (i == (group - 1)) {
                if (1 == length % 2) {
                    str[i + 1] = number.substring(length - 1, length);
                }
            }
        }
        return str;
    }
}
