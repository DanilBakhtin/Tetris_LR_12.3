package Main;

//Абстрактный класс для фигур
abstract class FigureClass implements Figure{

    //Супер фигура или нет
    protected boolean isSuper;

    //Абстрактный метод генерации
    @Override
    abstract public void generation();

    @Override
    public void makeSuper(boolean isSuper){
        this.isSuper = isSuper;
    }
}
