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
            RectangleandSquare.Rectangle obj=new RectangleandSquare.Rectangle(4,3);
            int expectedArea=12;
            int actualArea=obj.rectangleArea();
            assertEquals(expectedArea,actualArea);

        }

        @Test
        public void toCalculateAreaWhenLengthandBreadtharenegative()
        {
            RectangleandSquare.Rectangle obj=new RectangleandSquare.Rectangle(-4,-3);
            int expectedArea=12;
            int actualArea=obj.rectangleArea();
            assertEquals(expectedArea,actualArea);

        }
        @Test
    public void toCalculateAreaWhenLengthispositiveandBreadthisNegative()
    {
        RectangleandSquare.Rectangle obj=new RectangleandSquare.Rectangle(4,-3);
        int expectedArea=-12;
        int actualArea=obj.rectangleArea();
        assertEquals(expectedArea,actualArea);

    }

        @Test
        public void toCalculateAreaWhenLengthisNegativeandBreadthisPositive()
        {
            RectangleandSquare.Rectangle obj=new RectangleandSquare.Rectangle(-4,3);
            int expectedArea=-12;
            int actualArea=obj.rectangleArea();
            assertEquals(expectedArea,actualArea);

        }
    }

    @Nested
    public  class RectanglePerimeterTesting
    {
        @Test
        public void toCalculatePerimeterWhenLengthandBreadtharePositive()
        {
            RectangleandSquare.Rectangle obj=new RectangleandSquare.Rectangle(4,3);
            int expectedPerimeter=14;
            int actualPerimeter=obj.rectanglePerimeter();
            assertEquals(expectedPerimeter,actualPerimeter);

        }

        @Test
        public void toCalculatePerimeterWhenLengthandBreadtharenegative()
        {
            RectangleandSquare.Rectangle obj=new RectangleandSquare.Rectangle(-4,-3);
            int expectedPerimeter=-14;
            int actualPerimeter=obj.rectanglePerimeter();
            assertEquals(expectedPerimeter,actualPerimeter);

        }
        @Test
        public void toCalculatePerimeterWhenLengthispositiveandBreadthisNegative()
        {
            RectangleandSquare.Rectangle obj=new RectangleandSquare.Rectangle(4,-3);
            int expectedPerimeter=2;
            int actualPerimeter=obj.rectanglePerimeter();
            assertEquals(expectedPerimeter,actualPerimeter);

        }

        @Test
        public void toCalculatePerimeterWhenLengthisNegativeandBreadthisPositive()
        {
            RectangleandSquare.Rectangle obj=new RectangleandSquare.Rectangle(-4,3);
            int expectedPerimeter=-2;
            int actualPerimeter=obj.rectanglePerimeter();
            assertEquals(expectedPerimeter,actualPerimeter);

        }
    }

    @Nested
    public  class SquareAreaTesting
    {
        @Test
        public void toCalculateAreaWhenSideisPositive()
        {
            RectangleandSquare.Square obj=new RectangleandSquare.Square(4);
            int expectedArea=16;
            int actualArea=obj.squareArea();
            assertEquals(expectedArea,actualArea);

        }

        @Test
        public void toCalculateAreaWhenSideisNegative()
        {
            RectangleandSquare.Square obj=new RectangleandSquare.Square(-4);
            int expectedArea=16;
            int actualArea=obj.squareArea();
            assertEquals(expectedArea,actualArea);

        }




    }

    @Nested
    public  class SquarePerimeterTesting
    {
        @Test
        public void toCalculatePerimeterWhenSideisPositive()
        {
            RectangleandSquare.Square obj=new RectangleandSquare.Square(4);
            int expectedPerimeter=16;
            int actualPerimeter=obj.squarePerimeter();
            assertEquals(expectedPerimeter,actualPerimeter);

        }

        @Test
        public void toCalculatePerimeterWhenSideisNegative()
        {
            RectangleandSquare.Square obj=new RectangleandSquare.Square(-4);
            int expectedPerimeter=-16;
            int actualPerimeter=obj.squarePerimeter();
            assertEquals(expectedPerimeter,actualPerimeter);

        }

    }
}
