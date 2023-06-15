import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    static int globalX = 0;

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2001,3,20,21,45);
        System.out.println(localDateTime1);
        System.out.println(localDateTime);
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getHour());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2023,4,24);
        System.out.println(localDate.getMonth());

        globalX = 6;
        int localX = 7;
//        printHello();
//        printString("Hi");
//        printInt(7);
//
//        int result = sumOfTwoInt(3, 4);
//        System.out.println(result);
//
//        System.out.println(sumOfTwoInt(5,8));

//        printSquare(4,'*');
//        printSquare(3,'$');
//        printEmptySquare(3,'*');
//        printEmptySquare(4,'@');

//        String[] order1 = {"Computer","Mouse","Screen"}; // 2500 + 250 + 1200 = 3950
//        String[] order2 = {"Mouse", "Keyboard"};
//        System.out.println(calculateSum(order1));// return sum of products from order array;
//        System.out.println(calculateSum(order2));

//        print("7");


    }

    // overload
    public static void print(){
        System.out.println();
    }

    public static void print(int x){
        System.out.println(x);
    }

    public static void print(String x){
        System.out.println(x);
    }


    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printString(String stringToPrint){
        System.out.println(stringToPrint);
    }

    public static void printInt(int x){
        System.out.println(x);
    }

    public static int sumOfTwoInt(int x , int y){
        return x + y;
//        System.out.println(); unreachable statement
    }

    public static void printSquare(int size, char symbol){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(" " + symbol);
            }
            System.out.println();
        }
    }

    public static void printEmptySquare(int size, char symbol){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i == 0 || j == 0 || i == size-1 || j == size-1){
                    System.out.print(" " + symbol);
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static int calculateSum(String[] arr){
        int sum = 0;
        for(String product : arr){
            if(product.equals("Computer")){
                sum += 2500;
            }else if (product.equals("Screen")){
                sum += 1200;
            }else if (product.equals("Mouse")){
                sum += 250;
            }else if (product.equals("Printer")){
                sum += 500;
            }else if (product.equals("Keyboard")){
                sum += 350;
            }
        }
        return sum;
    }

    public static void printGlobalX(){
        System.out.println(globalX);
    }


}





