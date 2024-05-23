package logica;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Celulares;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-05-23T16:43:50", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(VentasCelulares.class)
public class VentasCelulares_ { 

    public static volatile SingularAttribute<VentasCelulares, String> responsable;
    public static volatile SingularAttribute<VentasCelulares, String> nombreCliente;
    public static volatile SingularAttribute<VentasCelulares, String> numeroCliente;
    public static volatile SingularAttribute<VentasCelulares, Celulares> celular;
    public static volatile SingularAttribute<VentasCelulares, Integer> id;
    public static volatile SingularAttribute<VentasCelulares, String> formaPago;
    public static volatile SingularAttribute<VentasCelulares, Date> fechaVenta;

}