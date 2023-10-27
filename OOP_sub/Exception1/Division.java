public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);

    }

    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * .
     * @return result
     */

    public double evaluate()  {

        if (right.evaluate() == 0) {
            throw new java.lang.ArithmeticException("Lỗi chia cho 0");
        } else {
            return left.evaluate() / right.evaluate();
        }

    }
}
