public class Main
{
    public static void main(String[] args)
    {
        int intOperandA = 30;
        int intOperandB = 3;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;
        double doubleOperandA = 3.6;
        double doubleOperandB = 0.3;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;
        System.out.println(" The Sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println(" The Product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        System.out.println("The Difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);
        System.out.println("The Quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);
        System.out.println("The Modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The Sum using ints of " + doubleOperandA + "  " + doubleOperandB + " is " + doubleSum);
        System.out.println("The Product using ints of " + doubleOperandA + "  " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The Difference using ints of " + doubleOperandA + "  " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The Quotient using ints of " + doubleOperandA + "  " + doubleOperandB + " is " + doubleQuotient);
    }
}