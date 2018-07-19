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
            return (i-1500)*0.1+1500*0.03;
        }
        else if(i<=9000){
            return (i-4500)*0.2+3000*0.1+1500*0.03;
        }
        else if(i<=35000){
            return (i-9000)*0.25+4500*0.2+3000*0.1+1500*0.03;
        }
        else if(i<=55000){
            return (i-35000)*0.30+26000*0.25+4500*0.2+3000*0.1+1500*0.03;
        }
        else if(i<=80000){
            return (i-55000)*0.35+20000*0.3+26000*0.25+4500*0.2+3000*0.1+1500*0.03;
        }
        else {
            return (i-80000)*0.5+25000*0.35+20000*0.3+26000*0.25+4500*0.2+3000*0.1+1500*0.03;
        }
    }
}
