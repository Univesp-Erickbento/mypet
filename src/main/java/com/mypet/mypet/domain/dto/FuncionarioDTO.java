package com.mypet.mypet.domain.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mypet.mypet.domain.complementares.Cargos;
import com.mypet.mypet.domain.model.Funcionarios;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
@ToString
@Data
@Setter
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class FuncionarioDTO implements Serializable {

    private static final long serialVersionUID = 1l;


    private   String funcionarioTipo;
    private  String funcionarioReg;
    private Cargos cargo;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private  LocalDate dataDeAdimissao;

    public FuncionarioDTO(Funcionarios obj) {
        this.funcionarioTipo = obj.getFuncionarioTipo();
        this.funcionarioReg = obj.getFuncionarioReg();
        this.cargo = obj.getCargo();
        this.dataDeAdimissao = obj.getDataDeAdimissao();
    }
}
