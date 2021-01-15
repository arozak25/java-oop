/**
 * @author Abdul Rozak
 * @since 1/15/21
 */
class Shape {

    int getCorner(){
        return 0;
    }

}

class Rectangle extends Shape {

    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
}
