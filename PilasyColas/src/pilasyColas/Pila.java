package pilasyColas;


class Nodo3{
	int elemento;
	Nodo3 siguiente; 
	
	Nodo3(int elemento){
		this.elemento=elemento;
		siguiente=null;
	}
	
}

public class Pila {
	
	Nodo3 inicio;
	
	void push(int elemento){

		if(inicio==null)
		inicio= new Nodo3(elemento);
		else{
		Nodo3 tmp=inicio;
		inicio= new Nodo3(elemento);
		inicio.siguiente=tmp;
		}
	}
	
	void pop(){
		if(inicio==null)
			System.out.println("No hay elemento para borrar.");
		else{
		inicio=inicio.siguiente;
		}
	}
	
	
	void mostrar(){
		Nodo3 tmp=inicio;
		
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
	
		Pila pila=new Pila();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.mostrar();
		System.out.println();
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();
		pila.pop();
		System.out.println();
		pila.mostrar();
		
			

	}

}
