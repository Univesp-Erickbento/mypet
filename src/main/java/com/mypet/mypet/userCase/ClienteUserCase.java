package com.mypet.mypet.userCase;

import com.mypet.mypet.domain.model.Funcionarios;
import com.mypet.mypet.domain.model.Pessoas;
import com.mypet.mypet.domain.dto.ClienteDTO;
import com.mypet.mypet.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteUserCase {
    @Autowired
    private FuncionarioRepository funcionarioRepository;
    public List<ClienteDTO> findAll(){
    List<Funcionarios> result = funcionarioRepository.findAll();
    List<ClienteDTO> dto = result.stream().map(x -> new ClienteDTO(x)).toList();
    return dto;
}

}
