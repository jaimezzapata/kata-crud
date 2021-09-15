package co.com.sofka.crud.repository;

import co.com.sofka.crud.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {



    String queryAll = "select new co.com.sofka.crud.DTO.GroupListDto(t.name, t.todosDTO"
            + "from GroupList t"
            +"where 1"

}
