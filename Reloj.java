class Reloj
{
    private int horas;
    private int minutos;
    
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