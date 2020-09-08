package com.example.repository;

import java.util.List;

import com.example.dto.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CompanyRepository extends CrudRepository<Company, Long> {

    List<Company> findByName(String name);

    List<Company> findByAddressAndSalary(String address, long salary);

    Company findById(long id);
}
