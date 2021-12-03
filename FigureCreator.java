package Main;

//Создатель фигур
public class FigureCreator {

    //Метод для создания обычной фигуры
    public FigureClass create(int figure){
        switch (figure){
            case 1: return new Figure_J();
            case 2: return new Figure_l();
            case 3: return new Figure_LL();
            case 4: return new Figure_O();
            case 5: return new Figure_S();
            case 6: return new Figure_T();
            case 7: return new Figure_Z();
            default: return null;
        }
    }
    //Метод для создания супер фигуры
    public FigureClass createSuper(int figure){
        FigureClass out = null;
        switch (figure){
            case 1: out = new Figure_J();
                out.makeSuper(true);
                break;
            case 2: out = new Figure_l();
                out.makeSuper(true);
                break;
            case 3: out = new Figure_LL();
                out.makeSuper(true);
            break;
            case 4: out = new Figure_O();
                out.makeSuper(true);
            break;
            case 5: out = new Figure_S();
                out.makeSuper(true);
            break;
            case 6: out = new Figure_T();
                out.makeSuper(true);
            break;
            case 7: out = new Figure_Z();
                out.makeSuper(true);
            break;
            default: out = null;
        }
        return out;
    }
}
