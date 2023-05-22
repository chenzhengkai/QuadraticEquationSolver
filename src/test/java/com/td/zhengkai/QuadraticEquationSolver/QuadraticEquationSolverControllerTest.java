package com.td.zhengkai.QuadraticEquationSolver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class QuadraticEquationSolverControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSolve() throws Exception {
        mockMvc.perform(post("/solve")
                        .contentType(MediaType.TEXT_PLAIN)
                        .content("1,-3,2"))
                .andExpect(status().isOk())
                .andExpect(content().string("2.0,1.0"));
    }
}
