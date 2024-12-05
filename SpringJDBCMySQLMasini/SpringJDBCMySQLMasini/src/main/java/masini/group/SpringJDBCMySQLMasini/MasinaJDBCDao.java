package masini.group.SpringJDBCMySQLMasini;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class MasinaJDBCDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int insert(Masina m) {
		String sql = "insert into masini values(?,?,?,?,?)";
		return jdbcTemplate.update(sql, m.getInmatriculare(), m.getMarca(), m.getAn(), m.getCuloare(), m.getNr_km());
	}
	
	public List<Masina> findAll() {
		String sql = "select * from masini";
		return jdbcTemplate.query(sql, new MasinaMapper());
	}
	
	public Masina findByInmatriculare(String inmatriculare) {
		String sql = "select * from masini where inmatriculare=?";
		return jdbcTemplate.queryForObject(sql, new MasinaMapper(), inmatriculare);
	}
	
	public int deleteByInmatriculare(String inmatriculare) {
		String sql = "delete from persoane where inmatriculare=?";
		return jdbcTemplate.update(sql, inmatriculare);
	}


}
