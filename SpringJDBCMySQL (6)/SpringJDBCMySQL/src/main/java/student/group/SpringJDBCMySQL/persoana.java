package student.group.SpringJDBCMySQL;

public class persoana {
	private int id;
	private String nume;
	private int varsta;
	public persoana() {}
	public persoana(int id, String nume, int varsta) {
			super();
			this.id = id;
			this.nume = nume;
			this.varsta = varsta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	@Override
	public String toString() {
		return "persoana [id=" + id + ", nume=" + nume + ", varsta=" + varsta + "]";
	}
	

}
