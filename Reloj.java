
public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int hrs, int min)
    {
        horas = hrs;
        minutos = min;
    }
    
    public String tuTiempo()
    {
        String cadResultado = "";
        
        if(minutos<59)
        {
            if(horas<24)
            {
                cadResultado = cadResultado + horas;
                cadResultado = cadResultado + "0";
                cadResultado = cadResultado + ":";
                cadResultado = cadResultado + "0";
                cadResultado = cadResultado + minutos;
                
                return cadResultado;
            }
        }
        else
        {
          cadResultado = cadResultado + horas;
          cadResultado = cadResultado + ":";
          cadResultado += minutos;
           return cadResultado; 
        }
        return cadResultado;
    }
    
    public void TicTac()
    {
        if (minutos<59)
        {
            minutos = minutos +1;
        }
        else
        {
            if(horas<23)
            {
                horas = horas +1;
            }
            else 
            {
                horas = 00;
                minutos = 00;
            }
            minutos = 00;
        }
    }
}
