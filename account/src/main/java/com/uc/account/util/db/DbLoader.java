package com.uc.account.util.db;

import com.uc.account.model.entity.Address;
import com.uc.account.model.entity.Customer;
import com.uc.account.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;

@Transactional
@Component
@RequiredArgsConstructor
public class DbLoader implements CommandLineRunner {

    private final CustomerRepository customerRepository;


    @Override
    public void run(String... args) throws Exception {

        if (0 == customerRepository.count()) {
            Customer customer = new Customer();
            customer.setFirstname("Hüdai");
            customer.setLastname("Apa");
            customer.setPhone("+905469635689");
           customer.setPassword(new BCryptPasswordEncoder().encode("123456"));
            Address address= Address.builder()
                    .country("Türkiye")
                    .province("Denizli")
                    .district("Pamukkale")
                    .neighborhood("Asmalıevler")
                    .street("6661")
                    .buildingInformation("No:23 Kat:1 Daire:1")
                    .build();
            customer.setAddress(address);
            customerRepository.save(customer);
        }
        Customer customer1=customerRepository.findAll().get(0);
    }
}
