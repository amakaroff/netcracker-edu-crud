
package com.nc.crudlib.model;

/**
 *
 * @author gc
 */
abstract public class Entity {
    
    private int id;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}