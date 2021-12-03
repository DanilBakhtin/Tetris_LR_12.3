package Main;

//Случайный создатель фигур
public class RandomCreatorFigure {

    //Создатель фигур
    private FigureCreator creator = new FigureCreator();
    //Количество фигур
    private int size = 7;

    //Генерация случайной фигуры
    public void generation(){

        FigureClass figure;
            int type = randomTypeGeneration();
            boolean sup = randomSuper() == 1 ? true : false;
            if (!sup)
                figure = creator.create(type);
            else figure = creator.createSuper(type);

        figure.generation();
    }


    //Генерация случайного числа от 1 до количества фигур
    private int randomTypeGeneration(){
        return 1 + (int)(Math.random() * ((size - 1) + 1));
    }

    //Генерация случайного числа от 1 до 5
    private int randomSuper(){
        return 1 + (int)(Math.random() * ((5 - 1) + 1));
    }
}
