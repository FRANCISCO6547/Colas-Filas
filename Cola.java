import java.util.*;
public class Cola{
    private ArrayList laCola;
    public Cola(){
          laCola=new ArrayList();
    }
    public void poner(Object obj){
           int s=laCola.size();
           laCola.add(s,obj);
    }
    public Object quitar(){
           int n=laCola.size()-1;
           Object x=laCola.get(n);
           laCola.remove(n);
           System.out.println("El removido:"+x);
           return x;
    }
    public void decolar(){
           int m=laCola.size();
           for(int i=0;i<m;i++){
               laCola.remove(0);
           }
    }
    public void imprimir(){
           System.out.println(laCola);
    }
}
