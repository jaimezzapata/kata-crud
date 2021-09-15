package co.com.sofka.crud.api;

import co.com.sofka.crud.DTO.TodoDto;
import co.com.sofka.crud.DTO.TodoDtoResponse;
import co.com.sofka.crud.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/todo")
public class TodoApi {

    @Autowired
    TodoService service;

    @RequestMapping(value = "/register", produces= "aplication/json", method = RequestMethod.POST)
    public TodoDtoResponse register(@RequestBody TodoDto todoDto) {
        return service.register(todoDto);
    }


}
