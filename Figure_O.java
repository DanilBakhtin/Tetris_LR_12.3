package Main;

public class Figure_O extends FigureClass{

    @Override
    public void generation() {
        if (!isSuper)
            System.out.println("Фигура O");
        else System.out.println("Супер фигура O");
    }

}
