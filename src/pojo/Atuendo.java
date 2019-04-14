package pojo;

import prendas.Accesorio;
import prendas.Calzado;
import prendas.Inferior;
import prendas.Superior;

public class Atuendo {

Calzado calzado;
Inferior prendaInferior;
Superior prendaSuperior;
Accesorio accesorio;
	
public Atuendo(/*Calzado calzado, Inferior prendaInferior, Superior prendaSuperior, Accesorio accesorio*/) {
		/*super();
		this.calzado = calzado;
		this.prendaInferior = prendaInferior;
		this.prendaSuperior = prendaSuperior;
		this.accesorio = accesorio;*/
	}


@Override
public String toString() {
	return "Atuendo [calzado=" + calzado + ", prendaInferior=" + prendaInferior + ", prendaSuperior=" + prendaSuperior
			+ ", accesorio=" + accesorio + "]";
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Atuendo other = (Atuendo) obj;
	if (accesorio == null) {
		if (other.accesorio != null)
			return false;
	} else if (!accesorio.equals(other.accesorio))
		return false;
	if (calzado == null) {
		if (other.calzado != null)
			return false;
	} else if (!calzado.equals(other.calzado))
		return false;
	if (prendaInferior == null) {
		if (other.prendaInferior != null)
			return false;
	} else if (!prendaInferior.equals(other.prendaInferior))
		return false;
	if (prendaSuperior == null) {
		if (other.prendaSuperior != null)
			return false;
	} else if (!prendaSuperior.equals(other.prendaSuperior))
		return false;
	return true;
}


public Calzado getCalzado() {
	return calzado;
}
public void setCalzado(Calzado calzado) {
	this.calzado = calzado;
}
public Inferior getPrendaInferior() {
	return prendaInferior;
}
public void setPrendaInferior(Inferior prendaInferior) {
	this.prendaInferior = prendaInferior;
}
public Superior getPrendaSuperior() {
	return prendaSuperior;
}
public void setPrendaSuperior(Superior prendaSuperior) {
	this.prendaSuperior = prendaSuperior;
}
public Accesorio getAccesorio() {
	return accesorio;
}
public void setAccesorio(Accesorio accesorio) {
	this.accesorio = accesorio;
}

}
