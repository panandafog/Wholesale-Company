package panandafog.wholesale_company.service;

import panandafog.wholesale_company.model.Good;
import panandafog.wholesale_company.repository.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodService {
    @Autowired
    private GoodRepository repository;

//    public Good getByName(String name) {
//        return repository.findByName(name);
//    }

    public List<Good> getAll() {
        List<Good> tmp = new ArrayList<Good>();
        repository.findAll().forEach(tmp::add);
        return tmp;
    }
}
