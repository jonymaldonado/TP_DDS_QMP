package prendas;

public class Prenda {
String nombre;
int color;

public Prenda(String nombre, int color) {
	super();
	this.nombre = nombre;
	this.color = color;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Prenda other = (Prenda) obj;
	if (color != other.color)
		return false;
	if (nombre == null) {
		if (other.nombre != null)
			return false;
	} else if (!nombre.equals(other.nombre))
		return false;
	return true;
}

@Override
public String toString() {
	return nombre + ", color=" + color;
}

}
