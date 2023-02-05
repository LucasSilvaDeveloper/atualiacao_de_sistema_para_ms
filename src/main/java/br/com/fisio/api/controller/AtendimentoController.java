package br.com.fisio.api.controller;

import br.com.fisio.core.model.Atendimento;
import br.com.fisio.core.service.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/atendimento")
@RestController
public class AtendimentoController {

    @Autowired
    private AtendimentoService atendimentoService;

    @PostMapping
    public ResponseEntity<Atendimento> cadastro(@RequestBody @Valid Atendimento atendimento){
        return atendimentoService.save(atendimento);
    }

    @GetMapping
    public Page<Atendimento> buscar(@PageableDefault(sort = "id") Pageable pageable){
        return atendimentoService.buscar(pageable);
    }

}
