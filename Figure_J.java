package Main;

public class Figure_J extends FigureClass{

    @Override
    public void generation() {
        if (!isSuper)
            System.out.println("Фигура J");
        else System.out.println("Супер фигура J");
    }

}

