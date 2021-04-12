package panandafog.wholesale_company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;
import panandafog.wholesale_company.controller.response.SimpleResponse;
import panandafog.wholesale_company.model.Rack2;
import panandafog.wholesale_company.service.Warehouse2Service;

import java.util.List;

@RestController
@RequestMapping("/warehouse2")
public class Warehouse2RestController {
    @Autowired
    private Warehouse2Service service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    public List<Rack2> getAllRacks() {
        List<Rack2> tmp = null;
        try {
            tmp = service.getAll();
        } catch (Exception ex) {
            System.out.println("Exception in get all racks2");
            System.out.println(ex.getMessage());
        }
        return tmp;
    }

    @PostMapping(value = "/save")
    public SimpleResponse addOrUpdateGood(@RequestBody Rack2 rack) {
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
    public SimpleResponse deleteGoodById(@RequestBody Rack2 rack) {
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
