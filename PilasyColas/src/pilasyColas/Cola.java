package pilasyColas;


class Nodo4{
	int elemento;
	Nodo4 siguiente;
	
	public Nodo4(int elemento){
		this.elemento=elemento;
	}
}
public class Cola {

	Nodo4 inicio;
	
	void add(int elemento){

		if(inicio==null){
		inicio= new Nodo4(elemento);
		}
		else{
		Nodo4 tmp=inicio;
		inicio= new Nodo4(elemento);
		inicio.siguiente=tmp;
		}
	}
	
	void remove(){
		Nodo4 tmp=inicio,anterior=null;
		if(tmp==null)
			System.out.println("No hay elemento para borrar.");
		else{
			while(tmp!=null){
				if(tmp.siguiente==null){
					anterior.siguiente=tmp.siguiente;
					break;
				}
				anterior=tmp;
				tmp=tmp.siguiente;		
			}
			
		}
	}
	
	
	void imprimir(){
		Nodo4 tmp=inicio;
		if(tmp==null)
			System.out.println("Lista vacia.");
		else{
			System.out.print("[");
			while(tmp!=null){
				System.out.print(tmp.elemento+" ");
				tmp=tmp.siguiente;
			}
			System.out.print("]");
		}
	}
	
	public static void main(String[] args) {
		
		Cola cola=new Cola();
		cola.add(5);
		cola.add(15);
		cola.add(25);
		cola.add(35);
		cola.add(45);
		System.out.println();
		cola.imprimir();
		cola.remove();
		cola.remove();
		cola.remove();
		System.out.println();
		cola.imprimir();
		cola.add(100);
		cola.remove();
		cola.remove();
		//cola.remove();
		System.out.println();
		cola.imprimir();
		
		
	}

}
