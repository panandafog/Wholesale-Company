package panandafog.wholesale_company.service;

import panandafog.wholesale_company.model.Good;
import panandafog.wholesale_company.model.Sale;
import panandafog.wholesale_company.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;

    public List<Sale> getAll() {
        List<Sale> tmp = new ArrayList<>();
        repository.findAll().forEach(tmp::add);
        return tmp;
    }
}
