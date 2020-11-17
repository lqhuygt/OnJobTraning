package springrestuploadfile.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class UploadMultipartFileExampleApplicationTests {
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    void contextLoads() {
    }

    @Test
    public void uploadFileTest() throws Exception{
        MockMultipartFile file = new MockMultipartFile("file",
                "hello.txt", MediaType.MULTIPART_FORM_DATA_VALUE,
                "Hello test".getBytes());
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        mockMvc.perform(multipart("/upload").file(file))
                .andExpect(status().isOk());
    }

}
