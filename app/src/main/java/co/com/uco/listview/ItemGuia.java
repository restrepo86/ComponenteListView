package co.com.uco.listview;

public class ItemGuia {

    private int idImagen;
    private String titulo;
    private String descripcion;


    public ItemGuia() {
    }

    public ItemGuia(int idImagen, String titulo, String descripcion) {
        this.idImagen = idImagen;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }


    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
