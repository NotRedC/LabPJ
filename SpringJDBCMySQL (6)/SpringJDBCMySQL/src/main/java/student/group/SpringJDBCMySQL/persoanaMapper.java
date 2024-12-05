package student.group.SpringJDBCMySQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class persoanaMapper implements RowMapper<persoana>{
	@Override
	public persoana mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new persoana(rs.getInt("id"), rs.getString("nume"), rs.getInt("varsta"));
	}
}
