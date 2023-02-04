package br.com.fisio.core.service;

import br.com.fisio.core.model.Atendimento;
import br.com.fisio.core.repository.AtendimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;

    public ResponseEntity<Atendimento> save(Atendimento atendimento){
        return ResponseEntity.status(HttpStatus.CREATED).body(atendimentoRepository.save(atendimento));
    }
}
