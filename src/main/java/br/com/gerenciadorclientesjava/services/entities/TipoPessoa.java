package br.com.gerenciadorclientesjava.services.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoPessoa {

    private Integer id;
    private String tipoPessoa;

}
