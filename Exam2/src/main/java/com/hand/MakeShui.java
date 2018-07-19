package com.hand;

public class MakeShui {
    private static MakeShui make=null;
    private MakeShui(){}

    public static MakeShui getInstance(){
        if(null==make){
            make=new MakeShui();
        }
        return make;
    }
    public double calculate(int i){
        if(i<=1500){
            return i*0.03;
        }
        else if(i<=4500){
            return i*0.1;
        }
        else if(i<=9000){
            return i*0.2;
        }
        else if(i<=35000){
            return i*0.25;
        }
        else if(i<=55000){
            return i*0.3;
        }
        else if(i<=80000){
            return i*0.35;
        }
        else {
            return i*0.45;
        }
    }
}
