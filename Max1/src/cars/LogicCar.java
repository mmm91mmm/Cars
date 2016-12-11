package cars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LogicCar {
	
	static void typeOfCuzov(List<Машина> list, String cuzov){
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getType().equals(cuzov)){
				System.out.println(i+1);
			}
		}
	}
	static void  findDiameter(List<Машина> list, int diam){ 
		for (int i = 0; i < list.size(); i++) {
		if(list.get(i).getDiametr() == diam){
			System.out.println(list.get(i));
			}
		}
	}
	static void  findDiameterAndColor(List<Машина> list, int diam, String color){
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getDiametr() == diam&&Color.valueOf(color).equals(list.get(i).getKolir())) {
				System.out.println(list.get(i));
			}
		}
	}
	/////////////////////////////////////////
	static void  maximumRadius(List<Машина> list){
		int a = 0;
		for (int i = 1; i < list.size(); i++) {
				if(list.get(i).getDiametr()>list.get(i-1).getDiametr()&&list.get(i).getDiametr()>list.get(a).getDiametr()){
					a = i;
				}			
			}	
			System.out.println(list.get(a));
	}
	
	////////////////////////////////
	static void  changeCar(List<Машина> list, int diam){
		for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getDiametr()<diam){
					Машина removed = list.set(i, new Машина("New ", Rozmir.BIG,true, 150, Rezina.SUMMER, Color.BLACK, "gruzova"));
				}			
			}	
			System.out.println(list);
	}
	static void  kuzov(List<Машина> list, String cuz){
		Iterator<Машина> iterator = list.iterator(); 
		while (iterator.hasNext()){
			Машина temp = iterator.next();
			if(temp.getType().equals(cuz)){
				System.out.println(temp);
			}
		}
	}
	static void  color(List<Машина> list, String color){
			Iterator<Машина> iterator = list.iterator(); 
			while (iterator.hasNext()){
				Машина car = iterator.next();
				if(car.getKolir().equals(Color.valueOf(color))){
					iterator.remove();
					}
				}
		System.out.println(list);
	}
	static void  diapazon(List<Машина> list, int max, int min){
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getDiametr()>min&&list.get(i).getDiametr()<max){
				list.get(i).changeRezina(Rezina.WINTER);
			}
		}
		System.out.println(list);
	}
	static void  diapazonAndWhell(List<Машина> list, int max, int min, String cuz){
		Iterator<Машина> iterator = list.iterator(); 
		while (iterator.hasNext()){
			Машина car = iterator.next();
		if(car.getDiametr()>min&&car.getDiametr()<max&&car.getType().equals(cuz)){
			iterator.remove();
			}
		}
		System.out.println(list);
	}
	public static void typeOfCuzovAndDiapazonDiametr(Set <Машина> cars, int max, int min, String color) {
		Iterator<Машина> iterator = cars.iterator(); 
		while (iterator.hasNext()){
			Машина car = iterator.next();
		if(Color.valueOf(color).equals(car.getKolir())&&car.getDiametr()<max&&car.getDiametr()>min){
		car.changeRezina(Rezina.WINTER);
			}
		}
		System.out.println(cars);
	}
	public static void diapazonRemoved(Set<Машина> cars, int max, int min) {
		Iterator<Машина> iterator = cars.iterator(); 
		while (iterator.hasNext()){
			Машина car = iterator.next();
			if(car.getDiametr()<max&&car.getDiametr()>min){
			iterator.remove();}
		}
		System.out.println(cars);
	}
	public static void TypeTireAndDiapazon(Set<Машина> cars, int max, int min, String type) {
		for(Машина car : cars){
			if(car.getDiametr()<max&&car.getDiametr()>min&&Rezina.valueOf(type).equals(car.getRezina())){
				System.out.println(car);
			}
		}
	}
}

