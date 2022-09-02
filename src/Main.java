import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // задание 1

        String firstName = " Иван";
        String middleName = " Иванович";
        String lastName = " Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println(" ФИО сотрудника -" + fullName);

      //  задание 2
       fullName = "Иванов Иван Иванович" ;
       String fullName1 = fullName.toUpperCase ();
        System.out.println ("Данные ФИО сотрудника для заполнения отчета — " + fullName1 ) ;

        // задание 3
        fullName = " Иванов Семён Семёнович";
       String result = fullName.replace ( "ё", "е");
        System.out.println( " Данные ФИО сотрудника - " + result);
           }
       }











