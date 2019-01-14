package progres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import progres.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
