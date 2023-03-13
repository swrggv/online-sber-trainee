package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cityList = CityWorker.getCityList();

        //Пример полученного результата для сортировки по наименованию:
        cityList.stream()
                .sorted()
                .forEach(System.out::println);

        //Пример полученного результата для сортировки по двум
        //полям справочника – федеральному округу и наименованию города:
        Collections.sort(cityList, (o1, o2) -> {
            int res = String.CASE_INSENSITIVE_ORDER.compare(o1.getDistrict(), o2.getDistrict());
            if(res != 0) {
                return res;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(o1.getName(), o2.getName());
        });

        for(City city : cityList) {
            System.out.println(city);
        }
    }
}