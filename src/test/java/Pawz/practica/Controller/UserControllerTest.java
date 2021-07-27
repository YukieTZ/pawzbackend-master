package Pawz.practica.Controller;


import Pawz.practica.MainController;
import Pawz.practica.usuario;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = MainController.class)


public class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    MainController userService;

    @Test
    public void getAllUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/demo/all_usuarios"))
                .andExpect(status().isOk());
    }


    /*@Test
    public void createUser() throws Exception {
        given(userService.addNewUser(Mockito.any())).willReturn(new usuario("Marcela", "147147", "marce_rubio@gmail.com", "12345678", "abcd"));
        mockMvc.perform(MockMvcRequestBuilders.post("/demo/add_usuario"))
                .andExpect(status().isOk());
    }*/
    @Test
    void addNewUser() throws Exception {
        given(userService.addNewUser(Mockito.any())).willReturn(new usuario("Marcela","rubio","marce_rubio","12345678","abcd"));

        mockMvc.perform(MockMvcRequestBuilders.post("/add_usuario"))
                .andExpect(status().isOk());
    }


    @Test
    public void getAllPublicaciones() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/demo/all_publicaciones"))
                .andExpect(status().isOk());
    }

    @Test
    public void getUser()throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/user/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("user_name").value("karen"));
    }
}