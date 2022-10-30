package ExeptionsHW.HW1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
    // Method1(16,0); //Делить на ноль нельзя
   // Method2("Mac.txt"); //Пытаемся прочитать несуществующий файл
        //  Method3("9","Павлентий"); //Пытаемся провести арифметические операции со строками, которые не преобразовать в интовые значения
    }

    public static void Method1(int number_1, int number_2){
        System.out.println(number_1/number_2);
    }

    public static void Method2(String file_name) throws FileNotFoundException {
        FileReader a = new FileReader(file_name);

    }

    public static void Method3(String number_1, String number_2){
        System.out.println(Integer.parseInt(number_1) + Integer.parseInt(number_2));
    }
}