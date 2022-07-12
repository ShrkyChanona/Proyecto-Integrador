package pintegrador;

public class Ficha {
    
    String Donante,Correo,Comentario;
    
    public Ficha(String donante, String correo, String comentario)
    {
        this.Donante = donante;
        this.Correo = correo;
        this.Comentario = comentario;
    }
    

    public String getDonante() {
        return Donante;
    }

    public void setDonante(String Donante) {
        this.Donante = Donante;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    @Override
    public String toString() {
        return "Donante: " + Donante + "\n"
                + ", Correo: " + Correo + "\n" 
                + ", Comentario: " + Comentario;
    }
    
    
}
