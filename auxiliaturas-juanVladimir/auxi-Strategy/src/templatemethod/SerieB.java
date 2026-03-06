package templatemethod;

public class SerieB extends TemplateMethod {

    // F = 1 + 10 + 100 + 1000 + …….
    @Override
    public int next(int acumulador, int index) {
        if (index == 1) {
            return 1;
        }
        return acumulador * 10;
    }

}
