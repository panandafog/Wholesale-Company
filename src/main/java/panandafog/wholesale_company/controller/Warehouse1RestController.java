package panandafog.wholesale_company.controller;

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
}
