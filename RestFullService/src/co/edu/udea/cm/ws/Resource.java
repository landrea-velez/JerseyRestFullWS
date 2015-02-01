package co.edu.udea.cm.ws;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.sun.jersey.spi.resource.Singleton;

@Path("resource")
@Produces("application/xml")
@Singleton
public class Resource {

	private TreeMap<Integer, Local> localMap = new TreeMap<Integer, Local>();

	public Resource() {
		Local local = new Local();
		local.setTipoLocal("Restaurante");
		local.setNomLocal("Restaurante Roldan");
		local.setDirLocal("Calle 67 Nº 53-108");
		local.setLatitLocal("6.26799");
		local.setLongiLocal("-75.5682");
		addLocal(local);
	}

	@GET
	public List<Local> getLocales() {
		List<Local> locales = new ArrayList<Local>();
		locales.addAll(localMap.values());
		return locales;
	}

	@GET
	@Path("{id}")
	public Local getLocal(@PathParam("id") int localId) {
		return localMap.get(localId);
	}

	@POST
	@Path("add")
	@Produces("text/plain")
	@Consumes("application/xml")
	public String addLocal(Local local) {
		int id = localMap.size();
		local.setId(id);
		localMap.put(id, local);
		return "Local \"" + local.getNomLocal() + "\" added with Id " + id;
	}

}