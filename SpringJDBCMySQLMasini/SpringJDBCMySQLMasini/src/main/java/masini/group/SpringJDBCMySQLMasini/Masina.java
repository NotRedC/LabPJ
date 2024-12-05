package masini.group.SpringJDBCMySQLMasini;

public class Masina {
	private String inmatriculare;
	private int an;
	private String marca;
	private String culoare;
	private int nr_km;
	
	public Masina() {}
	
	public Masina(String inmatriculare, int an, String marca, String culoare, int nr_km) {
		super();
		this.inmatriculare = inmatriculare;
		this.an = an;
		this.marca = marca;
		this.culoare = culoare;
		this.nr_km = nr_km;
	}

	public String getInmatriculare() {
		return inmatriculare;
	}

	public void setInmatriculare(String inmatriculare) {
		this.inmatriculare = inmatriculare;
	}

	public int getAn() {
		return an;
	}

	public void setAn(int an) {
		this.an = an;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCuloare() {
		return culoare;
	}

	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}

	public int getNr_km() {
		return nr_km;
	}

	public void setNr_km(int nr_km) {
		this.nr_km = nr_km;
	}

	@Override
	public String toString() {
		return "Masina [inmatriculare=" + inmatriculare + ", an=" + an + ", marca=" + marca + ", culoare=" + culoare
				+ ", nr_km=" + nr_km + "]";
	}
	
	
	
	

}
