package cars;

public class Колесо {
	
	private int diametr;
	private Rezina rezina;
	
	public Колесо(int diametr, Rezina rezina) {
		this.diametr = diametr;
		this.rezina = rezina;
	}
	public void increaseDiametr(int value){
		diametr = diametr+value;
	}
	public void changeRezina(Rezina rezina){
		this.rezina=rezina;
	}
	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}
	public int getDiametr() {
		return diametr;
	}

	public Rezina getRezina() {
		return rezina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diametr;
		result = prime * result + ((rezina == null) ? 0 : rezina.hashCode());
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
		Колесо other = (Колесо) obj;
		if (diametr != other.diametr)
			return false;
		if (rezina != other.rezina)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Колесо [diametr=" + diametr + ", rezina=" + rezina + "]";
	}
}
