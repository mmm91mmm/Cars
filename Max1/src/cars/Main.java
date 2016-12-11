package cars;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;





public class Main {
	 
	
	static void  changeRul(List<Машина> list){
		for (Машина машина : list) {
			if(машина.getKolir()== Color.RED){
				if(машина.getRozmir()==Rozmir.BIG){
					машина.changeRozmir(Rozmir.LITTLE);
				}else if(машина.getRozmir()==Rozmir.LITTLE){
					машина.changeRozmir(Rozmir.BIG);
				}else{
					машина.changeRozmir(Rozmir.BIG);
				}
			}
		}
		System.out.println(list);
	}
		static void  buttons(List<Машина> list){
		for (Машина машина : list) {
			if (машина.isBatton() == true){
				машина.setDiametr(машина.getDiametr()*2);
			}
		}
		System.out.println(list);
	}
		
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Машина машина1 = new Машина ("Машина1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		Машина машина2 = new Машина ("Машина2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		Машина машина3 = new Машина ("Машина3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		Машина машина4 = new Машина ("Машина4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		Машина машина5 = new Машина ("Машина5 ", Rozmir.BIG,false, 100, Rezina.SUMMER,Color.RED, "gruzova");
		Машина машина6 = new Машина ("Машина6 ", Rozmir.LITTLE,true, 45, Rezina.WINTER,Color.GREEN, "cabriolet");
		Машина машина7 = new Машина ("Машина7 ", Rozmir.NORMAL,false, 30, Rezina.SUMMER,Color.WHITE, "gruzova");
		List<Машина> list = new ArrayList<>();
		list.add(машина1);
		list.add(машина2);
		list.add(машина3);
		list.add(машина4);
		list.add(машина5);
		list.add(машина6);
		list.add(машина7);
		
		Set<Машина> cars = new LinkedHashSet<>();
		cars.add(машина1);
		cars.add(машина2);
		cars.add(машина3);
		cars.add(машина4);
		cars.add(машина5);
		cars.add(машина6);
		cars.add(машина7);
		
		
		maximumRadius(list);
		
		
		//findDiameter(list, sc);						//Знайти машини, які мають введений діаметр коліс.
		//findDiameterAndColor(list, sc);				//Знайти машини, які мають введений діаметр коліс та колір кузова.
		//changeRul(list);								//Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше.
		//buttons(list);								//Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.
		//changeCar(list, sc);							//Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини.
		//kuzov(list, sc);								//Знайти машини, які використовують введений тип кузова.
		//color(list, sc);								//Видалити з ліста усі машини, які мають введений колір кузова.
		//diapazon(list, sc);							//Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні шини на зимові.
		//diapazonAndWhell(list, sc);					//Видалити усі машини, які мають введений тип кузова та введений діапазон діаметра керма.
		//typeOfCuzov(list, sc);						//Запам'ятати індекси машин, які мають введений тип кузова.
		//typeOfCuzovAndDiapazonDiametr(cars, sc);		//Машинам, які мають вказаний колір кузова та вказаний діаметр колеса, змінити тип шин на вказаний.
		//diapazonRemoved(cars, sc);					//Видалити машини, діаметр колес яких попадає у вказаний діапазон.
		//TypeTireAndDiapazon(cars, sc);				//Знайти машини, які мають вказаний тип шин та діаметр коліс яких попадає у вказаний діапазон.
	}
	private static void maximumRadius(List<Машина> list) {
		LogicCar.maximumRadius(list);
		
	}
	static void typeOfCuzov(List<Машина> list, Scanner sc){  
		System.out.println("Введiть тип кузова");
		String cuzov =sc.next();
		LogicCar.typeOfCuzov(list, cuzov);
	}
	static void  findDiameter(List<Машина> list, Scanner sc){ 
		System.out.println("Введiть дiаметр колеса");
		int diam =sc.nextInt();
		LogicCar.findDiameter(list, diam);
			}
	static void  findDiameterAndColor(List<Машина> list, Scanner sc){
		System.out.println("Введiть дiаметр колеса");
		int diam =sc.nextInt();
		System.out.println("Введiть колiр");
		String color = sc.next();
		LogicCar.findDiameterAndColor(list, diam, color);
	}
	static void  changeCar(List<Машина> list, Scanner sc){
		System.out.println("Введiть дiаметр колеса");
		int diam = sc.nextInt();
		LogicCar.changeCar(list, diam);
	}
	static void  kuzov(List<Машина> list, Scanner sc){
		System.out.println("Введiть тип кузова");
		String cuz =sc.next();
		LogicCar.kuzov(list, cuz);
	}
	static void  color(List<Машина> list, Scanner sc){
		System.out.println("Введiть тип колiр кузова машин якi треба видалети");
		String color =sc.next();
		LogicCar.color(list, color);
	}
	static void  diapazon(List<Машина> list, Scanner sc){
		System.out.println("Введiть максимальний дiаметр колеса");
		int max=sc.nextInt();
		System.out.println("Введiть мiнiмальний дiаметр колеса");
		int min=sc.nextInt();
		LogicCar.diapazon(list, max, min);
	}
	static void  diapazonAndWhell(List<Машина> list, Scanner sc){
		System.out.println("Введiть максимальний дiаметр колеса");
		int max=sc.nextInt();
		System.out.println("Введiть мiнiмальний дiаметр колеса");
		int min=sc.nextInt();
		System.out.println("Введiть тип кузова");
		String cuz =sc.next();
		LogicCar.diapazonAndWhell(list, max, min, cuz);
	}
	static void typeOfCuzovAndDiapazonDiametr(Set <Машина> cars, Scanner sc){
		System.out.println("Введiть максимальний дiаметр колеса");
		int max=sc.nextInt();
		System.out.println("Введiть мiнiмальний дiаметр колеса");
		int min=sc.nextInt();
		System.out.println("Введiть колір кузова");
		String color =sc.next();
		LogicCar.typeOfCuzovAndDiapazonDiametr(cars, max, min, color);
	}
	static void diapazonRemoved(Set <Машина> cars, Scanner sc){
		System.out.println("Введiть максимальний дiаметр колеса");
		int max=sc.nextInt();
		System.out.println("Введiть мiнiмальний дiаметр колеса");
		int min=sc.nextInt();
		LogicCar.diapazonRemoved(cars, max, min);
	}
	static void TypeTireAndDiapazon(Set <Машина> cars, Scanner sc){
		System.out.println("Введiть максимальний дiаметр колеса");
		int max=sc.nextInt();
		System.out.println("Введiть мiнiмальний дiаметр колеса");
		int min=sc.nextInt();
		System.out.println("Введiть тип шин");
		String type =sc.next();
		LogicCar.TypeTireAndDiapazon(cars, max, min, type);
	}
}	





