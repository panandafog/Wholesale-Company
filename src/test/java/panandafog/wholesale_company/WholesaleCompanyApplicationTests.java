package panandafog.wholesale_company;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import panandafog.wholesale_company.model.Good;
import panandafog.wholesale_company.repository.GoodRepository;

import javax.sql.DataSource;

@SpringBootTest
class WholesaleCompanyApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    GoodRepository goodRepository;

    @Test
    void contextLoads() {
        System.out.println("DATASOURCE = " + dataSource);

        System.out.println("\n1.findAll()...");
        for (Good good: goodRepository.findAll()) {
            System.out.println(good.getName());
        }

        System.out.println("Done!");
    }
}
