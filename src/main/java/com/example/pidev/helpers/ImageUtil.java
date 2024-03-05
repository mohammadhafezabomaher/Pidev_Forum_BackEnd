/*package com.example.pidev.helpers;

import org.apache.commons.codec.binary.Base64;
import org.springframework.web.multipart.MultipartFile;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageUtil {

    public static void saveBase64Image(String base64ImageString, String imagePath) throws IOException {
        byte[] decodedBytes = Base64.decodeBase64(base64ImageString);
        try (FileOutputStream fos = new FileOutputStream(imagePath)) {
            fos.write(decodedBytes);
        }
    }
}
*/