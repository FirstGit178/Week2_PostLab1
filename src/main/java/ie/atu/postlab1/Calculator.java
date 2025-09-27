package ie.atu.postlab1;

public class Calculator {
    private double num1;
    private double num2;
    private String operation;
    private double result;

    public Calculator(double num1, double num2, String operation){
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.result = calculateTotal();
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getOperatation() {
        return operation;
    }

    public double getResult() {
        return result;
    }
    public void calculateTotal(){
        switch (operation){
            case "add ":
                //num2 + num1 = result;    //Why was this wrong???????
               result = num2 + num1 ;
                break;

            default:
                System.out.println("Error");

        }
    }
}
