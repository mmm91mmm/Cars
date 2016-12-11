package cars;


public class Машина {
	
	private String name;
	private final Кермо кермo;
	private final Колесо колесо;
	private final Кузов кузов;
	
	public Машина(String name, Rozmir rozmir, Boolean batton, int diametr, Rezina rezina, Color kolir, String type) {
		this.name = name;
		this.кермo = new Кермо(rozmir,batton);
		this.колесо = new Колесо (diametr, rezina);
		this.кузов = new Кузов (kolir,type);
	}
	public void changeRozmir(Rozmir rozmir){
		кермo.changeRozmir(rozmir);
	}
	
	public void increaseDiametr(int value) {
		колесо.increaseDiametr(value);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void changeRezina(Rezina rezina) {
		колесо.changeRezina(rezina);
	}
	public Rezina getRezina() {
		return колесо.getRezina();
	}
	public String getType() {
		return кузов.getType();
	}
	public void changeKolir(Color kolir) {
		кузов.changeKolir(kolir);
	}
	public void changeName(String name){
		this.name = name;
	}

	public void setDiametr(int diametr) {
		колесо.setDiametr(diametr);
	}
	public boolean isBatton() {
		return кермo.isBatton();
	}
	public Rozmir getRozmir() {
		return кермo.getRozmir();
	}
	public Color getKolir() {
		return кузов.getKolir();
	}
	public int getDiametr() {
		return колесо.getDiametr();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((кермo == null) ? 0 : кермo.hashCode());
		result = prime * result + ((колесо == null) ? 0 : колесо.hashCode());
		result = prime * result + ((кузов == null) ? 0 : кузов.hashCode());
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
		Машина other = (Машина) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (кермo == null) {
			if (other.кермo != null)
				return false;
		} else if (!кермo.equals(other.кермo))
			return false;
		if (колесо == null) {
			if (other.колесо != null)
				return false;
		} else if (!колесо.equals(other.колесо))
			return false;
		if (кузов == null) {
			if (other.кузов != null)
				return false;
		} else if (!кузов.equals(other.кузов))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Машина name=" + name + кермo  + колесо  + кузов;
	}
	
}
