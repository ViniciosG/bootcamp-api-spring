package com.carros.domain.dto;

import com.carros.domain.Carro;
import lombok.Data;
import org.modelmapper.ModelMapper;

@Data
public class CarroDTO {
    public Long id;
    public String nome;
    public String tipo;

 
    public static CarroDTO create(Carro c) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(c, CarroDTO.class);
    }
}
