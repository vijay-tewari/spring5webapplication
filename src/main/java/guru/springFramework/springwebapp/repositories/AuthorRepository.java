package guru.springFramework.springwebapp.repositories;

import guru.springFramework.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
