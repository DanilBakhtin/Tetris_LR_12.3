package Main;

public class Figure_l extends FigureClass{

    @Override
    public void generation() {
        if (!isSuper)
            System.out.println("Фигура |");
        else System.out.println("Супер фигура |");
    }
}
