package panandafog.wholesale_company.repository;

import panandafog.wholesale_company.model.Good;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface GoodRepository extends CrudRepository<Good, Long> {
    List<Good> findByName(String name);
}

