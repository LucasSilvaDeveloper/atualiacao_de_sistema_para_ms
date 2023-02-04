package br.com.fisio.api.controller;

import br.com.fisio.core.enums.TipoAtendimento;
import br.com.fisio.core.model.Atendimento;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AtendimentoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @DisplayName("Teste de cadastro com sucesso!")
    @Test
    void cadastroSuccessTest() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        Atendimento atendimento = new Atendimento();

        atendimento.setNomeMedico("Elaine");
        atendimento.setNomePaciente("Lucas");
        atendimento.setTipoAtendimento(TipoAtendimento.AVALIACAO);
        atendimento.setDataAtendimento(LocalDateTime.now());

        MockHttpServletResponse response = mockMvc.perform(post("/atendimento")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(atendimento)))
                .andReturn().getResponse();

        assertEquals(response.getStatus(), HttpStatus.CREATED.value());
    }

}
