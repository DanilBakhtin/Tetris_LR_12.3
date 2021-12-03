package Main;

public class Figure_Z extends FigureClass{

    @Override
    public void generation() {
        if (!isSuper)
            System.out.println("Фигура Z");
        else System.out.println("Супер фигура Z");
    }

}
