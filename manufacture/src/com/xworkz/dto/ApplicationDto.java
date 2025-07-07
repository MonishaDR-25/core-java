package com.xworkz.dto;
import com.xworkz.enums.Version;
import com.xworkz.enums.AppType;
import com.xworkz.dto.Owner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ApplicationDto {
    private String name;
    private Version version;
    private LocalDate createdDate;
    private double size;
    private AppType type;
    private boolean isFree;
    private double chargePerUser;
    private List<Owner> owners;
}
