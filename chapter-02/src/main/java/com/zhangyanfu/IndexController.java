package com.zhangyanfu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Zhang Yanfu
 * @Date 2017/12/25.
 * @Email 1105564280@qq.com
 */
@Controller
public class IndexController {
    @RequestMapping(path = "index")
    public String index(){
        return "";
    }
}
