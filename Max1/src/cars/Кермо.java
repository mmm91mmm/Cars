package cars;

public class Кермо {
	private Rozmir rozmir;
	private boolean batton;
	public Кермо(Rozmir rozmir, boolean batton) {
		this.rozmir = rozmir;
		this.batton = batton;
	}
	public void changeRozmir(Rozmir rozmir){
		this.rozmir = rozmir;
	}
	
	public Rozmir getRozmir() {
		return rozmir;
	}
	public void setRozmir(Rozmir rozmir) {
		this.rozmir = rozmir;
	}
	public boolean isBatton() {
		return batton;
	}
	public void setBatton(boolean batton) {
		this.batton = batton;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (batton ? 1231 : 1237);
		result = prime * result + ((rozmir == null) ? 0 : rozmir.hashCode());
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
		Кермо other = (Кермо) obj;
		if (batton != other.batton)
			return false;
		if (rozmir != other.rozmir)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Кермо [rozmir=" + rozmir + ", batton=" + batton + "]";
	}


	
}
