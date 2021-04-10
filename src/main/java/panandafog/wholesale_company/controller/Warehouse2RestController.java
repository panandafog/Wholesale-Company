package panandafog.wholesale_company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
}
