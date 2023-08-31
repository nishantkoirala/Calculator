/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.shoppingcart.mytestng;

/**
 *
 * @author nishant.koirala
 */
public class Student {
    
    private String name;
    private int math;
    private int sci;
    private int eng;

    public Student() {
    }

    public Student(String name, int math, int sci, int eng) {
        this.name = name;
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", math=" + math + ", sci=" + sci + ", eng=" + eng + '}';
    }
    
    
    public String getGrade(){
        String grade = "";
        int total = this.math + this.sci + this.eng;
        int avg = total/3;
        if (avg<60){
            return "Fail";
        }
        else{
            return "Pass";
        }
        
    }
    
}
