/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embasa.fcom.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author t013384
 */
public class Entity {

    private String param;

    private TypeParamSQL TYPE;

    private List<Object> values = new ArrayList<Object>();

    public Entity(String param, TypeParamSQL TYPE) {
        setParam(param);
        this.TYPE = TYPE;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public List<Object> getValue() {
        return values;
    }

    public TypeParamSQL getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        Entity entity = this;

        if (entity.getTYPE().equals(TypeParamSQL.NUMERIC) || entity.getTYPE().equals(TypeParamSQL.FILTER)) {
            return entity.getValue().get(0).toString();
        }
        if (entity.getTYPE().equals(TypeParamSQL.TEXT)) {
            return "'" + entity.getValue().get(0).toString() + "'";
        }
        if (entity.getTYPE().equals(TypeParamSQL.NULL)) {
            return entity.getValue().get(0).toString();
        }
        if (entity.getTYPE().equals(TypeParamSQL.LIST_NUMERIC)) {
            String list = null;
            for (Object e : entity.getValue()) {
                if (entity.getValue().size() == 1) {
                    list = e.toString();
                } else {
                    if (list == null) {
                        list = e.toString();
                    } else {
                        list = list + "," + e.toString();
                    }
                }
            }
            return list;
        }
        return null;
    }

    @Override
    public boolean equals(Object entity) {
        // TODO Auto-generated method stub
        return getParam().equalsIgnoreCase(((Entity) entity).getParam());
    }
}
