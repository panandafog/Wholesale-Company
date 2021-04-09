package panandafog.wholesale_company.repository;

import panandafog.wholesale_company.model.Good;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface GoodRepository extends CrudRepository<Good, Long> {
    List<Good> findByName(String name);
}

