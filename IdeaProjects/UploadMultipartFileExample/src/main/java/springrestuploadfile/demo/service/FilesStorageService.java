package springrestuploadfile.demo.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FilesStorageService {
    public void init();

    public void save(MultipartFile file);

    public void convertToPDF(String docPath, String pdfPath);

    public Resource load(String filename);
}
