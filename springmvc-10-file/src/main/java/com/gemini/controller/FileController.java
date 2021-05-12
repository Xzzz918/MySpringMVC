package com.gemini.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author gemini
 * Created in  2021/5/12 20:44
 * 一个简单的文件上传并转存于本地的文件夹中
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

    @RequestMapping(value="/downloadEntity")
    public ResponseEntity<byte[]> downloadsEntity() throws Exception{
        //设置文件路径
        String path = "D:\\GameDownload";
        String fileName = "001.jpg";
        File file = new File(path,fileName);
        if(!file.isFile()){
            return null;
        }
        @SuppressWarnings("resource")
        InputStream input = new FileInputStream(file);
        byte[] buff = new byte[input.available()]; // 获取文件大小
        //下面这一步必须要有
        int read = input.read(buff);
        System.out.println(read);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename="+fileName);
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(buff, headers, status);
    }


}
