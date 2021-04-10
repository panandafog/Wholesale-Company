package panandafog.wholesale_company.service;

import panandafog.wholesale_company.model.Rack1;
import panandafog.wholesale_company.model.Sale;
import panandafog.wholesale_company.repository.Warehouse1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Warehouse1Service {
    @Autowired
    private Warehouse1Repository repository;

    public List<Rack1> getAll() {
        List<Rack1> tmp = new ArrayList<>();
        repository.findAll().forEach(tmp::add);
        return tmp;
    }
}
