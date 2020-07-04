package com.sda.thobho.zdautpol1;

import org.junit.jupiter.api.*;

public class MyFirstJUnitTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Przed wszystkimi testami, ale tylko raz");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Po wszystkich testach, ale tylko raz");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Wykonane przed każdym testem");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("Wykonane po każdym teście");
    }

    @Test
    public void myTest1(){
        System.out.println("Wykonanie testu 1");
    }

    @Test
    public void myTest2(){
        System.out.println("Wykonanie testu 2");
    }

}
