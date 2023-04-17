package session15;

public class Ex2 {

    public static void main(String[] args) {

//*Check if a given date is valid or not. You must use this format = dd/mm/yyyy to verify (days and months can also be one digit. And year can be two or four digits)
//12/12/1990 True
//34/9/2000 false
//7/08/1987 True
//09/15/2023 false
//12/12/12 true


        //First solution
        String date="10/12/98";



        String[] parts=date.trim().split("/");


        for (String each : parts) {
            if(!each.matches("[0-9]+")) {

                System.out.println("Date must have only digits");
                System.exit(0);
            }
        }



        String days=parts[0];

        for (int i = 0; i < days.length(); i++) {
            if(Integer.parseInt(days)>31){
                System.out.println("Days must be less than 32");
                System.exit(0);
            }
        }


        String months=parts[1];
        for (int i = 0; i < months.length(); i++) {
            if(Integer.parseInt(months)>12){
                System.out.println("Months must be less than 13");
                System.exit(0);
            }
        }


        String years=parts[2];
        for (int i = 0; i < years.length(); i++) {
            int year=Integer.parseInt(years);
            if(!(year>=0 && year<=9999)){
                System.out.println("Years must be between 0-9999");
                System.exit(0);
            }
        }


        System.out.println(date+" is valid.");




        //Second solution                    // 12/12/96

    System.out.println(date.matches("([0-9]|[0-2][0-9]|3[0-1])/([0-9]|0[1-9]|1[0-2])/([0-9]{2}|[0-9]{4})"));





    }
}
