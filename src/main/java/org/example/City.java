package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City {
    private String name;
    private String region;
    private String district;
    private long population;
    private String foundation;

}
