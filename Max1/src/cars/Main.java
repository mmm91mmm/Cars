package cars;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;





public class Main {
	 
	
	static void  changeRul(List<������> list){
		for (������ ������ : list) {
			if(������.getKolir()== Color.RED){
				if(������.getRozmir()==Rozmir.BIG){
					������.changeRozmir(Rozmir.LITTLE);
				}else if(������.getRozmir()==Rozmir.LITTLE){
					������.changeRozmir(Rozmir.BIG);
				}else{
					������.changeRozmir(Rozmir.BIG);
				}
			}
		}
		System.out.println(list);
	}
		static void  buttons(List<������> list){
		for (������ ������ : list) {
			if (������.isBatton() == true){
				������.setDiametr(������.getDiametr()*2);
			}
		}
		System.out.println(list);
	}
		
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		������ ������1 = new ������ ("������1 ", Rozmir.BIG,true, 10, Rezina.WINTER,Color.BLACK, "cabriolet");
		������ ������2 = new ������ ("������2 ", Rozmir.BIG,false, 20, Rezina.SUMMER,Color.RED,"gruzova");
		������ ������3 = new ������ ("������3 ", Rozmir.LITTLE,true, 30, Rezina.SUMMER,Color.BLACK,"cabriolet");
		������ ������4 = new ������ ("������4 ", Rozmir.NORMAL,true, 55, Rezina.WINTER,Color.SILVER,"gruzova");
		������ ������5 = new ������ ("������5 ", Rozmir.BIG,false, 100, Rezina.SUMMER,Color.RED, "gruzova");
		������ ������6 = new ������ ("������6 ", Rozmir.LITTLE,true, 45, Rezina.WINTER,Color.GREEN, "cabriolet");
		������ ������7 = new ������ ("������7 ", Rozmir.NORMAL,false, 30, Rezina.SUMMER,Color.WHITE, "gruzova");
		List<������> list = new ArrayList<>();
		list.add(������1);
		list.add(������2);
		list.add(������3);
		list.add(������4);
		list.add(������5);
		list.add(������6);
		list.add(������7);
		
		Set<������> cars = new LinkedHashSet<>();
		cars.add(������1);
		cars.add(������2);
		cars.add(������3);
		cars.add(������4);
		cars.add(������5);
		cars.add(������6);
		cars.add(������7);
		
		
		maximumRadius(list);
		
		
		//findDiameter(list, sc);						//������ ������, �� ����� �������� ������ ����.
		//findDiameterAndColor(list, sc);				//������ ������, �� ����� �������� ������ ���� �� ���� ������.
		//changeRul(list);								//������� � ��� �������, �� ����� �������� ���� ������, ����� �� ����.
		//buttons(list);								//�������� ������ ���� �����, ���� ����� �� ��������.
		//changeCar(list, sc);							//������� �� ������, �� ����� ������ �������� ����� �� ������� ��������, �� ���� ������.
		//kuzov(list, sc);								//������ ������, �� �������������� �������� ��� ������.
		//color(list, sc);								//�������� � ���� �� ������, �� ����� �������� ���� ������.
		//diapazon(list, sc);							//������� ��� �������, ������ ���� ���� ������ � ��������� ������� ���� �� �����.
		//diapazonAndWhell(list, sc);					//�������� �� ������, �� ����� �������� ��� ������ �� �������� ������� ������� �����.
		//typeOfCuzov(list, sc);						//�����'����� ������� �����, �� ����� �������� ��� ������.
		//typeOfCuzovAndDiapazonDiametr(cars, sc);		//�������, �� ����� �������� ���� ������ �� �������� ������ ������, ������ ��� ��� �� ��������.
		//diapazonRemoved(cars, sc);					//�������� ������, ������ ����� ���� ������ � �������� �������.
		//TypeTireAndDiapazon(cars, sc);				//������ ������, �� ����� �������� ��� ��� �� ������ ���� ���� ������ � �������� �������.
	}
	private static void maximumRadius(List<������> list) {
		LogicCar.maximumRadius(list);
		
	}
	static void typeOfCuzov(List<������> list, Scanner sc){  
		System.out.println("����i�� ��� ������");
		String cuzov =sc.next();
		LogicCar.typeOfCuzov(list, cuzov);
	}
	static void  findDiameter(List<������> list, Scanner sc){ 
		System.out.println("����i�� �i����� ������");
		int diam =sc.nextInt();
		LogicCar.findDiameter(list, diam);
			}
	static void  findDiameterAndColor(List<������> list, Scanner sc){
		System.out.println("����i�� �i����� ������");
		int diam =sc.nextInt();
		System.out.println("����i�� ���i�");
		String color = sc.next();
		LogicCar.findDiameterAndColor(list, diam, color);
	}
	static void  changeCar(List<������> list, Scanner sc){
		System.out.println("����i�� �i����� ������");
		int diam = sc.nextInt();
		LogicCar.changeCar(list, diam);
	}
	static void  kuzov(List<������> list, Scanner sc){
		System.out.println("����i�� ��� ������");
		String cuz =sc.next();
		LogicCar.kuzov(list, cuz);
	}
	static void  color(List<������> list, Scanner sc){
		System.out.println("����i�� ��� ���i� ������ ����� ��i ����� ��������");
		String color =sc.next();
		LogicCar.color(list, color);
	}
	static void  diapazon(List<������> list, Scanner sc){
		System.out.println("����i�� ������������ �i����� ������");
		int max=sc.nextInt();
		System.out.println("����i�� �i�i������� �i����� ������");
		int min=sc.nextInt();
		LogicCar.diapazon(list, max, min);
	}
	static void  diapazonAndWhell(List<������> list, Scanner sc){
		System.out.println("����i�� ������������ �i����� ������");
		int max=sc.nextInt();
		System.out.println("����i�� �i�i������� �i����� ������");
		int min=sc.nextInt();
		System.out.println("����i�� ��� ������");
		String cuz =sc.next();
		LogicCar.diapazonAndWhell(list, max, min, cuz);
	}
	static void typeOfCuzovAndDiapazonDiametr(Set <������> cars, Scanner sc){
		System.out.println("����i�� ������������ �i����� ������");
		int max=sc.nextInt();
		System.out.println("����i�� �i�i������� �i����� ������");
		int min=sc.nextInt();
		System.out.println("����i�� ���� ������");
		String color =sc.next();
		LogicCar.typeOfCuzovAndDiapazonDiametr(cars, max, min, color);
	}
	static void diapazonRemoved(Set <������> cars, Scanner sc){
		System.out.println("����i�� ������������ �i����� ������");
		int max=sc.nextInt();
		System.out.println("����i�� �i�i������� �i����� ������");
		int min=sc.nextInt();
		LogicCar.diapazonRemoved(cars, max, min);
	}
	static void TypeTireAndDiapazon(Set <������> cars, Scanner sc){
		System.out.println("����i�� ������������ �i����� ������");
		int max=sc.nextInt();
		System.out.println("����i�� �i�i������� �i����� ������");
		int min=sc.nextInt();
		System.out.println("����i�� ��� ���");
		String type =sc.next();
		LogicCar.TypeTireAndDiapazon(cars, max, min, type);
	}
}	





