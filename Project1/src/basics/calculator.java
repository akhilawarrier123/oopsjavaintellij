package basics;

public   class  calculator {


    public static void sub(int a, int b) {
        int diff = a - b; //17-11
        System.out.println("the difference is "+ diff);
    }

    public static void mul(int a, int b) { // a=17, b=11
        int pdt = a * b; //17-11
        System.out.println("the product is "+ pdt); //6
    }
    public static void div(int a, int b) { // a=17, b=11
        int div = a / b; //17-11
        System.out.println("the quotient is "+ div); //6
    }
    public static void add(int a, int b) { // a=17, b=11
        int sum = a - b; //17-11
        System.out.println("the difference is "+ sum); //6
    }

    public static void main(String[] args) {

calculator.sub(2,4);

        calculator.mul(2,4);


        calculator.div (2,4);
        calculator.add(2,4);




    }
}
