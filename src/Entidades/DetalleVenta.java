/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Leonardo
 */
public class DetalleVenta {

    private int id;
    private int ventaId;
    private int articuloId;
    private String articuloNombre;
    private int articuloStock;
    private int cantidad;
    private double precio;
    private double descuento;
    private double subTotal;

    public DetalleVenta(int id, int ventaId, int articuloId, String articuloCodigo, int articuloStock, int cantidad, double precio, double descuento, double subTotal) {
        this.id = id;
        this.ventaId = ventaId;
        this.articuloId = articuloId;
        this.articuloNombre = articuloNombre;
        this.articuloStock = articuloStock;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.subTotal = subTotal;
    }

    public DetalleVenta(int articuloId, String articuloNombre, int articuloStock, int cantidad, double precio, double descuento, double subTotal) {
        this.articuloId = articuloId;
        this.articuloNombre = articuloNombre;
        this.articuloStock = articuloStock;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.subTotal = subTotal;
    }

    public DetalleVenta(int articuloId, int cantidad, double precio, double descuento) {
        this.articuloId = articuloId;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public int getArticuloId() {
        return articuloId;
    }

    public void setArticuloId(int articuloId) {
        this.articuloId = articuloId;
    }

    public String getArticuloNombre() {
        return articuloNombre;
    }

    public void setArticuloNombre(String articuloNombre) {
        this.articuloNombre = articuloNombre;
    }

    public int getArticuloStock() {
        return articuloStock;
    }

    public void setArticuloStock(int articuloStock) {
        this.articuloStock = articuloStock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    

}
