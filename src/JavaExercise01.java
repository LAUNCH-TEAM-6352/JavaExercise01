import java.util.Arrays;

/**
 * An exercise for those learning to program in java.base/
 * <p>
 * Before working on this exercise, create your own branch of the JavaExercise01
 * repository, naming the branch <b>solution<i>YourName</i></b>. For example,
 * <b>solutionJohnK</b>. Then immediately push your branch up to GitHub.
 * <p>
 * In this exercise, replace the stub implementation of the {@see #createSpiral(int, int)}
 * method with a full implementation as described in the method's doc comment.
 * Feel free to create additional classes that may help with your solution.
 * Use the provided {@see #main(String[])} method to test your implementation.
 * <p>
 * Be sure to commit your changes to your branch and push those commits to
 * GitBub frequently.
 */
public class JavaExercise01
{
    public static void main(String[] args) throws Exception
    {
        JavaExercise01 app = new JavaExercise01();

        for (int[] dimensions : new int[][] { {-5, -2}, {-1, 3}, {3, -1}, {0, 0}, {0, 15}, {20, 0}, {3, 4}, {4, 3}, {10, 11}, {20, 20}})
        {
            int rows = dimensions[0];
            int cols = dimensions[1];

            try
            {
                int[][] spiral = app.createSpiral(rows, cols);

                System.out.format("createSpiral(%d, %d) ", rows, cols);

                if (spiral == null)
                {
                    System.out.println("incorrectly returned null!");
                }
                else if (spiral.length != rows || spiral[0].length != cols)
                {
                    System.out.format("incorrectly returned a %d x %d matrix!\n", spiral.length, spiral[0].length);
                }
                else
                {
                    System.out.println("returned:");
                    for (int[] row : spiral)
                    {
                        for (int c : row)
                        {
                            System.out.format("%4d", c);
                        }
                        System.out.println();
                    }
                }
            }
            catch (Exception e)
            {
                System.out.format("createSpiral(%d, %d) threw an exception:\n%s\n", rows, cols, e.toString());
            }

            System.out.println();
        }
    }

    /**
     * Builds a matrix of integer values with the values in a clockwise
     * spiral pattern starting with the upper left hand corner of the matrix.
     * The matrix is built as a two dimensional integer array with the first
     * dimension representing the numbder of rows and the second dimension
     * representing the number of columns.
     * <p>
     * As an example, calling with rows = 4 and cols = 3 would
     * return the following 2-dimensional integer array:
     * <code>
     *  {
     *    { 1,  2,  3},
     *    {10, 11,  4},
     *    { 9, 12,  5},
     *    { 8,  7,  6}
     *  };
     * </code>
     *
     * @param rows the number of rows in the created matrix
     * @param cols the number of columns ion the created matrix
     * @return a matrix of integers with the specified number of
     * rows and columns and with the values of 1 to rows*cols in
     * the spiral pattern as described.
     * @throws IllegalArgumentException if one or both of the
     * arguments is not a non-zero positive integer.
     */
    int[][] createSpiral(int rows, int cols)
    {
        return new int[][]
            {
                { 1,  2,  3},
                {10, 11,  4},
                { 9, 12,  5},
                { 8,  7,  6}
            };
    }
}
