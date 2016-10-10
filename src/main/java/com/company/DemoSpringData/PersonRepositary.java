package com.company.DemoSpringData;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepositary extends CrudRepository<Person, Long> {
	List<Person> findByCountryContains(String country);
}
