package cars;


public class ������ {
	
	private String name;
	private final ����� ����o;
	private final ������ ������;
	private final ����� �����;
	
	public ������(String name, Rozmir rozmir, Boolean batton, int diametr, Rezina rezina, Color kolir, String type) {
		this.name = name;
		this.����o = new �����(rozmir,batton);
		this.������ = new ������ (diametr, rezina);
		this.����� = new ����� (kolir,type);
	}
	public void changeRozmir(Rozmir rozmir){
		����o.changeRozmir(rozmir);
	}
	
	public void increaseDiametr(int value) {
		������.increaseDiametr(value);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void changeRezina(Rezina rezina) {
		������.changeRezina(rezina);
	}
	public Rezina getRezina() {
		return ������.getRezina();
	}
	public String getType() {
		return �����.getType();
	}
	public void changeKolir(Color kolir) {
		�����.changeKolir(kolir);
	}
	public void changeName(String name){
		this.name = name;
	}

	public void setDiametr(int diametr) {
		������.setDiametr(diametr);
	}
	public boolean isBatton() {
		return ����o.isBatton();
	}
	public Rozmir getRozmir() {
		return ����o.getRozmir();
	}
	public Color getKolir() {
		return �����.getKolir();
	}
	public int getDiametr() {
		return ������.getDiametr();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((����o == null) ? 0 : ����o.hashCode());
		result = prime * result + ((������ == null) ? 0 : ������.hashCode());
		result = prime * result + ((����� == null) ? 0 : �����.hashCode());
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
		������ other = (������) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (����o == null) {
			if (other.����o != null)
				return false;
		} else if (!����o.equals(other.����o))
			return false;
		if (������ == null) {
			if (other.������ != null)
				return false;
		} else if (!������.equals(other.������))
			return false;
		if (����� == null) {
			if (other.����� != null)
				return false;
		} else if (!�����.equals(other.�����))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "������ name=" + name + ����o  + ������  + �����;
	}
	
}
