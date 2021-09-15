package co.com.sofka.crud.repository;

import co.com.sofka.crud.entities.GroupList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface GroupListRepository extends JpaRepository<GroupList, Integer> {

    String queryAll = "select new co.com.sofka.crud.DTO.GroupListDto(t.idList, t.todosDTO"
            + " from GroupList t"
            + " where 1=1";
}
