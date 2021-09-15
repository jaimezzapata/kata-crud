package co.com.sofka.crud.services;

import co.com.sofka.crud.DTO.TodoDto;
import co.com.sofka.crud.DTO.TodoDtoResponse;

public interface TodoService {

    public TodoDtoResponse register(TodoDto todo);
    public TodoDtoResponse getAll();
    public TodoDtoResponse get(int id);
}
