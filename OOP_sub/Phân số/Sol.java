public class Solution {
    private int numerator; // Tử số
    private int denominator; // Mẫu số

    // Getter cho tử số
    public int getNumerator() {
        return numerator;
    }

    // Setter cho tử số
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // Getter cho mẫu số
    public int getDenominator() {
        return denominator;
    }

    /**
     * hello.
     * @param denominator a
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    // Phương thức khởi tạo có tham số

    /**
     * hello.
     * @param numerator a
     * @param denominator a
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        // Kiểm tra và khôi phục mẫu số nếu bằng 0
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    // Phương thức rút gọn phân số
    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        return new Solution(numerator / gcd, denominator / gcd);
    }

    // Phương thức tính ước chung lớn nhất
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Phương thức cộng phân số với một phân số khác

    /**
     * hello.
     * @param other 2
     * @return .
     */
    public Solution add(Solution other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    // Phương thức trừ phân số với một phân số khác

    /**
     * hello.
     * @param other 2
     * @return .
     */
    public Solution subtract(Solution other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    // Phương thức nhân phân số với một phân số khác

    /**
     * hello.
     * @param other 6
     * @return .
     */
    public Solution multiply(Solution other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    // Phương thức chia phân số cho một phân số khác

    /**
     * hello.
     * @param other 3
     * @return .
     */
    public Solution divide(Solution other) {
        if (other.numerator == 0) {
            return new Solution(0, 1);
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Solution(newNumerator, newDenominator).reduce();
    }

    // Phương thức so sánh hai phân số

    /**
     * hello.
     * @param obj 1
     * @return .
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            // Rút gọn và so sánh
            Solution thisReduced = this.reduce();
            Solution otherReduced = other.reduce();
            return thisReduced.numerator == otherReduced.numerator
                    && thisReduced.denominator == otherReduced.denominator;
        }
        return false;
    }

}
       