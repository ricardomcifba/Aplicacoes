/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embasa.fcom.service;

import embasa.fcom.dao.DAO;
import embasa.fcom.entity.Entity;
import embasa.fcom.entity.Functionality;
import java.util.List;

/**
 *
 * @author t013384
 */
public class Service extends ServiceUtils {

    public void processData(Object object, Functionality function, Entity... entiteis) {
        List<Entity> listEntity = extractParam(object);
        for (Entity e : entiteis) {
            listEntity.add(e);
        }
        System.out.println(listEntity);
        new DAO(function).executeSQL(listEntity);
    }
    
    public String printData(Object object, Functionality function, Entity... entiteis) {
        List<Entity> listEntity = extractParam(object);
        for (Entity e : entiteis) {
            listEntity.add(e);
        }
        return new DAO(function).printSQL(listEntity);
    }
    

}
