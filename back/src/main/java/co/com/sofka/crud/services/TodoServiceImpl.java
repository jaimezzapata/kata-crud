package co.com.sofka.crud.services;

import co.com.sofka.crud.DTO.TodoDto;
import co.com.sofka.crud.DTO.TodoDtoResponse;
import co.com.sofka.crud.entities.Todo;
import co.com.sofka.crud.repository.TodoRepository;
import co.com.sofka.crud.util.Mapeo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    TodoRepository repository;

    @Autowired
    private Mapeo maper;

    public TodoDtoResponse register(TodoDto todoDto) {
        Todo obj = new Todo();
        TodoDtoResponse response = new TodoDtoResponse();

        try{
            obj = (Todo)maper.convertToEntity(todoDto, obj);
            obj =repository.save(obj);

            response.setListDTO(repository.g);
        } catch (Exception e){

        }
    }


}
