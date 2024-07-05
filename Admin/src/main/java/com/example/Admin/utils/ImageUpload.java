package com.example.Admin.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class ImageUpload {
    private final String UPLOAD_FOLDER = "your path here";

    public boolean uploadFile(MultipartFile file) {
        boolean isUploaded = false;
        try {
            // Tạo đường dẫn đến thư mục upload nếu chưa tồn tại
            Path uploadPath = Paths.get(UPLOAD_FOLDER);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            // Thực hiện sao chép tệp tin vào thư mục upload
            Path targetPath = Paths.get(UPLOAD_FOLDER, file.getOriginalFilename());
            Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
            isUploaded = true;
        } catch (Exception e) {
            // Xử lý khi có lỗi xảy ra trong quá trình sao chép
            System.err.println("Lỗi khi tải lên tệp tin: " + e.getMessage());
            e.printStackTrace();
        }
        return isUploaded;
    }

    public boolean checkExist(MultipartFile file) {
        boolean isExist = false;
        try {
            // Tạo đường dẫn đến tệp tin trong thư mục upload
            Path filePath = Paths.get(UPLOAD_FOLDER, file.getOriginalFilename());
            File checkFile = filePath.toFile();
            isExist = checkFile.exists();
        } catch (Exception e) {
            // Xử lý khi có lỗi xảy ra trong quá trình kiểm tra sự tồn tại của tệp tin
            System.err.println("Lỗi khi kiểm tra sự tồn tại của tệp tin: " + e.getMessage());
            e.printStackTrace();
        }
        return isExist;
    }
}
