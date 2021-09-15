package co.com.sofka.crud.DTO;

import java.util.ArrayList;
import java.util.List;

public class TodoDtoResponse {
    List<TodoDto> listDTO;

    public TodoDtoResponse() {
        super();
        listDTO = new ArrayList<TodoDto>();
    }

    public List<TodoDto> getListDto() {
        return listDTO;
    }

    public void setListDTO(List<TodoDto> listDTO) {
        this.listDTO = listDTO;
    }

    public void addListDto(TodoDto todoDTO){
        this.listDTO.add(todoDTO);
    }

}
