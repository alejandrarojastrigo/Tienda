package categoria.control;

import categoria.entity.Categoria;
import categoria.entity.NoExisteCategoria;
import java.util.ArrayList;
import java.util.Iterator;

public class Categorias {
	
	private ArrayList<Categoria> categorias;
	private int cantidad;
	private int ultimo;
	
	public Categorias() {
		
		categorias= new ArrayList<Categoria>();
		cantidad=0;
		ultimo=-1;
	}
	public void ingresar(Categoria categoria) throws java.lang.ArrayIndexOutOfBoundsException {
		categorias.add(categoria);
//		categorias[++ultimo]=categoria;
	}
	public void eliminar(int codCategoria) throws NoExisteCategoria {
		int indice;
		indice= buscar(codCategoria);
		categorias.remove(indice);
		/*int indice= buscar(codCategoria);
		ArrayList<Categoria> categorias;
		if(indice>=0) {
			if(indice!= ultimo) {
				for(int i=indice;i<ultimo;i++) {
					//Recorrer todos los elementos a partir de i
					categorias.get(i)= categorias.get(i+1);
//					categorias[i]=categorias[i+1];
				}
			}
			ultimo--;
			cantidad--;
		}*/
	}
	
//	public int getCantidad() {
//		return cantidad;
//	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int buscar(int codCategoria) throws NoExisteCategoria {
		Categoria categoria=null;
		int indice=-1;
//		El iterador verifica los elementos del arreglo que se le propone
		for(Iterator<Categoria> iterator= categorias.iterator(); iterator.hasNext();) {

			categoria= iterator.next();
			if(codCategoria== categoria.getCodCategoria()) {
				indice=categorias.indexOf(categoria);
			}
					}
		
		if(indice==-1) {
			throw new NoExisteCategoria();
		}
		
		/*while(i<= ultimo) {
			if(codCategoria==categorias[i].getCodCategoria() ) {
				indice=i;
				break;
			}
			i++;
		}*/
		return indice;
	}
	
	/*public int buscarCategoria(int codCategoria) throws NoExisteCategoria {
		int valor=-1;
		
		for(int i=0; i<=ultimo; i++) {
			if(codCategoria==categorias[i].getCodCategoria()) {
				valor=i;
				
			}
		}
		if (valor == -1) {
			throw new NoExisteCategoria();
		}
		
		return valor;
	}*/
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

}

