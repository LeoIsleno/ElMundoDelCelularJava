package logica;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //Celulares
    public void registrarCelular(String nombre, String marcaIndex, String almacenamientoIndex, String ramIndex, String costo, String precio, String estado, String imei) {
        Celulares cel = new Celulares();
        cel.setNombreDisp(nombre);
        cel.setMarca(marcaIndex);
        cel.setAlmacenamiento(almacenamientoIndex);
        cel.setRam(ramIndex);
        cel.setCosto(costo);
        cel.setPrecio(precio);
        cel.setEstado(estado);
        cel.setImei(imei);
        controlPersis.guardarCelular(cel);
    }

    public List<Celulares> traerCelulares() {
        return controlPersis.traerCelulares();
    }

    public void EliminarCel(int id_Cel) {
        controlPersis.eliminarCelular(id_Cel);
    }

    public Celulares traerCelularBuscado(int id_Cel) {
        return controlPersis.traerCelularBuscado(id_Cel);
    }

    public void actualizarCelular(Celulares cel, String nombre, String marcaIndex, String almacenamientoIndex, String ramIndex, String costo, String precio, String imeiCel) {
        cel.setNombreDisp(nombre);
        cel.setMarca(marcaIndex);
        cel.setAlmacenamiento(almacenamientoIndex);
        cel.setRam(ramIndex);
        cel.setCosto(costo);
        cel.setPrecio(precio);
        cel.setImei(imeiCel);

        controlPersis.modificarCelular(cel);
    }

    //Ventas
    public void registrarVenta(LocalDate fechaActual, String nombreCliente, String numTelefono, String userResponsable, String formaPago, Celulares cel, String valorDejado, String detalles, String incluyeFunda, String incluyeVidrio, String incluyeCargador) {

        VentasCelulares venta = new VentasCelulares();

        venta.setNombreCliente(nombreCliente);
        venta.setNumeroCliente(numTelefono);
        venta.setFechaVenta(Date.from(fechaActual.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        venta.setCelular(cel);
        venta.setResponsable(userResponsable);
        venta.setFormaPago(formaPago);
        venta.setDetalles(detalles);
        venta.setValorDejado(valorDejado);
        venta.setFunda(incluyeFunda);
        venta.setVidrio(incluyeVidrio);
        venta.setCargador(incluyeCargador);
        cel.setEstado("Vendido");

        controlPersis.modificarCelular(cel);

        controlPersis.guardarVentaCelular(venta);
    }

    public List<VentasCelulares> traerRegistrosVentas() {
        return controlPersis.traerVentaCelulares();
    }

    //Usuarios
    public List<Usuarios> getUsers() {
        return controlPersis.traerUsuarios();
    }

    public void guardarUsuario(Usuarios user) {
        controlPersis.guardarUsuarior(user);
    }

    //Productos de Celulares
    public void registrarProducto(String codigo, String categoria, int costo, int precioUnitario, int stock, String nombre) {
        Productos prod = new Productos();

        prod.setCodigo(codigo);
        prod.setCategoria(categoria);
        prod.setCosto(costo);
        prod.setPrecioUnitario(precioUnitario);
        prod.setStock(stock);
        prod.setNombre(nombre);

        controlPersis.guardarProducto(prod);
    }

    public List<Productos> traerProductos() {
        return controlPersis.traerProductos();
    }

    public void EliminarProducto(int idProd) {
        controlPersis.eliminarProductos(idProd);
    }

    public Productos traerProductosBuscado(int idProd) {
        return controlPersis.traerProductoBuscado(idProd);
    }

    public void actualizarProducto(Productos prod/*int id, String codigo, String fecha, String categoria, String descripcion, int costo, int enStock, int precioUnitario*/) {
        /*Productos prod = new Productos();
        prod.setId(id);
        prod.setCodigo(codigo);
        prod.setCategoria(categoria);
        prod.setCosto(costo);
        prod.setPrecioUnitario(precioUnitario);
         */
        controlPersis.modificarProductos(prod);
    }

    public Productos buscarProductoCodigo(String cod) {

        List<Productos> list = traerProductos();

        for (int i = 0; i < list.size(); i++) {
            Productos prod = list.get(i);

            if (prod.getCodigo().equals(cod)) {
                System.out.println("Producto encontrado: " + prod.getNombre());
                return list.get(i);
            }
        }

        return null; // Por si no se encuentra ningún producto
    }

    public void registrarVentaProductos(int idUsuario, List<Productos> productosSeleccionados, LocalDate fechaVenta, String formaPago, String dni) {
        // Convertir LocalDate a Date
        Date date = Date.from(fechaVenta.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Crear una sola venta
        VentaProductos venta = new VentaProductos();
        venta.setFechaVenta(date);
        venta.setIdUsuario(String.valueOf(idUsuario));
        venta.setFormaPago(formaPago);
        venta.setDniCliente(dni);

        // Lista para almacenar los detalles de venta
        List<DetalleVentaProductos> detalles = new ArrayList<>();

        for (Productos producto : productosSeleccionados) {
            DetalleVentaProductos detalle = new DetalleVentaProductos();
            detalle.setVenta(venta);
            detalle.setProducto(producto); // Asociar el producto

            detalles.add(detalle);

            // Actualizar stock
            producto.setStock(producto.getStock() - 1);
            controlPersis.modificarProductos(producto);
        }

        // Asignar los detalles a la venta
        venta.setDetallesVenta(detalles);

        // Guardar venta (también guarda los detalles por cascade = ALL)
        controlPersis.guardarVentaProductos(venta);
    }

    //Equipos a reparacion
    public void registrarEquipo(String nombre, String numero, String descripcion, String eqEncendido, String moduloSano,
            String SIM, String bandejaSim, String bateria, String tapa, Date fechaIngreso, Date fechaRetiro, String reparacionRealizada,
            String formaPago, int costoRepuesto, int Total) {

        Reparaciones rep = new Reparaciones();

        rep.setNombre(nombre);
        rep.setNumero(numero);
        rep.setDescripcion(descripcion);
        rep.setEquipoEncendido(eqEncendido);
        rep.setModuloSano(moduloSano);
        rep.setSIM(SIM);
        rep.setBandejaSim(bandejaSim);
        rep.setBateria(bateria);
        rep.setTapa(tapa);
        rep.setFechaIngreso(fechaIngreso);
        rep.setFechaRetiro(fechaRetiro);
        rep.setReparacionRealizada(reparacionRealizada);
        rep.setFormaPago(formaPago);
        rep.setCostoRepuesto(costoRepuesto);
        rep.setTotal(Total);
        
        controlPersis.guardarReparacion(rep);

    }
}
