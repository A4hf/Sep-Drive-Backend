package com.example.sep_drive_backend.services;

import com.example.sep_drive_backend.constants.RoleEnum;
import com.example.sep_drive_backend.dto.RegistrationRequest;
import com.example.sep_drive_backend.models.Customer;
import com.example.sep_drive_backend.models.Driver;
import com.example.sep_drive_backend.repository.CustomerRepository;
import com.example.sep_drive_backend.repository.DriverRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final DriverRepository driverRepository;
    private final CustomerRepository customerRepository;

    public RegistrationService(DriverRepository driverRepository, CustomerRepository customerRepository) {
        this.driverRepository = driverRepository;
        this.customerRepository = customerRepository;
    }

    public void registerUser(RegistrationRequest request) {
        if (request.getRole() == RoleEnum.Customer) {
            Customer customer = new Customer();
            customer.setRole(request.getRole());
            customer.setUsername(request.getUsername());
            customer.setPassword(request.getPassword());
            customer.setEmail(request.getEmail());
            customer.setBirthDate(request.getBirthDate());
            customer.setFirstName(request.getFirstName());
            customer.setLastName(request.getLastName());

            customerRepository.save(customer);

        } else if (request.getRole() == RoleEnum.Driver) {
            Driver driver = new Driver();
            driver.setRole(request.getRole());
            driver.setUsername(request.getUsername());
            driver.setPassword(request.getPassword());
            driver.setEmail(request.getEmail());
            driver.setBirthDate(request.getBirthDate());
            driver.setFirstName(request.getFirstName());
            driver.setLastName(request.getLastName());

            driverRepository.save(driver);
        }
    }

}
