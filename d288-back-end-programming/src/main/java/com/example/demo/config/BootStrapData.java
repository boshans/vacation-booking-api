package com.example.demo.config;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public BootStrapData(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (customerRepository.count() == 1) {
            Customer edward = new Customer();
            edward.setFirstName("Edward");
            edward.setLastName("Elric");
            edward.setAddress("834 Fullmetal Drive");
            edward.setPhone("4192635");
            edward.setPostal_code("11590");
            edward.setDivision(divisionRepository.getReferenceById(12L));

            customerRepository.save(edward);

            Customer jack = new Customer();
            jack.setFirstName("Jack");
            jack.setLastName("Shepard");
            jack.setAddress("909 Oriole Avenue");
            jack.setPhone("3462872");
            jack.setPostal_code("11501");
            jack.setDivision(divisionRepository.getReferenceById(46L));

            customerRepository.save(jack);

            Customer thomas = new Customer();
            thomas.setFirstName("Thomas");
            thomas.setLastName("Boshans");
            thomas.setAddress("42 Bacon Way");
            thomas.setPhone("9874528");
            thomas.setPostal_code("90210");
            thomas.setDivision(divisionRepository.getReferenceById(26L));

            customerRepository.save(thomas);

            Customer garrus = new Customer();
            garrus.setFirstName("Garrus");
            garrus.setLastName("Vakarian");
            garrus.setAddress("7 Citadel Drive");
            garrus.setPhone("9272648");
            garrus.setPostal_code("21973");
            garrus.setDivision(divisionRepository.getReferenceById(31L));

            customerRepository.save(garrus);

            Customer wrex = new Customer();
            wrex.setFirstName("Wrex");
            wrex.setLastName("Urdnot");
            wrex.setAddress("240 Howard Court");
            wrex.setPhone("8675309");
            wrex.setPostal_code("47893");
            wrex.setDivision(divisionRepository.getReferenceById(61L));

            customerRepository.save(wrex);
        }
    }
}