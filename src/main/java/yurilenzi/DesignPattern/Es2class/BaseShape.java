package yurilenzi.DesignPattern.Es2class;

public abstract class BaseShape implements Shape {
    public String testoPagina;
    public int nPagine;
    public int nSottoSezioni;
    public int nSezioni;

    public BaseShape() {

    }

    @Override
    public String getTestoPagina() {
        return testoPagina;
    }

    @Override
    public int getNPagine() {
        return nPagine;
    }

    @Override
    public int getNSottosezioni() {
        return nSottoSezioni;
    }

    @Override
    public int getNsezioni() {
        return nSezioni;
    }
}
