package com.mehdi5.mehdi5.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class ImageUpload {
    private final String UPLOAD_FOLDER = "C:\\Users\\ahmed\\Documents\\tutorial Spring boot\\Spring boot project 10.02.2023\\mehdi5\\mehdi5\\src\\main\\resources\\static\\images\\image-product";

    public boolean uploadImage(MultipartFile imageProduct){
        boolean isUpload = false;
        try {
            Files.copy(imageProduct.getInputStream(),
                    Paths.get(UPLOAD_FOLDER + File.separator, imageProduct.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);
            isUpload = true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return isUpload;
    }

    public boolean checkExisted(MultipartFile imageProduct){
        boolean isExisted = false;
        try {
            File file = new File(UPLOAD_FOLDER + "\\" + imageProduct.getOriginalFilename());
            isExisted = file.exists();
        }catch (Exception e){
            e.printStackTrace();
        }
        return isExisted;
    }
}
