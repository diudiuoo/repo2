package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("/controller")
public class FileLoad {

    @RequestMapping("/fileloadTest")
    public String fileloadTest(HttpServletRequest request, MultipartFile upload  ) throws Exception {
        System.out.println("文件上传....");

        String path = request.getSession().getServletContext().getRealPath("/uploads/");

        File file = new File(path);
        if (!file.exists()){
            file.mkdirs();
        }

        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        upload.transferTo(new File(path,filename));

        return "success";
    }
}
