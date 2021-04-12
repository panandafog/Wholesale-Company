package panandafog.wholesale_company.controller;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import panandafog.wholesale_company.controller.response.SimpleResponse;
import panandafog.wholesale_company.model.Rack1;
import panandafog.wholesale_company.service.Warehouse1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warehouse1")
public class Warehouse1RestController {
    @Autowired
    private Warehouse1Service service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    public List<Rack1> getAllRacks() {
        List<Rack1> tmp = null;
        try {
            tmp = service.getAll();
        } catch (Exception ex) {
            System.out.println("Exception in get all racks1");
            System.out.println(ex.getMessage());
        }
        return tmp;
    }

    @PostMapping(value = "/save")
    public SimpleResponse addOrUpdateGood(@RequestBody Rack1 rack) {
        try {
            service.save(rack);
        } catch (DataIntegrityViolationException ex) {
            return new SimpleResponse(false, "Такой товар уже существует");
        } catch (Exception ex) {
            return new SimpleResponse(false, "Неизвестная ошибка");
        }
        return new SimpleResponse(true);
    }

    @PostMapping(value = "/delete/by/id")
    public SimpleResponse deleteGoodById(@RequestBody Rack1 rack) {
        try {
            service.deleteById(rack.getId());
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
