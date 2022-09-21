package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.cydeo.base.TestBase;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice extends TestBase {

    @Test
    public void test1(){

        Faker faker = new Faker();
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.name().u = " + faker.name().username());



        System.out.println("faker.ancient().primordial() = " + faker.ancient().primordial());
        System.out.println("faker.artist() = " + faker.artist().name());
        System.out.println("faker.numerify(\"312-###-####\") = " +
                faker.numerify("###-###-####"));

        System.out.println("faker.letterify(\"?????????\") = " + faker.letterify("?????????"));

        System.out.println("faker.bothify(\"##??#???\") = " + faker.bothify("##??#???"));
    }

}
