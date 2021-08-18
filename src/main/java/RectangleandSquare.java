public class RectangleandSquare {
    static class Rectangle {
        int length;
        int breadth;

        public Rectangle(int l, int b) {
            this.length = l;
            this.breadth = b;
        }
        public int rectangleArea() {
            return length*breadth;
        }

        public int rectanglePerimeter() {
            return 2*(length+breadth);
        }
    }

    static class Square
    {
        int side;
        public Square(int s)
        {
            this.side=s;
        }
        public int squareArea()
        {
            return side*side;
        }
    }


}
