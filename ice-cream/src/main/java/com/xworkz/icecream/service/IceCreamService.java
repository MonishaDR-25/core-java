package com.xworkz.icecream.service;

import com.xworkz.icecream.dto.IceCreamDto;

public interface IceCreamService {
    boolean save(IceCreamDto iceCreamDto);

    Double getTotal(IceCreamDto iceCreamDto);
}
