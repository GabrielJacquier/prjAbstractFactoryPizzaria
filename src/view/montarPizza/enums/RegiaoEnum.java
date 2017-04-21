/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.montarPizza.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author gabriel
 */
public enum RegiaoEnum {
    MINAS_GERAIS("Minas Gerais"),
    SAO_PAULO("São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro");
    
    private String label;
    
    RegiaoEnum(String regiaoLabel) {
        this.label = regiaoLabel;
    }
    
    public String getLabel() {
        return label;
    }
    
    public static List<RegiaoEnum> valuesList() {
        return Arrays.stream(RegiaoEnum.values()).collect(Collectors.toList());
    }
    
    public RegiaoEnum getEnum(String label) {
        List<RegiaoEnum> regioes = Arrays.stream(RegiaoEnum.values()).collect(Collectors.toList());
        return regioes.stream().filter(regiao -> regiao.getLabel().equals(label)).findFirst().get();
    }
}
