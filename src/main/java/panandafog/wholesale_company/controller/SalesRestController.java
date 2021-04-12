package panandafog.wholesale_company.controller;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import panandafog.wholesale_company.controller.response.SimpleResponse;
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

    @PostMapping(value = "/save")
    public SimpleResponse addOrUpdateGood(@RequestBody Sale sale) {
        try {
            service.save(sale);
        } catch (DataIntegrityViolationException ex) {
            return new SimpleResponse(false, "Такой товар уже существует");
        } catch (Exception ex) {
            return new SimpleResponse(false, "Неизвестная ошибка");
        }
        return new SimpleResponse(true);
    }

    @PostMapping(value = "/delete/by/id")
    public SimpleResponse deleteGoodById(@RequestBody Sale sale) {
        try {
            service.deleteById(sale.getId());
        } catch (DataIntegrityViolationException ex) {
            return new SimpleResponse(false, "Этот товар существует в других таблицах");
        } catch (EmptyResultDataAccessException ex) {
            return new SimpleResponse(false, "Такой товар не существует");
        } catch (Exception ex) {
            return new SimpleResponse(false, "Неизвестная ошибка");
        }
        return new SimpleResponse(true);
    }
}
