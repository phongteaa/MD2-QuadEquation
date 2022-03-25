package com.company;

public class Main {
    public static void main(String[] args) {
        Qe qe = new Qe(1.0, 3, 1);

        if (qe.getDiscriminant() >= 0) {
            System.out.println("Nghiem 1 la " + qe.getRoot1());
            System.out.println("Nghiem 2 la " + qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("Nghiem duy nhat la " + qe.getRoot());
        } else if (qe.getDiscriminant() < 0){
            System.out.println("PT vo nghiem");
        }
    }
}
