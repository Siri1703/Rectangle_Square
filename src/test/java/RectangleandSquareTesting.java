import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleandSquareTesting {

   @Nested
    public  class RectangleAreaTesting
    {
        @Test
        public void toCalculateAreaWhenLengthandBreadtharePositive()
        {
            RectangleandSquare obj=new RectangleandSquare(4,3);
            int expectedArea=12;
            int actualArea=obj.rectangleArea();
            assertEquals(expectedArea,actualArea);

        }

        @Test
        public void toCalculateAreaWhenLengthandBreadtharenegative()
        {
            RectangleandSquare obj=new RectangleandSquare(-4,-3);
            int expectedArea=12;
            int actualArea=obj.rectangleArea();
            assertEquals(expectedArea,actualArea);

        }
        @Test
    public void toCalculateAreaWhenLengthispositiveandBreadthisNegative()
    {
        RectangleandSquare obj=new RectangleandSquare(4,-3);
        int expectedArea=-12;
        int actualArea=obj.rectangleArea();
        assertEquals(expectedArea,actualArea);

    }

        @Test
        public void toCalculateAreaWhenLengthisNegativeandBreadthisPositive()
        {
            RectangleandSquare obj=new RectangleandSquare(-4,3);
            int expectedArea=-12;
            int actualArea=obj.rectangleArea();
            assertEquals(expectedArea,actualArea);

        }
    }
}
