package springrestuploadfile.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springrestuploadfile.demo.message.ResponseMessage;
import springrestuploadfile.demo.service.FilesStorageService;


@RestController
public class FilesController {
    @Autowired
    private FilesStorageService filesStorageService;

    @PostMapping("/upload")
    public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file){
        String message = "";
        try {
            filesStorageService.save(file);
            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        }catch (Exception e){
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }

    @PostMapping("/upload/convert")
    public ResponseEntity<ResponseMessage> convertToPDF(@RequestParam("docPath") String docPath,
                                                        @RequestParam("pdfPath") String pdfPath){
        String message = "";
        try {
            filesStorageService.convertToPDF(docPath,pdfPath);
            message = "Convert the file successfully: ";
            return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
        }catch (Exception e){
            message = "Could not upload the file: ";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
        }
    }
}
