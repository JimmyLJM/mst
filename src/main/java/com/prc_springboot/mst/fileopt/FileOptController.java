package com.prc_springboot.mst.fileopt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
@RequestMapping("/file")
public class FileOptController {

    @RequestMapping("/download")
    public String fileDownLoad(HttpServletRequest request, HttpServletResponse response){
        return  null;
    }

    /**
     * 下载项目根目录下doc下的文件
     * 下载项目根目录下doc下的文件
     * @param response
     * @param fileName
     * @return
     */
    public static String downloadFile(HttpServletResponse response, String fileName){
        File path = null;
        response.setHeader("content-type", "application/octet-stream");
        response.setContentType("application/octet-stream");

        return null;
    }

}
