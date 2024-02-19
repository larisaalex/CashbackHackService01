package ru.netology.service;

import static org.testng.Assert.assertEquals;
public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
}
