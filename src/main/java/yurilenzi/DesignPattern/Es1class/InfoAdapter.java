package yurilenzi.DesignPattern.Es1class;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter extends UserData{

    Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome()+ " " + info.getCongnome();
    }

    @Override
    public int getEta() {
        return Period.between(info.getDataDinascita(), LocalDate.now()).getYears();
    }
}
