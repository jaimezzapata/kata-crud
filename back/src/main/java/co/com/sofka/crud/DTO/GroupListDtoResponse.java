package co.com.sofka.crud.DTO;

import java.util.ArrayList;
import java.util.List;

public class GroupListDtoResponse {

    List<GroupListDto> listDTO;

    public GroupListDtoResponse() {
        super();
        listDTO = new ArrayList<GroupListDto>();
    }

    public List<GroupListDto> getListDto() {
        return listDTO;
    }

    public void setListDTO(List<GroupListDto> listDTO) {
        this.listDTO = listDTO;
    }

    public void addListDto(GroupListDto groupListDtoDTO){
        this.listDTO.add(groupListDtoDTO);
    }

}
