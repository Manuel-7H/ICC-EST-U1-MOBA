public class MetodoOrdenamiento {
    public int []  sortBubbleAva(int[]arreglo){
        int n = arreglo.length;
        boolean intercambio=false;
        for(int i=0; i<n; i++){
            System.out.println("pasada"+i);
            for(int j=0; j<n-1;j++){
                intercambio=false;
                System.out.println("j="+j+"[j+1]="+arreglo[j]+"j+1");
                if(arreglo[j]>arreglo[j+1]){
                    int aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
intercambio=true;
                }
                if(intercambio){
                    break;
                }
            }
            return arreglo;
        }
        
        public void prinArreglo(int[]arreglo){
            for(int num: arreglo){
                System.out.println(arr);
            }
        }
    }
}
