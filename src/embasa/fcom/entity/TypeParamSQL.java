/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embasa.fcom.entity;

/**
 *
 * @author t013384
 */
public enum TypeParamSQL {

    NUMERIC(0),
    TEXT(1),
    LIST_NUMERIC(2),
    LIST_TEXT(4),
    FILTER(3),
    NULL(5);

    private Integer cod;

    TypeParamSQL(int cod) {
        this.cod = cod;
    }

    public Integer getCod() {
        return cod;
    }

}
