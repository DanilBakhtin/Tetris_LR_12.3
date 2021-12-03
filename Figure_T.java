package Main;

public class Figure_T extends FigureClass{

    @Override
    public void generation() {
        if (!isSuper)
            System.out.println("Фигура T");
        else System.out.println("Супер фигура T");
    }

}
