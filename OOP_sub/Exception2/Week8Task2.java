import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;

public class Week8Task2 {

    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    /**
     * .
     * @return exception
     */

    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    /**
     * .
     * @return exception
     */

    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    public void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException();
    }

    /**
     * .
     * @return exception
     */

    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }


    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    /**
     * .
     * @return exception
     */

    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    public void ioEx() throws IOException {
        throw new IOException();
    }

    /**
     * .
     * @return exception
     */
    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";

        } catch (IOException e) {
            return "Lỗi IO";
        }
    }

}
