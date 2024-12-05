package masini.group.SpringJDBCMySQLMasini;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class MasinaMapper implements RowMapper<Masina> {
	@Override
	public Masina mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Masina(rs.getString("inmatriculare"), rs.getInt("an"), rs.getString("marca"), rs.getString("culoare"), rs.getInt("nr_km"));
	}
}
