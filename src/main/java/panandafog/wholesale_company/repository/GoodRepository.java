package panandafog.wholesale_company.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import panandafog.wholesale_company.model.DailyDemand;
import panandafog.wholesale_company.model.Good;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GoodRepository extends CrudRepository<Good, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM table(market_analysis.demand_forecast_2(:min_time, :max_time, :good_id))")
    List<DailyDemand> getDemand(@Param("min_time") java.sql.Timestamp min_time, @Param("max_time") java.sql.Timestamp max_time, @Param("good_id") int good_id);
}

