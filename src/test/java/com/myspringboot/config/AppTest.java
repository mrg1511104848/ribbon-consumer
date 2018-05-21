package com.myspringboot.config;

import com.myspringboot.StudyApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StudyApplication.class)
@AutoConfigureMockMvc
public class AppTest {
    @Autowired
    private App app;
    @Test
    public void testConfig() throws Exception {
        System.out.println(app);
    }
}
