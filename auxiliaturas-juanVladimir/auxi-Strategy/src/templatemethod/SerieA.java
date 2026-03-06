package templatemethod;

public class SerieA extends TemplateMethod {

    // F = 1 + 3 + 6 + 10 + 15 + …….
    @Override
    public int next(int acumulador, int index) {
        return acumulador + index;
    }

}
