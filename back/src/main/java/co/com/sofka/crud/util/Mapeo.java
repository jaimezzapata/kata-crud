package co.com.sofka.crud.util;

import co.com.sofka.crud.DTO._DTOEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapeo {
    @Autowired
    private ModelMapper modelMapper;

    public _DTOEntity convertToDto(Object obj, _DTOEntity dto) {
        return modelMapper.map(obj, dto.getClass() );
    }

    public Object convertToEntity(_DTOEntity dto, Object obj) {
        return modelMapper.map(dto, obj.getClass());
    }
}
