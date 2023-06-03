class Square implements Polygon {
    private int side;

    Square(int side) {
        this.side = side;
    }

    public void getArea() {
        int area = side*side;
        System.out.println("The area of the Square is " + area);
    }

    public void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}
