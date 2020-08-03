
package algorithm;

import static Frame.Callao.c;
import static Frame.Callao.tamano;
import model.Empleado;
import model.Lugar;
import java.util.ArrayList;


public class Floyd {
    private int p[][]=new int[tamano][tamano];
    public static ArrayList<Empleado> empleado=new ArrayList();
    public static ArrayList<Lugar> l=new ArrayList();
    public static String cad="";
    public Floyd(){
        iniciar();
        caminos();
    }
  
    
    public int cminimo(int i,int j){
        return c[i][j];
    }
    
    public void caminos(){
        int n=c.length;
        for(int k=0;k<n;k++)
            for(int i=0;i<n;i++)
                for(int j=0;j<n;j++){
                    if(c[i][k]+c[k][j]<c[i][j]){
                        c[i][j]=c[i][k]+c[k][j];
                        p[i][j]=k;
                    }
                }
    }
    
    
    public void iniciar(){
        for(int i=0;i<tamano;i++)
            for(int j=0;j<tamano;j++)
                p[i][j]=-1;
    }
    
    public String ruta (int i,int j){
        int k=p[i][j];
        if(k!=-1){
            ruta(i,k);
            cad=cad+(l.get(k).getNombre())+"\n";
            ruta(k,j);
        }
        return cad;
    }
    
    
    public int PosPorInfo(String x){
        int v=0;
        for(int i=0;i<l.size();i++){
            if(l.get(i).getNombre().equals(x)){
                v=i;
            }
        }
        return v;
    }
    
    
    public void llenarEmpleados(){
        Empleado em=new Empleado("Juan Perez",20,77150699,"Callao","juan","123");
        Empleado em1=new Empleado("Pedro Perez",20,77150699,"Callao","pedro","123");
        Empleado em2=new Empleado("Fernando Perez",20,77150699,"Callao","fernando","123");

        empleado.add(em);
        empleado.add(em1);
        empleado.add(em2);
    }
    
}
