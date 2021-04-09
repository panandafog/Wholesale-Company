package panandafog.wholesale_company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import panandafog.wholesale_company.repository.GoodRepository;
import panandafog.wholesale_company.model.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

@SpringBootApplication
public class WholesaleCompanyApplication {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    DataSource dataSource;

    @Autowired
    GoodRepository goodRepository;

    public static void main(String[] args) {
        SpringApplication.run(WholesaleCompanyApplication.class, args);
    }
}
