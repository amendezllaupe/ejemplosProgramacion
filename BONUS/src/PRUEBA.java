/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hypoc
 */
public class PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2 PRODUCTOS FRESCOS
        Fresco fresco1 = new Fresco("27/08/2017", 123456, "10/08/2017", "Chile");
        Fresco fresco2 = new Fresco("30/12/2019", 120013, "20/12/2019", "Perú");
        //3 REFRIGERADOS
        Refrigerado refrigerado1 = new Refrigerado("01/06/2018", 663662, "29/05/2017", "Alemania", 0220, 10);
        Refrigerado refrigerado2 = new Refrigerado("30/05/2018", 665998, "01/05/2017", "Japón", 4889, 15);
        Refrigerado refrigerado3 = new Refrigerado("30/06/2018", 667789, "04/06/2017", "Argentina", 9900, 5);
        //5 CONGELADOS
        Agua agua1 = new Agua("15/03/2020", 221332, "29/05/2017", "Chile", -1, 0.1);
        Agua agua2 = new Agua("29/03/2021", 221233, "29/05/2017", "Corea del Sur", -4, 0.23);
        Aire aire1 = new Aire("30/12/2019", 441132, "04/06/2017", "Turquía", -1, 30, 35, 15, 20);
        Aire aire2 = new Aire("30/12/2018", 441134, "04/04/2017", "Croacia", -3, 20, 30, 30, 20);
        Nitrogeno nitrogeno1 = new Nitrogeno("29/05/2027", 303030, "29/05/2017", "Rusia", -10, "Nitrogeno: KA12", 60);
        //EXTRA
        Aire aire3 = new Aire("30/12/2019", 123456, "29/12/2017", "Chile", -3, 20, 20, 20, 40);

        //MOSTRAR FRESCO 1
        System.out.println("Producto fresco 1");
        System.out.println("Número de Lote: " + fresco1.getNumeroLote());
        System.out.println("País de Origen: " + fresco1.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + fresco1.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + fresco1.getFechaCaducidad());
        System.out.println("");
        //MOSTRAR FRESCO 2
        System.out.println("Producto fresco 2");
        System.out.println("Número de Lote: " + fresco2.getNumeroLote());
        System.out.println("País de Origen: " + fresco2.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + fresco2.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + fresco2.getFechaCaducidad());
        System.out.println("");
        //MOSTRAR REFRIGERADO 1
        System.out.println("Producto Refrigerado 1");
        System.out.println("Número de Lote: " + refrigerado1.getNumeroLote());
        System.out.println("País de Origen: " + refrigerado1.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + refrigerado1.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + refrigerado1.getFechaCaducidad());
        System.out.println("Código del organismo de supervisión alimentaria: " + refrigerado1.getCodigoOrganismo());
        System.out.println("Temperatura Recomedada: " + refrigerado1.getTemperatura() + " °C");
        System.out.println("");
        //MOSTRAR REFRIGERADO 2
        System.out.println("Producto Refrigerado 2");
        System.out.println("Número de Lote: " + refrigerado2.getNumeroLote());
        System.out.println("País de Origen: " + refrigerado2.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + refrigerado2.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + refrigerado2.getFechaCaducidad());
        System.out.println("Código del organismo de supervisión alimentaria: " + refrigerado2.getCodigoOrganismo());
        System.out.println("Temperatura Recomedada: " + refrigerado2.getTemperatura() + " °C");
        System.out.println("");
        //MOSTRAR CONGELADO 1: AGUA
        System.out.println("Producto Congelado 1: por Agua");
        System.out.println("Número de Lote: " + agua1.getNumeroLote());
        System.out.println("País de Origen: " + agua1.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + agua1.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + agua1.getFechaCaducidad());
        System.out.println("Temperatura Recomedada: " + agua1.getTemperatura() + " °C");
        System.out.println("Salinidad del Agua: " + agua1.getSalinidad() + " gramos/litro");
        System.out.println("");
        //MOSTRAR CONGELADO 2: AGUA
        System.out.println("Producto Congelado 2: por Agua");
        System.out.println("Número de Lote: " + agua2.getNumeroLote());
        System.out.println("País de Origen: " + agua2.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + agua2.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + agua2.getFechaCaducidad());
        System.out.println("Temperatura Recomedada: " + agua2.getTemperatura() + " °C");
        System.out.println("Salinidad del Agua: " + agua2.getSalinidad() + " gramos/litro");
        System.out.println("");
        //MOSTRAR CONGELADO 3: Aire
        System.out.println("Producto Congelado 3: por Aire");
        System.out.println("Número de Lote: " + aire1.getNumeroLote());
        System.out.println("País de Origen: " + aire1.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + aire1.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + aire1.getFechaCaducidad());
        System.out.println("Temperatura Recomedada: " + aire1.getTemperatura() + " °C");
        System.out.println("Porcentaje de Nitrógeno: "+ aire1.getNitrogeno()+"%");
        System.out.println("Porcentaje de Vapor de Agua: "+ aire1.getVaporAgua()+"%");
        System.out.println("Porcentaje de Oxígeno: "+ aire1.getOxigeno()+"%");
        System.out.println("Porcentaje de Dioxido de Carbono: " + aire1.getDioxidoCarbono()+"%");
        System.out.println("");
        //MOSTRAR CONGELADO 4: AIRE
        System.out.println("Producto Congelado 4: por Aire");
        System.out.println("Número de Lote: " + aire2.getNumeroLote());
        System.out.println("País de Origen: " + aire2.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + aire2.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + aire2.getFechaCaducidad());
        System.out.println("Temperatura Recomedada: " + aire2.getTemperatura() + " °C");
        System.out.println("Porcentaje de Nitrógeno: "+ aire2.getNitrogeno()+"%");
        System.out.println("Porcentaje de Vapor de Agua: "+ aire2.getVaporAgua()+"%");
        System.out.println("Porcentaje de Oxígeno: "+ aire2.getOxigeno()+"%");
        System.out.println("Porcentaje de Dioxido de Carbono: " + aire2.getDioxidoCarbono()+"%");
        System.out.println("");
        //MOSTRAR CONGELADO 5: NITROGENO
        System.out.println("Producto Congelado 5: por Nitrogeno");
        System.out.println("Número de Lote: " + nitrogeno1.getNumeroLote());
        System.out.println("País de Origen: " + nitrogeno1.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + nitrogeno1.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + nitrogeno1.getFechaCaducidad());
        System.out.println("Temperatura Recomedada: " + nitrogeno1.getTemperatura() + " °C");
        System.out.println("Método de Congelación Emlpleado: "+ nitrogeno1.getMetodo());
        System.out.println("Tiempo de Exposición al Nitrogeno: "+ nitrogeno1.getTiempo()+ " segundos");
        System.out.println("");
        
        System.out.println("Producto Congelado 6: por Aire");
        System.out.println("Número de Lote: " + aire3.getNumeroLote());
        System.out.println("País de Origen: " + aire3.getPaisOrigen());
        System.out.println("Fecha de Envasado: " + aire3.getFechaEnvase());
        System.out.println("Fecha de Caducidad: " + aire3.getFechaCaducidad());
        System.out.println("Temperatura Recomedada: " + aire3.getTemperatura() + " °C");
        System.out.println("Porcentaje de Nitrógeno: "+ aire3.getNitrogeno()+"%");
        System.out.println("Porcentaje de Vapor de Agua: "+ aire3.getVaporAgua()+"%");
        System.out.println("Porcentaje de Oxígeno: "+ aire3.getOxigeno()+"%");
        System.out.println("Porcentaje de Dioxido de Carbono: " + aire3.getDioxidoCarbono()+"%");
        System.out.println("");
    }

}
