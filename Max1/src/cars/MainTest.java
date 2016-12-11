package cars;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class MainTest {
	
	
	@Test
	public void changeName(){
		String expected = "Ìàøèíà";
		Ìàøèíà m = new Ìàøèíà ("adsfsf", Rozmir.BIG,true, 150, Rezina.SUMMER, Color.BLACK, "gruzova");
		m.changeName(expected);
		String actual = m.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void changeRul(){
	Ìàøèíà m = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.RED, "cabriolet");
	List<Ìàøèíà> listz = new ArrayList<>();
	listz.add(m);
	Rozmir expected = Rozmir.LITTLE;
	Main.changeRul(listz);
	Rozmir actual = m.getRozmir();
	assertEquals(expected, actual);
	}
	
	@Test
	public void changeRul2(){
	Ìàøèíà m = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.LITTLE,true, 10, Rezina.WINTER,Color.RED, "cabriolet");
	List<Ìàøèíà> listz = new ArrayList<>();
	listz.add(m);
	Rozmir expected = Rozmir.BIG;
	Main.changeRul(listz);
	Rozmir actual = m.getRozmir();
	assertEquals(expected, actual);
	}
	
	@Test
	public void changeRul3(){
	Ìàøèíà m = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.NORMAL,true, 10, Rezina.WINTER,Color.RED, "cabriolet");
	List<Ìàøèíà> listz = new ArrayList<>();
	listz.add(m);
	Rozmir expected = Rozmir.BIG;
	Main.changeRul(listz);
	Rozmir actual = m.getRozmir();
	assertEquals(expected, actual);
	}
	
	@Test
	public void changeRul4(){
	Ìàøèíà m = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
	List<Ìàøèíà> list = new ArrayList<>();
	list.add(m);
	Rozmir expected = m.getRozmir();
	Main.changeRul(list);
	Rozmir actual = m.getRozmir();
	assertEquals(expected, actual);
	}
	
	@Test
	public void typeOfCuzov(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.typeOfCuzov(list, "cabriolet");
		assertEquals(2, list.size()-3);
	}
	@Test
	public void findDiameter(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.findDiameter(list, 55);
		assertEquals(1, list.size()-4);
	}
	@Test
	public void findDiameterAndColor(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.findDiameterAndColor(list, 20, "RED");
	}
	@Test
	public void findDiameterAndColor2(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.findDiameterAndColor(list, 90, "RED");
	}
	@Test
	public void findDiameterAndColor3(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.findDiameterAndColor(list, 20, "SILVER");
	}
	@Test
	public void changeCar(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.changeCar(list, 21);
		assertEquals(5, list.size());
	}
	@Test
	public void kuzov(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.kuzov(list, "cabriolet");
		assertEquals(2, list.size()-3);
	}
	@Test
	public void color(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.color(list, "RED");
	}
	@Test
	public void diapazon(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.diapazon(list, 22, 7);
		}
	@Test
	public void diapazonAndWhell(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		LogicCar.diapazonAndWhell(list, 49, 9, "cabriolet");
		}
	@Test
	public void buttons(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<Ìàøèíà> list = new ArrayList<>();
		list.add(ìàøèíà1);
		list.add(ìàøèíà2);
		list.add(ìàøèíà3);
		list.add(ìàøèíà4);
		list.add(ìàøèíà5);
		Main.buttons(list);
		assertEquals(5, list.size());
	}
	@Test
	public void increaseDiametr(){
		Ìàøèíà m = new Ìàøèíà ("adsfsf", Rozmir.BIG,true, 150, Rezina.SUMMER, Color.BLACK, "gruzova");
		m.increaseDiametr(50);
		int expected = 200;
		int actual = m.getDiametr();
		assertEquals(expected, actual);
	}
	@Test
	public void changeKolir(){
		Ìàøèíà m = new Ìàøèíà ("adsfsf", Rozmir.BIG,true, 150, Rezina.SUMMER, Color.BLACK, "gruzova");
		m.changeKolir(Color.GREEN);
		Color expected = Color.GREEN;
		Color actual = m.getKolir();
		assertEquals(expected, actual);
	}
	@Test
	public void typeOfCuzovAndDiapazonDiametr(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<Ìàøèíà> cars = new LinkedHashSet<>();
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		cars.add(ìàøèíà3);
		cars.add(ìàøèíà4);
		cars.add(ìàøèíà5);
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		LogicCar.typeOfCuzovAndDiapazonDiametr(cars, 31, 9, "BLACK");
	}
	@Test
	public void typeOfCuzovAndDiapazonDiametr2(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<Ìàøèíà> cars = new LinkedHashSet<>();
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		cars.add(ìàøèíà3);
		cars.add(ìàøèíà4);
		cars.add(ìàøèíà5);
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		LogicCar.typeOfCuzovAndDiapazonDiametr(cars, 9, 9, "RED");
	}
	@Test
	public void diapazonRemoved(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<Ìàøèíà> cars = new LinkedHashSet<>();
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		cars.add(ìàøèíà3);
		cars.add(ìàøèíà4);
		cars.add(ìàøèíà5);
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		LogicCar.diapazonRemoved(cars, 31, 9);
	}
	@Test
	public void diapazonRemoved2(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<Ìàøèíà> cars = new LinkedHashSet<>();
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		cars.add(ìàøèíà3);
		cars.add(ìàøèíà4);
		cars.add(ìàøèíà5);
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		LogicCar.diapazonRemoved(cars, 9, 9);
	}
	@Test
	public void TypeTireAndDiapazon(){
		Ìàøèíà ìàøèíà1 = new Ìàøèíà ("Ìàøèíà1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Ìàøèíà ìàøèíà2 = new Ìàøèíà ("Ìàøèíà2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Ìàøèíà ìàøèíà3 = new Ìàøèíà ("Ìàøèíà3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Ìàøèíà ìàøèíà4 = new Ìàøèíà ("Ìàøèíà4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Ìàøèíà ìàøèíà5 = new Ìàøèíà ("Ìàøèíà5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<Ìàøèíà> cars = new LinkedHashSet<>();
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		cars.add(ìàøèíà3);
		cars.add(ìàøèíà4);
		cars.add(ìàøèíà5);
		cars.add(ìàøèíà1);
		cars.add(ìàøèíà2);
		LogicCar.TypeTireAndDiapazon(cars, 31, 9, "SUMMER");
	}
}