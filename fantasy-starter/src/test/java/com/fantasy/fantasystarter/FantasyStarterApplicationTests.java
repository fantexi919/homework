package com.fantasy.fantasystarter;


import com.fantasy.bean.StarterBean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FantasyStarterApplicationTests {
    @Autowired
    private StarterBean fantasyBean;

    @Test
    public void contextLoads() {
        System.out.println(fantasyBean);
    }

}
