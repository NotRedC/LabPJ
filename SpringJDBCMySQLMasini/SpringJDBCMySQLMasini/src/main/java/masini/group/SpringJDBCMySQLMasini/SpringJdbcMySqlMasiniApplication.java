package masini.group.SpringJDBCMySQLMasini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcMySqlMasiniApplication implements CommandLineRunner {
	
	@Autowired
	MasinaJDBCDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcMySqlMasiniApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		System.out.println("\nAdauga masina numarul de randuri adaugate: " + dao.insert(new Masina("tm20abc", 2020, "Lamborghini", "rosu", 3000)));
		System.out.println("\nToate masinile:");
		dao.findAll().forEach(System.out::println);
		System.out.println("\nMasina cu numerele TM12XDD:" + dao.findByInmatriculare("tm12xdd"));
	}
	

}
