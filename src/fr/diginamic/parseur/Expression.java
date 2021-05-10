package fr.diginamic.parseur;

public class Expression {

    public static String nb1 = null;
    public static String nb2 = null;
    public static String operator = null;



    public Expression(String[] exp) {
        nb1 = exp[0];
        operator = exp[1];
        nb2 = exp[2];
    }

    public double evaluer(String varName, double varValue){
        double result = 0 ;
        double a = 0;
        double b = 0;

        if(varName.equals(nb1)){
            a = varValue;
            b = Double.parseDouble(nb2);
        }
        else if(varName.equals(nb2)){
            a = Double.parseDouble(nb1);
            b = varValue;
        }

        if("\\+".equals(operator)){
            result = a+b;
        }
        else if("-".equals(operator)){
            result = a-b;
        }
        else if("/".equals(operator)){
            result = a/b;
        }
        else if("\\*".equals(operator)){
            result = a*b;
        }

        return result;
    }
}
