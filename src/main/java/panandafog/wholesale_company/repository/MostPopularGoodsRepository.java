package panandafog.wholesale_company.repository;

import org.springframework.data.repository.CrudRepository;
import panandafog.wholesale_company.model.GoodWithCount;

public interface MostPopularGoodsRepository extends CrudRepository<GoodWithCount, Long> {
}
