/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class UniversityStu extends Student {

    private String thesisName;
    private double thesisScore;
    Scanner sc = new Scanner(System.in);

    public UniversityStu() {
    }

    public UniversityStu(String thesisName, double thesisScore) {
        super();
        this.thesisName = thesisName;
        this.thesisScore = thesisScore;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Enter thesis name: ");
        thesisName = sc.next();
        System.out.print("Enter thesis score: ");
        thesisScore = sc.nextDouble();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Thesis name: " + thesisName);
        System.out.println("Thesis score: " + thesisScore);
    }

    @Override
    public boolean CheckGraduation() {
        if (thesisScore < 5) {
            return false;
        }
        return super.CheckGraduation();
    }
}
