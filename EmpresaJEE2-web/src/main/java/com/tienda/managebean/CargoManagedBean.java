/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.managebean;

import com.tienda.entidades.Carga;
import com.tienda.session.CargaFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Freddy-PC
 */
@Named(value = "cargoManagedBean")
@ViewScoped
public class CargoManagedBean implements Serializable, ManageBeanInterfaces<Carga> {

    @EJB
    private CargaFacadeLocal cargoFacadeLocal;

    private List<Carga> listaCargos;

    private Carga cargo;

    public CargoManagedBean() {
    }

    @PostConstruct
    public void init() {
        listaCargos = cargoFacadeLocal.findAll();
    }

    @Override
    public void nuevo() {
        cargo = new Carga();
    }

    @Override
    public void grabar() {
        try {
            if (cargo.getCodigo() == null) {
                cargoFacadeLocal.create(cargo);
            } else {
                cargoFacadeLocal.edit(cargo);
            }

            cargo = null;
            listaCargos = cargoFacadeLocal.findAll();
            mostrarMnesajeTry("Informacion Exitosa", FacesMessage.SEVERITY_ERROR);
        } catch (Exception e) {
            mostrarMnesajeTry("Ocurrio un error", FacesMessage.SEVERITY_ERROR);
        }

    }

    @Override
    public void seleccionar(Carga c) {
        cargo = c;
    }

    @Override
    public void eliminar(Carga c) {
        try {
            cargoFacadeLocal.remove(cargo);
            listaCargos = cargoFacadeLocal.findAll();
            mostrarMnesajeTry("Eliminado Exitoso", FacesMessage.SEVERITY_ERROR);
        } catch (Exception e) {
            mostrarMnesajeTry("Ocurio un erro", FacesMessage.SEVERITY_ERROR);
        }

    }

    @Override
    public void cancelar() {
        cargo = null;

    }

    public List<Carga> getListaCargos() {
        return listaCargos;
    }

    public void setListaCargos(List<Carga> listaCargos) {
        this.listaCargos = listaCargos;
    }

    public Carga getCargo() {
        return cargo;
    }

    public void setCargo(Carga cargo) {
        this.cargo = cargo;
    }

}
