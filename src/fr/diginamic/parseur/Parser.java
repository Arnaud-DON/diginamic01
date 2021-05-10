package fr.diginamic.parseur;


import java.util.HashMap;

public class Parser {

    static HashMap<String, String> operatorsMap = new HashMap<>();
    static{
        operatorsMap.put("+", "\\+");
        operatorsMap.put("-", "-");
        operatorsMap.put("/", "/");
        operatorsMap.put("*", "\\*");
    }

    public static Expression parse(String exp){
        Expression result = null;
        String operator = getOperator(exp);

        if(operator != null){
            String[] var = exp.split(operator);
            result = new Expression(new String[]{var[0], operator, var[1]});
        }

        return result;
    }

    private static String getOperator(String exp) {

        String operator = null;

        for (String op : operatorsMap.keySet()) {
            if(exp.contains(op)){
                if(operator == null){
                    operator = operatorsMap.get(op);
                }
                else {
                    System.out.println("/!\\ WARNING ! Multiple operators found, " + operator + " will be used.");
                }
            }
        }

        return operator;
    }
}
