import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //реализация ArrayList
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Волгоград");
        cities.add("Москва");
        cities.add("Анапа");
        cities.add("Санкт-Петербург");
        cities.add("Казань");
        //Collection.sort(cities);
        cities.sort(Comparator.naturalOrder());
        for(String city: cities){
            System.out.println(city);
        }

        cities.add(2,"Брянск");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите город");
        String searchCity = in.next();

        if(cities.contains(searchCity)){
            System.out.println(searchCity+" является городом РФ");
        }
        else{
            System.out.println(searchCity+" не является городом РФ");
        }

        //реализация LinkedList
        LinkedList<Street> streets = new LinkedList<>();
        Street street1 = new Street("Гагарина",35, 800);
        streets.add(street1);

        Street street2 = new Street("Ленина",5, 395);
        streets.add(street2);

        Street street3 = new Street("Пушкина",20, 650);
        streets.add(street3);

        Street street4 = new Street("Чапаева",13, 500);
        streets.add(street4);

        Street street5 = new Street("Королева",7, 400);
        streets.add(street5);

        System.out.println("Введите улицу");
        String searchStreet = in.next();
        boolean streetFound = false;
        for (Street street: streets){
            if (searchStreet.equals(street.getName())){
                   street.getInfo();
                   streetFound = true;
                   break;
            }
        }
        if (!streetFound){
            System.out.println("Улица "+searchStreet + " отсутствует в базе данных");
        }


    }
}