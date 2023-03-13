package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<City> cityList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("Задача ВС Java Сбер.csv", StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] items = line.split(";");
                City city = new City();
                city.setName(items[1]);
                city.setRegion(items[2]);
                city.setDistrict(items[3]);
                city.setPopulation(Long.parseLong(items[4]));
                if(items.length >= 6) {
                    city.setFoundation(items[5]);
                }

                cityList.add(city);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < cityList.size(); i++) {
            System.out.println(cityList.get(i));
        }
    }
}