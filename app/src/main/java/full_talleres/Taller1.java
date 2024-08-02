/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

import java.util.Scanner;

public class Taller1 {
    
    public static void main(String[] args) {
        System.out.println(Convertir_km_seg(40));
        System.out.println(Convertir_cm_lt(90));
        System.out.println(Convertir_us_cops(100));
        System.out.println(Convertir_cent_far(32));
        System.out.println(Calcular_segs((short)2,(short)5,(short)10,(short)59));
        System.out.println(Calcular_peso_carga(7,4));
        System.out.println(Calcular_horasxviaje("manizales", (short)240, (short)60));
        System.out.println(Calcular_combustible(638, 312, 1243, 220));
        System.out.println(Calcular_peso_luna((byte)80));
    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int velocidad){
        try {
            String ms = "", mh = "",retorno="";
            int rms = 0; 
            final int km_a_m = 1000, s_a_h = 3600;
            rms += velocidad*km_a_m;
            mh += rms*s_a_h;
            ms+=rms;
            retorno = ms +" m/s - "+mh +" m/h";
            return retorno;
            
        } catch (Exception e) {
            return "Error en la conversion";
        }

    }

    

    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt(double cc){
        try {
            float lt = 0;
            final float conver=1000;
            lt=(float)cc/conver;
            return lt;

        } catch (Exception e) {
            return 0;
     }
    }
        
  
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   public static int Convertir_us_cops(int dolares){
        try {
            int pesos=0;
            final int dolar_hoy= 4170;
            pesos=dolares*dolar_hoy;
            return pesos;

        } catch (Exception e) {
            return -1;
    }
   }
    
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
   public static double Convertir_cent_far(double centigrados){
        try {
            double fahrenheit=0;
            fahrenheit= 32+(9*centigrados/5);
            return fahrenheit;
        } catch (Exception e) {
            return 0;
        }
   }
          

   
   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
  public static int Calcular_segs(short dias, short hor, short min, short seg){
        try {
            int total=0, r1=0, r2=0, r3=0;
            final int dia_seg=86400, hor_seg=3600, min_seg=60;
            r1=dias*dia_seg;
            r2=hor*hor_seg;
            r3=min*min_seg;
            if (dias >= 0 && hor >= 0 && min >= 0 && seg >= 0) {
                total=r1+r2+r3+seg;
                return total;
             } else {
                return -1;
             }
            
            

        } catch (Exception e) {
            return -1;
        }
  }

   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga(float camion_carga, float camion_sin){
    try {
        String peso_kilos="", peso_ton="", resultado="";
        float peso_carga;
        peso_carga = camion_carga-camion_sin;
        peso_ton += peso_carga;
        peso_kilos += peso_carga*1000;
        resultado = peso_kilos+" kilos - "+peso_ton+" toneladas";
        return resultado;

    } catch (Exception e) {
        return "Error en la función Calcular_peso_carga";
    }
   }
        

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
   public static float Calcular_horasxviaje(String destino, short distancia, short velocidad){
        try {
            float t_viaje=0;
            t_viaje=distancia/velocidad;
            return t_viaje;

        } catch (Exception e) {
            return -1;
        }
   }
  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
   public static float Calcular_combustible(int viaje_1, int viaje_2, int viaje_3, int viaje_4){
        try {
            float total_combustible = 0;
            double gasto_viaje1=0, gasto_viaje2=0, gasto_viaje3=0, gasto_viaje4=0;
            final double combustible_desp = 1.2, combustible_aterr = 0.4, distancia_combustible = 60.8, ton_combustible = 0.2;
            gasto_viaje1= ((viaje_1/distancia_combustible)*ton_combustible)+combustible_desp+combustible_aterr;
            gasto_viaje2= ((viaje_2/distancia_combustible)*ton_combustible)+combustible_desp+combustible_aterr;
            gasto_viaje3= ((viaje_3/distancia_combustible)*ton_combustible)+combustible_desp+combustible_aterr;
            gasto_viaje4= ((viaje_4/distancia_combustible)*ton_combustible)+combustible_desp+combustible_aterr;
            total_combustible= (float)(gasto_viaje1+gasto_viaje2+gasto_viaje3+gasto_viaje4);
            return total_combustible;

        } catch (Exception e) {
            return -1;
            
        }

   }
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
  public static double Calcular_peso_luna(byte peso_kilos){
        try {
            double peso_luna=0, peso_tierra=0;
            final double gravedad_tierra = 9.81, conversor_luna=0.165;
            peso_tierra = peso_kilos*gravedad_tierra; 
            peso_luna= peso_tierra*conversor_luna;
            return peso_luna;

        } catch (Exception e) {
            return 0;
        }
  }
   
}
