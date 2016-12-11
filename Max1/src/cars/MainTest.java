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
		String expected = "������";
		������ m = new ������ ("adsfsf", Rozmir.BIG,true, 150, Rezina.SUMMER, Color.BLACK, "gruzova");
		m.changeName(expected);
		String actual = m.getName();
		assertEquals(expected, actual);
	}

	@Test
	public void changeRul(){
	������ m = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.RED, "cabriolet");
	List<������> listz = new ArrayList<>();
	listz.add(m);
	Rozmir expected = Rozmir.LITTLE;
	Main.changeRul(listz);
	Rozmir actual = m.getRozmir();
	assertEquals(expected, actual);
	}
	
	@Test
	public void changeRul2(){
	������ m = new ������ ("������2 ", Rozmir.LITTLE,true, 10, Rezina.WINTER,Color.RED, "cabriolet");
	List<������> listz = new ArrayList<>();
	listz.add(m);
	Rozmir expected = Rozmir.BIG;
	Main.changeRul(listz);
	Rozmir actual = m.getRozmir();
	assertEquals(expected, actual);
	}
	
	@Test
	public void changeRul3(){
	������ m = new ������ ("������3 ", Rozmir.NORMAL,true, 10, Rezina.WINTER,Color.RED, "cabriolet");
	List<������> listz = new ArrayList<>();
	listz.add(m);
	Rozmir expected = Rozmir.BIG;
	Main.changeRul(listz);
	Rozmir actual = m.getRozmir();
	assertEquals(expected, actual);
	}
	
	@Test
	public void changeRul4(){
	������ m = new ������ ("������4 ", Rozmir.NORMAL,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
	List<������> list = new ArrayList<>();
	list.add(m);
	Rozmir expected = m.getRozmir();
	Main.changeRul(list);
	Rozmir actual = m.getRozmir();
	assertEquals(expected, actual);
	}
	
	@Test
	public void typeOfCuzov(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.typeOfCuzov(list, "cabriolet");
		assertEquals(2, list.size()-3);
	}
	@Test
	public void findDiameter(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.findDiameter(list, 55);
		assertEquals(1, list.size()-4);
	}
	@Test
	public void findDiameterAndColor(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.findDiameterAndColor(list, 20, "RED");
	}
	@Test
	public void findDiameterAndColor2(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.findDiameterAndColor(list, 90, "RED");
	}
	@Test
	public void findDiameterAndColor3(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.findDiameterAndColor(list, 20, "SILVER");
	}
	@Test
	public void changeCar(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.changeCar(list, 21);
		assertEquals(5, list.size());
	}
	@Test
	public void kuzov(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.kuzov(list, "cabriolet");
		assertEquals(2, list.size()-3);
	}
	@Test
	public void color(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.color(list, "RED");
	}
	@Test
	public void diapazon(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.diapazon(list, 22, 7);
		}
	@Test
	public void diapazonAndWhell(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		LogicCar.diapazonAndWhell(list, 49, 9, "cabriolet");
		}
	@Test
	public void buttons(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		Main.buttons(list);
		assertEquals(5, list.size());
	}
	@Test
	public void increaseDiametr(){
		������ m = new ������ ("adsfsf", Rozmir.BIG,true, 150, Rezina.SUMMER, Color.BLACK, "gruzova");
		m.increaseDiametr(50);
		int expected = 200;
		int actual = m.getDiametr();
		assertEquals(expected, actual);
	}
	@Test
	public void changeKolir(){
		������ m = new ������ ("adsfsf", Rozmir.BIG,true, 150, Rezina.SUMMER, Color.BLACK, "gruzova");
		m.changeKolir(Color.GREEN);
		Color expected = Color.GREEN;
		Color actual = m.getKolir();
		assertEquals(expected, actual);
	}
	@Test
	public void typeOfCuzovAndDiapazonDiametr(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<������> cars = new LinkedHashSet<>();
		cars.add(������1);
		cars.add(������2);
		cars.add(������3);
		cars.add(������4);
		cars.add(������5);
		cars.add(������1);
		cars.add(������2);
		LogicCar.typeOfCuzovAndDiapazonDiametr(cars, 31, 9, "BLACK");
	}
	@Test
	public void typeOfCuzovAndDiapazonDiametr2(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<������> cars = new LinkedHashSet<>();
		cars.add(������1);
		cars.add(������2);
		cars.add(������3);
		cars.add(������4);
		cars.add(������5);
		cars.add(������1);
		cars.add(������2);
		LogicCar.typeOfCuzovAndDiapazonDiametr(cars, 9, 9, "RED");
	}
	@Test
	public void diapazonRemoved(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<������> cars = new LinkedHashSet<>();
		cars.add(������1);
		cars.add(������2);
		cars.add(������3);
		cars.add(������4);
		cars.add(������5);
		cars.add(������1);
		cars.add(������2);
		LogicCar.diapazonRemoved(cars, 31, 9);
	}
	@Test
	public void diapazonRemoved2(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<������> cars = new LinkedHashSet<>();
		cars.add(������1);
		cars.add(������2);
		cars.add(������3);
		cars.add(������4);
		cars.add(������5);
		cars.add(������1);
		cars.add(������2);
		LogicCar.diapazonRemoved(cars, 9, 9);
	}
	@Test
	public void TypeTireAndDiapazon(){
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 25, Rezina.SUMMER,Color.RED, "legkova");
		Set<������> cars = new LinkedHashSet<>();
		cars.add(������1);
		cars.add(������2);
		cars.add(������3);
		cars.add(������4);
		cars.add(������5);
		cars.add(������1);
		cars.add(������2);
		LogicCar.TypeTireAndDiapazon(cars, 31, 9, "SUMMER");
	}
}