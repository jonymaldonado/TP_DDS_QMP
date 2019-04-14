package pojo;
import prendas.Accesorio;
import prendas.Calzado;
import prendas.Inferior;
import prendas.Superior;
import java.util.Scanner;
import java.util.ArrayList;

public class Usuario {
	private ArrayList<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
	private ArrayList<Atuendo> atuendos = new ArrayList<Atuendo>();
	String nombre;
	
	public ArrayList<Guardarropa> getGuardarropas() {
		return guardarropas;
	}
	public void setGuardarropas(ArrayList<Guardarropa> guardarropas) {
		this.guardarropas = guardarropas;
	}
	public ArrayList<Atuendo> getAtuendos() {
		return atuendos;
	}
	public void setAtuendos(ArrayList<Atuendo> atuendos) {
		this.atuendos = atuendos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static void main(String[] args) {
		Inferior pantalon = new Inferior("pantalon",1);
		Superior remera = new Superior("remera",1);
		Accesorio reloj = new Accesorio("reloj",1);
		Calzado zapatillas = new Calzado("zapatillas",1);
		Inferior pantalon2 = new Inferior("bermuda",2);
		Superior remera2 = new Superior("musculosa",2);
		Accesorio reloj2 = new Accesorio("gorra",2);
		Calzado zapatillas2 = new Calzado("ojotas",2);
		Guardarropa armario = new Guardarropa("armario");
		ArrayList<Atuendo> atuendos = new ArrayList<Atuendo>();
		armario.agregarAccesorio(reloj);
		armario.agregarAccesorio(reloj2);
		armario.agregarCalzado(zapatillas);
		armario.agregarCalzado(zapatillas2);
		armario.agregarInferior(pantalon);
		armario.agregarInferior(pantalon2);
		armario.agregarSuperior(remera);
		armario.agregarSuperior(remera2);
		Scanner scan = new Scanner(System.in);
		int opcion;
		System.out.println("Si quiere generar un atuendo, pulse 0");
		opcion=scan.nextInt();
		atuendos.clear();
		while (opcion==0) {
		Atuendo atuendo = armario.crearAtuendo(armario);
		if (atuendos.stream().anyMatch(p-> p.equals(atuendo))) {
			opcion=0;
		}else {
			System.out.println(atuendo);
			System.out.println("Para seguir probando, ingrese 0");
			System.out.println("Para salir, ingrese 1");
			atuendos.add(atuendo);
			opcion=scan.nextInt();
		}	
		if(armario.chequeo(atuendos.size())) {
			System.out.println("No hay mas atuendos posibles");
			break;
		}
		
		}
		scan.close();
		}
		
	}
	

