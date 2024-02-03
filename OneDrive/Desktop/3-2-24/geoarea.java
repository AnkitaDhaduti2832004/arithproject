public class geoarea{
    /**
     * The function calculates the area of a triangle using the formula 0.5 * base * height.
     * 
     * @param operand_1 The first operand of the triangle, which represents the length of the base of
     * the triangle.
     * @param  The function "area_of_triangle" takes two parameters: operand_1 and operand_2. These
     * parameters are of type float.
     * @return the area of a triangle, which is calculated by multiplying half of the base (operand_1)
     * by the height (operand_2).
     */
    double area_of_triangle(float operand_1, float operand_2){
        return(0.5*operand_1 * operand_2);
    }

    double area_of_rectangle(float operand_1, float operand_2){
        return(operand_1 * operand_2);
    }
}