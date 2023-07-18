
package challengealura.convertir;

public abstract interface Unidad {
    
    public abstract void transformar(String convertir, double valor);
    public String conversorMenu();
    public void verificar();
    public void proceso();
}
