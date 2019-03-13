package com.baizhi.controller;

import com.baizhi.entity.Load;
import com.baizhi.service.LoadService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/load")
public class LoadController {
    @Autowired
    private LoadService loadService;
    @RequestMapping("load")
    public String laod(Load c, MultipartFile fileName, HttpServletRequest request){
        try {

            loadService.add(c);
            return "OK";
        }catch (Exception e){

        }
        return "OK";
    }
}
