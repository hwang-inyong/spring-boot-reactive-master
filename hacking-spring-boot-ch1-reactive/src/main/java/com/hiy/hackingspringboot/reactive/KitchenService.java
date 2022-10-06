package com.hiy.hackingspringboot.reactive;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class KitchenService {

    Flux<Dish> getDishes() {
        return Flux.<Dish>
    }

}
