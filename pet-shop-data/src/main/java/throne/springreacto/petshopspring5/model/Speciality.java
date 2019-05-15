package throne.springreacto.petshopspring5.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Speciality extends BaseEntity {
    @Builder
    public Speciality(Long id, String description){
        super(id);
        this.description = description;
    }
    private String description;
}
