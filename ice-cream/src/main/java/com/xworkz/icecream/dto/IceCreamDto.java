package com.xworkz.icecream.dto;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@ToString
@Data
public class IceCreamDto {

    @Size(min = 3,max = 50)
    private String name;

    @Size(min=3,max=50)
    private String flavour;
    private String takeAway;
    private String addOns;
    private String coupon;

    @Min(1)
    @Max(30)
    private Integer quantity;
    private Double total;

    @NotNull
    private String email;

    @NotNull
    private String otp;

    private MultipartFile multipartFile;

}
