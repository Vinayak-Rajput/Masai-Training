public class ExceptionDemo{
    static void main() {
        System.out.println("Program starts...");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number2: ");
        int num2 = sc.nextInt();
        try{
            System.out.println("Result: "+ num1/num2 );
        }catch(Exception e){
            System.out.println("Exception occured: "+ e);
        }
    }
}