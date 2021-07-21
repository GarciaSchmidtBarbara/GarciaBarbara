package modelo;
import java.util.ArrayList;
import java.util.List;

public class SchoolYear {
	
	private int id;
	private String name;
	private List<Stuff> stuffs;
	
	
	public SchoolYear() {
		stuffs = new ArrayList<Stuff>();
	}
	public SchoolYear(int id, String name) {
		this.setId(id);
		this.setName(name);
		stuffs = new ArrayList<Stuff>();
	}
	
	
	public List<Stuff> getStuffs() {
		return stuffs;
	}
	public void setStuffs(List<Stuff> stuffs) {
		this.stuffs = stuffs;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuilder yearStuffBuild = new StringBuilder("Año: " + name + ". Materias: " );
		stuffs.stream().forEach(stuffs -> yearStuffBuild.append("\n - "+stuffs.getName()));
		return yearStuffBuild.toString();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void addStuff(int id, String name, String studyPlan) {
		Stuff st = new Stuff(id, name, studyPlan);
		stuffs.add(st);
		
	}
}
