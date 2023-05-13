package com.example.sb3.demo;

import com.example.sb3.demo.model.Customer;
import com.example.sb3.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Sb3RestController {
    @Autowired
    CustomerService customerService;

    @GetMapping("hello")
    public HelloResponse greet() {
        return new HelloResponse("hi", List.of("Java", "GoLang", "Python"), new Person("John", 89));
    }

    @GetMapping("customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PostMapping("add")
    public void addCustomer(@RequestBody AddCustomerRequest request) {
        Customer customer = new Customer();
        customer.setName(request.name());
        customer.setAge(request.age());
        customer.setEmail(request.email());

        customerService.addCustomer(customer);
    }

    record AddCustomerRequest(String name, String email, Integer age) {}

    record Person(String name, int age) {}

    record HelloResponse(
            String greet,
            List<String> languages,
            Person person) {
    }

}
