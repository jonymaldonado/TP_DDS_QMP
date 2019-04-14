package pojo;

import java.util.ArrayList;

import prendas.Accesorio;
import prendas.Calzado;
import prendas.Inferior;
import prendas.Superior;

public class Guardarropa {
	public String nombre;
	private ArrayList<Inferior> prendasInferiores = new ArrayList<Inferior>();
	private ArrayList<Superior> prendasSuperiores = new ArrayList<Superior>();
	private ArrayList<Accesorio> accesorios = new ArrayList<Accesorio>();
	private ArrayList<Calzado> calzados = new ArrayList<Calzado>();
	
	public Guardarropa(String nombre) {
		this.nombre=nombre;
	}
	
	public ArrayList<Inferior> getPrendasInferiores() {
		return prendasInferiores;
	}
	public void setPrendasInferiores(ArrayList<Inferior> prendasInferiores) {
		this.prendasInferiores = prendasInferiores;
	}
	public ArrayList<Superior> getPrendasSuperiores() {
		return prendasSuperiores;
	}
	public void setPrendasSuperiores(ArrayList<Superior> prendasSuperiores) {
		this.prendasSuperiores = prendasSuperiores;
	}
	public ArrayList<Accesorio> getAccesorios() {
		return accesorios;
	}
	public void setAccesorios(ArrayList<Accesorio> accesorios) {
		this.accesorios = accesorios;
	}
	public ArrayList<Calzado> getCalzados() {
		return calzados;
	}
	public void setCalzados(ArrayList<Calzado> calzados) {
		this.calzados = calzados;
	}
	public void agregarCalzado(Calzado calzado){
		calzados.add(calzado);
	}
	public void agregarSuperior(Superior superior){
		prendasSuperiores.add(superior);
	}
	public void agregarInferior(Inferior inferior){
		prendasInferiores.add(inferior);
	}
	public void agregarAccesorio(Accesorio acce){
		accesorios.add(acce);
	}
	public Inferior obtenerInf() {
		return prendasInferiores.get(obtenerAleatorio(prendasInferiores.size()));
	}
	public Superior obtenerSup() {
		return prendasSuperiores.get(obtenerAleatorio(prendasSuperiores.size()));
	}
	public Calzado obtenerCalzado() {
		return calzados.get(obtenerAleatorio(calzados.size()));
	}
	public Accesorio obtenerAccesorio() {
		return accesorios.get(obtenerAleatorio(accesorios.size()));	
	}
	public int obtenerAleatorio(int tamaño) {
		int numero = (int)(Math.random()*tamaño);
		return numero;
	}
	public int cantAtuendos() {
		//devuelve la cantidad posible de atuendos
		return accesorios.size() * calzados.size() * prendasSuperiores.size() * prendasInferiores.size();
	}

	public Atuendo crearAtuendo(Guardarropa armario) {
		Atuendo atuendo = new Atuendo();
		atuendo.setAccesorio(armario.obtenerAccesorio());
		atuendo.setCalzado(armario.obtenerCalzado());
		atuendo.setPrendaInferior(armario.obtenerInf());
		atuendo.setPrendaSuperior(armario.obtenerSup());
		return atuendo;
	}

	public boolean chequeo(int cantidad) {
		if (cantAtuendos()==cantidad) {
			return true;
		}
		return false;
	}
}
