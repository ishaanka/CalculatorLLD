import Impl.Operand;
import Impl.PlusOperator;
import Impl.SubtractOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator !");

        Operand l1 = new Operand(20.0);
        Operand l2 = new Operand(50.0);
        Operand l3 = new Operand(30.0);
        SubtractOperator sub = new SubtractOperator(l2, l3);

        PlusOperator l4 = new PlusOperator(l1, sub);

        System.out.println(l4.process());
    }
}