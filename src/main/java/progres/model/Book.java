package progres.model;

import lombok.Data;
import javax.persistence.Entity;

@Entity
@Data
public class Book extends BaseEntity {

    private String bookName;
    private String authorName;
    private String authorSurname;
}


