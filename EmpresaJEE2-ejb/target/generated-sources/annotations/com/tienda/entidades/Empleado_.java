package com.tienda.entidades;

import com.tienda.entidades.Carga;
import com.tienda.entidades.EstadoCivil;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-01-18T01:23:40")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Integer> codigo;
    public static volatile SingularAttribute<Empleado, Date> fechaNacimiento;
    public static volatile SingularAttribute<Empleado, String> cedula;
    public static volatile SingularAttribute<Empleado, String> apellido;
    public static volatile SingularAttribute<Empleado, EstadoCivil> codigoEstadoCivil;
    public static volatile SingularAttribute<Empleado, Carga> codigoCargo;
    public static volatile SingularAttribute<Empleado, String> nombre;

}