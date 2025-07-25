package ru.netology.service;

public class CustomsService {
 final  static  int BET_CUSTOMS = 100;

    public static int calculateCustoms(int price, int weight) {
        int fee = (price / 100) + weight * BET_CUSTOMS;
        return fee;
    }
}
