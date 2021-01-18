/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.session;

import com.tienda.entidades.Carga;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Freddy-PC
 */
@Stateless
public class CargaFacade extends AbstractFacade<Carga> implements CargaFacadeLocal {

    @PersistenceContext(unitName = "TIENDAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CargaFacade() {
        super(Carga.class);
    }
    
}
