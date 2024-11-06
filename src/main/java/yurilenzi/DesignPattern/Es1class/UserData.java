package yurilenzi.DesignPattern.Es1class;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserData implements DataSource{
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
