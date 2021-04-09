package panandafog.wholesale_company.controller;

import panandafog.wholesale_company.model.Good;
import panandafog.wholesale_company.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsRestController {
    @Autowired
    private GoodService service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    public List<Good> getAllGoods() {
        List<Good> tmp = null;
        try {
            tmp = service.getAll();
        } catch (Exception ex) {
            System.out.println("Exception in get all");
        }
        return tmp;
    }
}

