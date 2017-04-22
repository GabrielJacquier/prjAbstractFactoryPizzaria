/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.comum.enums;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import model.comum.factory.IngredienteFactory;
import model.minasgerais.factory.IngredienteMGFactory;
import model.riodejaneiro.factory.IngredienteRJFactory;
import model.saopaulo.factory.IngredienteSPFactory;

/**
 *
 * @author gabriel
 */
public enum RegiaoEnum {
    MINAS_GERAIS("Minas Gerais", IngredienteMGFactory.class),
    SAO_PAULO("São Paulo",IngredienteSPFactory.class),
    RIO_DE_JANEIRO("Rio de Janeiro", IngredienteRJFactory.class);

    private String label;
    private Class<? extends IngredienteFactory> classeFactory;
    
    RegiaoEnum(String regiaoLabel, Class<? extends IngredienteFactory> classeFactory) {
        this.label = regiaoLabel;
        this.classeFactory = classeFactory;
    }
    
    public String getLabel() {
        return label;
    }
    
    public static List<RegiaoEnum> valuesList() {
        return Arrays.stream(RegiaoEnum.values()).collect(Collectors.toList());
    }
    
    public static RegiaoEnum getEnum(String label) {
        List<RegiaoEnum> regioes = Arrays.stream(RegiaoEnum.values()).collect(Collectors.toList());
        return regioes.stream().filter(regiao -> regiao.getLabel().equals(label)).findFirst().get();
    }
    
    public IngredienteFactory getinstance() {
        try {
            return classeFactory.newInstance();
        } catch (Exception ex) {
            Logger.getLogger(RegiaoEnum.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
