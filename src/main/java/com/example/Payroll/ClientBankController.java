package com.example.Payroll;

import java.util.List;

import com.example.Payroll.Repositories.ClientBankRepository;
import com.example.Payroll.model.ClientBank;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "api/clientbanks1")
class ClientBankController {

    private final ClientBankRepository repository;

    @Autowired
    ClientBankController(ClientBankRepository repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/clientbanks")
    List<ClientBank> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/clientbanks")
    ClientBank newclientBank(@RequestBody ClientBank newClientBank) {
        return repository.save(newClientBank);
    }

    // Single item

    @GetMapping("/clientbanks/{id}")
    ClientBank one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new ClientBankNotFoundException(id));
    }

    @PutMapping("/clientbanks/{id}")
    ClientBank replaceClientBank(@RequestBody ClientBank newClientBank, @PathVariable Long id) {

        return repository.findById(id)
                .map(clientBank -> {
                    clientBank.setName(newClientBank.getName());
                    clientBank.setBalance(newClientBank.getBalance());
                    return repository.save(clientBank);
                })
                .orElseGet(() -> {
                    newClientBank.setId(id);
                    return repository.save(newClientBank);
                });
    }

    @DeleteMapping("/clientbanks/{id}")
    void deleteClientBank(@PathVariable Long id) {
        repository.deleteById(id);
    }
}