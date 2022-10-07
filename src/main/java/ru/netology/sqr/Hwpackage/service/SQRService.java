package ru.netology.sqr.Hwpackage.service;

public class SQRService {

    public int calcSQR(int x, int y) {
        int iterationCount = 0;

        for (int i = 0; i <= 99; i++) {
            if (i * i <= y)
                if (i * i >= x) {
                    iterationCount++;
                }
        }
        int t = iterationCount;

        return t;
    }
}


