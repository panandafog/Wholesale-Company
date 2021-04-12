package panandafog.wholesale_company.service;

import panandafog.wholesale_company.model.Rack1;
import panandafog.wholesale_company.repository.Warehouse1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Warehouse1Service {
    @Autowired
    private Warehouse1Repository repository;

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void save(Rack1 rack) {
        repository.save(rack);
    }

    public List<Rack1> getAll() {
        List<Rack1> tmp = new ArrayList<>();
        repository.findAll().forEach(tmp::add);
        return tmp;
    }
}
