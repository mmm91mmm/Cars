package cars;

public class Кузов {
	private Color kolir;
	private String type;
	public Кузов(Color kolir, String type) {
		this.kolir = kolir;
		this.type = type;
	}
	public void changeKolir(Color kolir){
		this.kolir = kolir;
	}
	public Color getKolir() {
		return kolir;
	}
	public void setKolir(Color kolir) {
		this.kolir = kolir;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kolir == null) ? 0 : kolir.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Кузов other = (Кузов) obj;
		if (kolir != other.kolir)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Кузов [kolir=" + kolir + ", type=" + type + "]";
	}

	
}
