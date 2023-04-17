package session08;

public class Ex5 {

    public static void main(String[] args) {

//*Display all the possible times in a 24-hour clock system on the screen? For example:
//
//00:00
//00:01
//00:02
//...
//23:58
//23:59

        for (int i = 0; i <24 ; i++) { //for hours
            for (int j = 0; j <60 ; j++) { //for minutes

                String hour=String.valueOf(i);   //each hour
                String minute=String.valueOf(j);//each minute

                if(hour.length()==1) hour="0"+hour; //if hour is less than 10
                if(minute.length()==1) minute="0"+minute;//if hour is less than 10

                System.out.println(hour+":"+minute); //Print times

            }

        }






    }
}
