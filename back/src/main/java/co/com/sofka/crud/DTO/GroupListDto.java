package co.com.sofka.crud.DTO;

import java.util.List;

public class GroupListDto implements _DTOEntity{


    private String name;
    private List<TodoDto> todosDTO;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TodoDto> getTodosDTO() {
        return todosDTO;
    }

    public void setTodosDTO(List<TodoDto> todosDTO) {
        this.todosDTO = todosDTO;
    }
}
