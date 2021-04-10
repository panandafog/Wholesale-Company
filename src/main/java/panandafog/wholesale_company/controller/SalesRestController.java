package panandafog.wholesale_company.controller;

import panandafog.wholesale_company.model.Sale;
import panandafog.wholesale_company.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesRestController {
    @Autowired
    private SaleService service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    public List<Sale> getAllSales() {
        List<Sale> tmp = null;
        try {
            tmp = service.getAll();
        } catch (Exception ex) {
            System.out.println("Exception in get all sales");
            System.out.println(ex.getMessage());
        }
        return tmp;
    }
}
