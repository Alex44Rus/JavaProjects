package Lesson6.task1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class les6task1 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        laptop n1 = new laptop("ASUS", "F15", 8, "No OS");
        n1.setScreensize(15);
        n1.setMemory(512);
        
        laptop n2 = new laptop("ACER", "Nitro", 16, "Windows");
        n2.setScreensize(16);
        n2.setMemory(1024);

        laptop n3 = new laptop("DELL", "Latitude", 8, "Windows");
        n3.setScreensize(15);
        n3.setMemory(256);      
        
        laptop n4 = new laptop("MSI", "Stealth", 16, "Windows");
        n4.setScreensize(16);
        n4.setMemory(2048);

    HashSet <laptop> laptops = new HashSet<>(Arrays.asList(n1, n2, n3, n4));
    HashSet <laptop> result = new HashSet<>();

    System.out.println("Добрый день, вы в магазине ноутбуков! ");
    System.out.print("Нажмите для выбора параметра:\n 1 - ОЗУ \n 2- Объем ЖД \n 3- Операционная система \n 4 - Размер экрана \n 5 - Поиск\n");
    Scanner sc = new Scanner(System.in);
    Integer menu = sc.nextInt();
    sc.nextLine();
    HashMap <String, Object> filters = new HashMap<>();
    while (menu != 5){
        if (menu == 1){
            System.out.println("Введите мин размер оперативной памяти ");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("ram", temp); 
        }
        if (menu == 2){
            System.out.println("Введите мин размер SSD ");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("memory", temp); 
        }
        if (menu == 3){
            System.out.println("Введите название ОС или No OS ");
            String temp = sc.nextLine();
            sc.nextLine();
            filters.put("os", temp); 
        }
        if (menu == 4){
            System.out.println("Введите мин размер экрана ");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("screensize", temp); 
        }
        System.out.print("Нажмите для выбора параметра:\n 1 - ОЗУ \n 2- Объем ЖД \n 3- Операционная система \n 4 - Размер экрана \n 5 - Поиск\n");
        menu = sc.nextInt();
        sc.nextLine();
    }
    for (Entry<String, Object> entry : filters.entrySet()){
        if (entry.getKey().equals("ram")){
            Iterator it = laptops.iterator();
            while(it.hasNext()){
                laptop n = (laptop) it.next();
                if (n.getRam() >= (Integer)entry.getValue()){
                    result.add(n);
                }
            }
        }
        if (entry.getKey().equals("memory")){
            Iterator it = laptops.iterator();
            while(it.hasNext()){
                laptop n = (laptop) it.next();
                if (n.getMemory() >= (Integer)entry.getValue()){
                    result.add(n);
                }
            }
        }
        if (entry.getKey().equals("os")){
            Iterator it = laptops.iterator();
            while(it.hasNext()){
                laptop n = (laptop)it.next();
                if (n.getOs().equals(entry.getValue())){
                    result.add(n);
                }
            }
        }
        if (entry.getKey().equals("screensize")){
            Iterator it = laptops.iterator();
            while(it.hasNext()){
                laptop n = (laptop) it.next();
                if (n.getScreensize() >= (Integer)entry.getValue()){
                    result.add(n);
                }
            }
        }
    }


    Iterator it = result.iterator();
    while(it.hasNext()){
        laptop n = (laptop)it.next();
        System.out.println(n.toString());
        System.out.println();
    }
    sc.close();
  }
}
