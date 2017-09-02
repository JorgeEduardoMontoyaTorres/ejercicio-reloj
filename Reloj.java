/**
 * Se crea la clase reloj para mostrar un objeto reloj en pantalla.
 * @version 26 agosto 2017
 */
class Reloj
{
    private int horas;
    private int minutos;
    
    /**
     * Muestra el reloj en pantalla.
     * @param horasIni Muestra las horas.
     * @param minutosIni Muestra los minutos.
     */
    Reloj(int horasIni, int minutosIni)
    {
        if(horasIni > 23)
        {
            horas = 0;
            if(minutosIni > 59)
            {
                minutos = 0;
            }
            else
            {
                minutos = minutosIni;
            }
        }
        else
        {
            horas = horasIni;
            if(minutosIni > 59)
            {
                minutos = 0;
            }
            else
            {
                minutos = minutosIni;
            }
            
        }   
    }
    
    /**
     * Muestra el tiempo actual en la pantalla.
     * @return Muestra las horas y los minutos.
     */    
    public String dimeTuTiempo()
    {
        String cadResult = "";
        
        if(horas == 0)
        {
            cadResult += "00";
            cadResult += ":";
            if(minutos == 0)
            {
                cadResult += "00";
            }
            else
            {
                if(minutos < 10)
                {
                    cadResult += "0";
                    cadResult += minutos;
                }
                else
                {
                    cadResult += minutos;
                }
            }
        }
        else
        {
            if(horas < 10)
            {
                cadResult += "0";
                cadResult += horas;
                cadResult += ":";
                
            }
            else
            {
                cadResult += horas;
                cadResult += ":";
            }
            if(minutos == 0)
            {
                cadResult += "00";
            }
            else
            {
                if(minutos < 10)
                {
                    cadResult += "0";
                    cadResult += minutos;
                }
                else
                {
                    cadResult += minutos;
                }
            }
        }
        return cadResult;
    }
    
    /**
     * Hace el conteo, simulando el reloj, contando hasta 23 horas y 59 minutos.
     */
    public void ticTac()
    {
        if(minutos == 59)
        {
            minutos = 0;
            if(horas == 23)
            {
                horas = 0;
            }
            else
            {
                horas ++;
            }
            
        }
        else 
        {
            minutos++;
        }
    }
}