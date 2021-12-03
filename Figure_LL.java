package Main;

public class Figure_LL extends FigureClass{

    @Override
    public void generation() {
        if (!isSuper)
            System.out.println("Фигура L");
        else System.out.println("Супер фигура L");
    }
}
