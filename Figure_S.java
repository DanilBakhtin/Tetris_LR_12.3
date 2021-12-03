package Main;

public class Figure_S extends FigureClass{

    @Override
    public void generation() {
        if (!isSuper)
            System.out.println("Фигура S");
        else System.out.println("Супер фигура S");
    }

}
