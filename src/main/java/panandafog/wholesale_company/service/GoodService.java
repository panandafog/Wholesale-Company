package panandafog.wholesale_company.service;

import panandafog.wholesale_company.model.DailyDemand;
import panandafog.wholesale_company.model.Good;
import panandafog.wholesale_company.model.GoodWithCount;
import panandafog.wholesale_company.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import panandafog.wholesale_company.repository.MostPopularGoodsRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodService {
    @Autowired
    private GoodRepository repository;
    @Autowired
    private MostPopularGoodsRepository mostPopularGoodsRepository;

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void save(Good good) {
        repository.save(good);
    }

    public List<Good> getAll() {
        List<Good> tmp = new ArrayList<>();
        repository.findAll().forEach(tmp::add);
        return tmp;
    }

    public List<GoodWithCount> getMostPopular() {
        List<GoodWithCount> tmp = new ArrayList<>();
        mostPopularGoodsRepository.findAll().forEach(tmp::add);
        return tmp;
    }

    public List<DailyDemand> getDemand(java.sql.Timestamp min_time, java.sql.Timestamp max_time, int good_id) {
        return repository.getDemand(min_time, max_time, good_id);
    }
}
