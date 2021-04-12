package panandafog.wholesale_company.repository;

import panandafog.wholesale_company.model.Good;
import org.springframework.data.repository.CrudRepository;

public interface GoodRepository extends CrudRepository<Good, Long> {
}

