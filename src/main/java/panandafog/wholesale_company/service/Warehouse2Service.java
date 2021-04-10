package panandafog.wholesale_company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import panandafog.wholesale_company.model.Rack2;
import panandafog.wholesale_company.repository.Warehouse2Repository;

import java.util.ArrayList;
import java.util.List;

@Service
public class Warehouse2Service {
    @Autowired
    private Warehouse2Repository repository;

    public List<Rack2> getAll() {
        List<Rack2> tmp = new ArrayList<>();
        repository.findAll().forEach(tmp::add);
        return tmp;
    }
}
