package compat;

public class Compatibility {

    public String compatCalc(String name1, String name2) {


        int c = 1;
        String numStrConv = "";

        String nameCombine = name1 + name2;
            nameCombine = nameCombine.toLowerCase();

            

        while (nameCombine.length() > 0) {

            for (int j = 1; j < nameCombine.length(); j++) {

                if (nameCombine.substring(0 , 1).equals(nameCombine.substring(j, j + 1))) { 
                    c++;
                }
                
            }
                nameCombine = nameCombine.replace(nameCombine.substring(0 , 1), "");
                numStrConv += c + "";
                c = 1; 
        }
        System.out.println("");

        String numStr = "";
        int numInt;

        while (Long.parseLong(numStrConv) >= 100 || Long.parseLong(numStrConv) < 9) {

            for (int i = 0; i < numStrConv.length()/2 + 1; i++) {

                if (i < numStrConv.length()/2) {

                numInt = Integer.parseInt(numStrConv.substring(i, i + 1));
                numInt += Integer.parseInt(numStrConv.substring(numStrConv.length() - 1 - i, numStrConv.length() - i));

                
                numStr += String.valueOf(numInt);      
                
                }
                else if (numStrConv.length() % 2 == 1) {
                    numStr += String.valueOf(Integer.parseInt(numStrConv.substring(numStrConv.length()/2 , numStrConv.length()/2 + 1)));
                }
                
            }
            numStrConv = numStr;
            numStr = "";
        }
        
        return numStrConv;
    }
}
