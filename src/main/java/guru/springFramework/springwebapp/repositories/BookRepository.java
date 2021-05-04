package guru.springFramework.springwebapp.repositories;

import guru.springFramework.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
