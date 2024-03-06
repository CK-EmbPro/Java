package com.example.advancedservlets;

import com.mysql.cj.result.Field;
import jakarta.servlet.ServletException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.MultipartConfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static com.example.advancedservlets.FileUploadConstants.*;
@WebServlet(name = "MultiPartServlet", value = "/uploadServlet")
@MultipartConfig(fileSizeThreshold = MEMORY_THRESHOLD, maxFileSize = MAX_FILE_SIZE, maxRequestSize = MAX_REQUEST_SIZE)
public class FileUploadUsingMultiPartAnnotation extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private String fileInitParam;

    public void init(){
        fileInitParam = getServletContext().getInitParameter("file-upload");
    }

    private String getFileName(Part part){
        String contentDisp = part.getHeader("content-disposition");
        System.out.println("content-disposition header= "+contentDisp);
        String[] tokens = contentDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length() - 1);
            }
        }

        return "uploadedFile";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uploadPath1 = getServletContext().getRealPath("")    ;
        System.out.println("absolute path is "+uploadPath1);
        String uploadPath = fileInitParam;
        File uploadDir = new File(uploadPath);
        if(!uploadDir.exists()){
            uploadDir.mkdir();
        }

        try {
            String fileName = "";
            for(Part part: request.getParts()){
                fileName = getFileName(part);
                part.write(uploadPath+File.separator+fileName);
            }

            request.setAttribute("message", "File "+fileName+" has been uploaded successfully");
            System.out.println("uploaded successfully"+uploadDir);
        }catch (FileNotFoundException fne){
            request.setAttribute("message", "There was an error"+fne.getMessage());
            fne.printStackTrace();

        }finally {
            getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
        }

    }


}
