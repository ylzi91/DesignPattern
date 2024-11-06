package yurilenzi.DesignPattern.Es1class;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Info {
    private String nome, congnome;
    private LocalDate dataDinascita;
}
