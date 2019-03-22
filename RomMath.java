public class RomMath extends Math {

    String First, Second;
    int hundreds, tens, ones, result;
    String Hundreds, Tens, Ones;

    //Translate from String to int

    public int TranslateToInt(String First){
        switch(First){
            case "I":
                first = 1;
                break;

            case "II":
                first = 2;
                break;

            case "III":
                first = 3;
                break;

            case "IV":
                first = 4;
                break;

            case "V":
                first = 5;
                break;

            case "VI":
                first = 6;
                break;

            case "VII":
                first = 7;
                break;

            case "VIII":
                first = 8;
                break;

            case "IX":
                first = 9;
                break;

            case "X":
                first = 10;
                break;

            default:
                first = 0;
                break;

        }
        return first;
    }

    public String TranslateToString(int result){



        hundreds = result/100;
        tens = (result%100)/10;
        ones = (result%10)/1;

        switch (ones){
            case 0 : Ones = ""; break;
            case 1 : Ones = "I"; break;
            case 2 : Ones = "II"; break;
            case 3 : Ones = "III"; break;
            case 4 : Ones = "IV"; break;
            case 5 : Ones = "V"; break;
            case 6 : Ones = "VI"; break;
            case 7 : Ones = "VII"; break;
            case 8 : Ones = "VIII"; break;
            case 9 : Ones = "IX"; break;
        }

        switch (tens) {
            case 0:
                Tens = "";
                break;
            case 1:
                Tens = "X";
                break;
            case 2:
                Tens = "XX";
                break;
            case 3:
                Tens = "XXX";
                break;
            case 4:
                Tens = "XL";
                break;
            case 5:
                Tens = "L";
                break;
            case 6:
                Tens = "LX";
                break;
            case 7:
                Tens = "LXX";
                break;
            case 8:
                Tens = "LXXX";
                break;
            case 9:
                Tens = "XC";
                break;
        }


            switch (hundreds) {
                case 0:
                    Hundreds = "";
                    break;
                case 1:
                    Hundreds = "C";
                    break;
            }



            return(Hundreds+Tens+Ones);
    }


}
