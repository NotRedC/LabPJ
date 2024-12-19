package com.example.SpringBootLab12Real;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EvenimentController {
	@Autowired
	EvenimentRepository repository;

	@GetMapping("jpa/evenimente")
	public List<Eveniment> findAll() {
		return repository.findAll();
	}

	@GetMapping("jpa/evenimente/{id}")
	public Eveniment findById(@PathVariable int id) {
		Optional<Eveniment> optionalEveniment = repository.findById(id);
		if (optionalEveniment.isPresent())
			return optionalEveniment.get();
		else
			throw new EvenimentNotFoundException("Persoana cu id-ul " + id + " nu a fost gasita");
	}

	@PostMapping("jpa/evenimente")
	public ResponseEntity<Eveniment> savePerson(@RequestBody Eveniment eveniment) {
		System.out.println(eveniment);
		repository.save(eveniment);
		return ResponseEntity.ok(eveniment);
	}

	@DeleteMapping("jpa/evenimente/{id}")
	public void deleteById(@PathVariable int id) {
		repository.deleteById(id);
	}
}
