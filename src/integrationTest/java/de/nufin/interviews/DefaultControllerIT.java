package de.nufin.interviews;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class DefaultControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldCallDefaultController_withName_andReceiveSuccess() throws Exception {
        this.mockMvc.perform(get("/greet").param("name", "test"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Hello test"));
    }

    @Test
    public void shouldCallDefaultController_withoutName_andReceivesBadRequest() throws Exception {
        this.mockMvc.perform(get("/greet")).andExpect(MockMvcResultMatchers.status().isBadRequest());
    }
}
