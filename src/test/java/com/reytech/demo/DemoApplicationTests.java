package com.reytech.demo;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.reytech.demo.Personne;


@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
        void groupedAssertions() {
        Personne pers = new Personne("Nassur", "Moumadi");

        assertAll("personne", () -> assertEquals("Nassur", pers.getFirstName()),
                              () -> assertEquals("Moumadi", pers.getLastName()));
	@Test
        void groupedAssertions_jc() {
        Personne pers = new Personne("James", "Cossart");

        assertAll("personne", () -> assertEquals("James", pers.getFirstName()),
                              () -> assertEquals("Cosart", pers.getLastName()));
    }


}
