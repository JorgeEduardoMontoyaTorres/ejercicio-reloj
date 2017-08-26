//Clase reloj
class Reloj
{
    //Variables de instancia
    private int horas;
    private int minutos;
    
    //Constructor
    Reloj(int horasIni, int minutosIni)
    {
        horas = horasIni;
        minutos = minutosIni;
    }
    
    public String dimeTuTiempo()
    {
        String cadResult = "";
        cadResult += horas;
        cadResult += ":";
        cadResult += minutos;
        return cadResult;
    }
    
    public void ticTac()
    {
        if(minutos == 59)
        {
            minutos = 00;
            if(horas == 23)
            {
                horas = 00;
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
