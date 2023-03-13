package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City implements Comparable<City>{
    private String name;
    private String region;
    private String district;
    private long population;
    private String foundation;

    @Override
    public int compareTo(City o) {
        return String.CASE_INSENSITIVE_ORDER.compare(this.name, o.getName());
    }
}
