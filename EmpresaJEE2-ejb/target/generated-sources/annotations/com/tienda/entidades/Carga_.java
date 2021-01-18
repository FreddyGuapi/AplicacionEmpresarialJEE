package com.tienda.entidades;

import com.tienda.entidades.Empleado;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-18T01:23:40")
@StaticMetamodel(Carga.class)
public class Carga_ { 

    public static volatile SingularAttribute<Carga, Integer> codigo;
    public static volatile ListAttribute<Carga, Empleado> empleadoList;
    public static volatile SingularAttribute<Carga, String> nombre;

}