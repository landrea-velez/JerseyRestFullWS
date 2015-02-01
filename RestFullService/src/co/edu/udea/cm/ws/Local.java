package co.edu.udea.cm.ws;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "local")
public class Local {

	private int id;
	private String nombreLocal;
	private String tipoLocal;
	private String dirLocal;
	private String latitLocal;
	private String longitLocal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomLocal() {
		return nombreLocal;
	}

	public void setNomLocal(String nombreLocal) {
		this.nombreLocal = nombreLocal;
	}

	public String getTipoLocal() {
		return tipoLocal;
	}

	public void setTipoLocal(String tipoLocal) {
		this.tipoLocal = tipoLocal;
	}

	public String getDirLocal() {
		return dirLocal;
	}

	public void setDirLocal(String dirLocal) {
		this.dirLocal = dirLocal;
	}
	
	public String getLatitLocal() {
		return latitLocal;
	}

	public void setLatitLocal(String latitLocal) {
		this.latitLocal = latitLocal;
	}
	
	public String getLongiLocal() {
		return longitLocal;
	}

	public void setLongiLocal(String longitLocal) {
		this.longitLocal = longitLocal;
	}

}