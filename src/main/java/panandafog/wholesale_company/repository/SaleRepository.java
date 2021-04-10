package panandafog.wholesale_company.repository;

import panandafog.wholesale_company.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
