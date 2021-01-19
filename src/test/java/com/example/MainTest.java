package com.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

  @Test
  @Tag("slow")
  void everything_works() throws Exception {
    Adify adify = new Adify(new HerokuGetRequest("adify"));
    String result = adify.fetch("Coffee");
		assertEquals("Chocolate", result);
  }

}