package com.gemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author gemini
 * Created in  2021/5/12 20:44
 */
@Controller
public class FileController {
    @RequestMapping("/upload")
    @ResponseBody
    public void testFileUpload(String username, @RequestParam("uploadedFile") MultipartFile uploadFile)throws IOException{
        System.out.println(username);
        String originalFilename = uploadFile.getOriginalFilename();
        //转存到本地文件夹中
        uploadFile.transferTo(new File("d:\\Java_Project\\Spring_MVC\\Notes\\fileLoad\\" + originalFilename));
    }

}
