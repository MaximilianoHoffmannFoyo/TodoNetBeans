
package loteriaNacional;

public class PruebaLoteria {

    /*
     */
    public static void main(String[] args) {
        
        LoteriaNacional loteria = new LoteriaNacional();
        
        loteria.rellenarPremios(1000);
//        loteria.prueba();
        
        loteria.mostrarContenido();
        
        loteria.consultarboleto("34077");
    }
    
}
